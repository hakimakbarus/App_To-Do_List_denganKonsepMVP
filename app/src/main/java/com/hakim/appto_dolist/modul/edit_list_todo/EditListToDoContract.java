package com.hakim.appto_dolist.modul.edit_list_todo;

import com.hakim.appto_dolist.base.BasePresenter;
import com.hakim.appto_dolist.base.BaseView;
import com.hakim.appto_dolist.data.model.Task;

/**
 * Created by fahrul on 13/03/19.
 */

public interface EditListToDoContract {
    interface View extends BaseView<Presenter> {
        void redirectToTaskList();
        void showData(Task task);
        void setId(String id);
    }

    interface Presenter extends BasePresenter {
        void saveData(String title, String description);
        void loadData(String id);
    }
}
