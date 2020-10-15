package com.hakim.appto_dolist.modul.login;

import com.hakim.appto_dolist.base.BasePresenter;
import com.hakim.appto_dolist.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
        void redirectToMainList();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
