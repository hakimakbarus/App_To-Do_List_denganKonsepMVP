package com.hakim.appto_dolist.modul.list_todo;

import com.hakim.appto_dolist.base.BasePresenter;
import com.hakim.appto_dolist.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ListToDoContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
        void redirectToForm();
//        void showProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogout();
    }
}
