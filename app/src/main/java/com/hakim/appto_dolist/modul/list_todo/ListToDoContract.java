package com.hakim.appto_dolist.modul.list_todo;

import com.hakim.appto_dolist.base.BasePresenter;
import com.hakim.appto_dolist.base.BaseView;
import com.hakim.appto_dolist.data.model.Task;

import java.util.ArrayList;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ListToDoContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
        void gotoNewTask();
        void redirectToForm();
//        void showProfile();
    }

    interface Presenter extends BasePresenter {
        ArrayList<Task> getDataSet();
        void performLogout();
    }
}
