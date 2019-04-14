package com.leto.server.web.restorepassword;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.View;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.security.app.UserManagementService;
import com.haulmont.cuba.security.entity.User;

import javax.inject.Inject;
import java.util.Collections;

public class RestorePasswordScreen extends AbstractWindow {

    @Inject
    private UserManagementService userManagementService;

    @Inject
    private DataManager dataManager;

    @Inject
    private TextField<String> loginField;

    @Inject
    private Label<String> warningLabel;

    public void onSendPasswordBtnClick() {
        if (validateAll()) {
            LoadContext<User> lc = LoadContext.create(User.class);
            lc.setView(View.MINIMAL);
            lc.setQueryString("select u from sec$User u where u.loginLowerCase = :login and (u.active = true or u.active is null)")
                .setParameter("login", loginField.getValue());

            User targetUser = dataManager.load(lc);
            if (targetUser == null) {
                warningLabel.setVisible(true);
                loginField.requestFocus();
            } else {
                userManagementService.changePasswordsAtLogonAndSendEmails(Collections.singletonList(targetUser.getId()));
                showNotification("Success", "E-mail with password has been sent",
                        NotificationType.TRAY);
                close(COMMIT_ACTION_ID);
            }
        }
    }

    public void onCancelBtnClick() {
        close(CLOSE_ACTION_ID);
    }

    public String getLogin() {
        return loginField.getValue();
    }
}