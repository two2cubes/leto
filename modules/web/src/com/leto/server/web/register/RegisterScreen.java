package com.leto.server.web.register;

import com.haulmont.cuba.core.global.validation.MethodParametersValidationException;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.PasswordField;
import com.haulmont.cuba.gui.components.TextField;
import com.leto.server.service.RegistrationService;

import javax.inject.Inject;

public class RegisterScreen extends AbstractWindow {

    @Inject
    private TextField loginField;

    @Inject
    private PasswordField passwordField;

    @Inject
    private RegistrationService registrationService;

    public void onOkBtnClick() {
        try {
            registrationService.registerUser(getLogin(), getPassword());
            showNotification("Created user " + getLogin(), NotificationType.TRAY);
            close(CLOSE_ACTION_ID);
        } catch (MethodParametersValidationException e) {
            showNotification(messages.getMessage("com.leto.server.validation", "UserExistsValidator.message"),
                    NotificationType.TRAY);
        }
    }

    public void onCancelBtnClick() {
        close(CLOSE_ACTION_ID);
    }

    public String getLogin() {
        return loginField.getRawValue();
    }

    public String getPassword() {
        return passwordField.getValue();
    }
}