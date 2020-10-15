package com.hakim.appto_dolist.modul.profile;

import com.hakim.appto_dolist.base.BasePresenter;
import com.hakim.appto_dolist.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void redirectToLogin();
        void redirectToLists();
        void showProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogout();
    }
}
