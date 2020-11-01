package com.hakim.appto_dolist.modul.edit_list_todo;

import com.hakim.appto_dolist.data.model.Task;

/**
 * Created by fahrul on 13/03/19.
 */

public class EditListToDoPresenter implements EditListToDoContract.Presenter{
    private final EditListToDoContract.View view;

    public EditListToDoPresenter(EditListToDoContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {
    }

    @Override
    public void saveData(final String title, final String description){
        Task newTask = new Task("3", title, description);
        //save new task
        //then go back to task list
        view.redirectToTaskList();
    }

    @Override
    public void loadData(String id) {
        //load data task by id
        //then send data to fragment
        Task task = new Task("3", "title of taskIndex:"+id, "description of taskIndex:"+id);
        view.showData(task);
    }

}
