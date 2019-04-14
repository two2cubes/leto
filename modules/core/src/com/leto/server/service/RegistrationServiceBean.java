package com.leto.server.service;

import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.security.entity.Group;
import com.haulmont.cuba.security.entity.Role;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.entity.UserRole;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.UUID;

@Service(RegistrationService.NAME)
public class RegistrationServiceBean implements RegistrationService {

    private static final String COMPANY_GROUP_ID = "0fa2b1a5-1d68-4d69-9fbd-dff348347f93";

    private static final String DEFAULT_ROLE_ID = "3ec31528-dc0e-c341-7727-7b46771ae9ff";

    @Inject
    private DataManager dataManager;

    @Inject
    private Metadata metadata;

    @Inject
    private PasswordEncryption passwordEncryption;

    @Override
    public RegistrationResult registerUser(String login, String password) {

        Group group = dataManager.load(LoadContext.create(Group.class).setId(UUID.fromString(COMPANY_GROUP_ID)));
        Role role = dataManager.load(LoadContext.create(Role.class).setId(UUID.fromString(DEFAULT_ROLE_ID)));

        User user = metadata.create(User.class);
        user.setLogin(login);
        user.setPassword(passwordEncryption.getPasswordHash(user.getId(), password));

        user.setGroup(group);

        UserRole userRole = metadata.create(UserRole.class);
        userRole.setUser(user);
        userRole.setRole(role);

        dataManager.commit(new CommitContext(user, userRole));

        return new RegistrationResult(user);
    }
}