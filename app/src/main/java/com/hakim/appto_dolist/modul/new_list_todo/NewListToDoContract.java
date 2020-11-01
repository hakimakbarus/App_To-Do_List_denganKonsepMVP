package com.hakim.appto_dolist.modul.new_list_todo;

import com.hakim.appto_dolist.base.BasePresenter;
import com.hakim.appto_dolist.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface NewListToDoContract {
    interface View extends BaseView<Presenter> {
        void redirectToTaskList();
    }

    interface Presenter extends BasePresenter {
        void saveData(String title, String description);
    }
}
