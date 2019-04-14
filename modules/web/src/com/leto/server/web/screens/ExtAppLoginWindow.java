package com.leto.server.web.screens;

import com.haulmont.cuba.gui.WindowManager.OpenType;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.web.app.loginwindow.AppLoginWindow;
import com.leto.server.web.register.RegisterScreen;
import com.leto.server.web.restorepassword.RestorePasswordScreen;

import javax.inject.Inject;

public class ExtAppLoginWindow extends AppLoginWindow {

    @Inject
    private Button loginButton;

    public void onRegisterBtnClick() {
        RegisterScreen registerScreen = (RegisterScreen) openWindow("register-screen", OpenType.DIALOG);
        registerScreen.addCloseWithCommitListener(() -> {
           loginField.setValue(registerScreen.getLogin());
           passwordField.setValue(registerScreen.getPassword());
           loginButton.requestFocus();
        });
    }

    public void onRestorePasswordBtnClick() {
        RestorePasswordScreen restorePasswordScreen = (RestorePasswordScreen) openWindow("restore-password-screen", OpenType.DIALOG);
        restorePasswordScreen.addCloseWithCommitListener(() -> {
            loginField.setValue(restorePasswordScreen.getLogin());
            passwordField.setValue(null);
            passwordField.requestFocus();
        });
    }
}