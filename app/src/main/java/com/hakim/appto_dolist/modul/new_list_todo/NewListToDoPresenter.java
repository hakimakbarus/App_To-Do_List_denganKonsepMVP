package com.hakim.appto_dolist.modul.new_list_todo;

import com.hakim.appto_dolist.data.model.Task;

/**
 * Created by fahrul on 13/03/19.
 */

public class NewListToDoPresenter implements NewListToDoContract.Presenter{
    private final NewListToDoContract.View view;

    public NewListToDoPresenter(NewListToDoContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void saveData(final String title, final String description){
        Task newTask = new Task("3", title, description);
        //save new task
        //then go back to task list
        view.redirectToTaskList();
    }

}
