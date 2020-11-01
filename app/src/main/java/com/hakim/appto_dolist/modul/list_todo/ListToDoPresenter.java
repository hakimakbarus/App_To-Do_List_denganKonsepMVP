package com.hakim.appto_dolist.modul.list_todo;

import com.hakim.appto_dolist.data.model.Task;

import java.util.ArrayList;

/**
 * Created by fahrul on 13/03/19.
 */

public class ListToDoPresenter implements ListToDoContract.Presenter{
    private final ListToDoContract.View view;



    public ListToDoPresenter(ListToDoContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public ArrayList<Task> getDataSet() {
        //get Data from DB
        ArrayList<Task> data = new ArrayList<Task> ();
        data.add(new Task("1","Task 1", "Kerjakan task satu"));
        data.add(new Task("2", "Task 2", "Kerjakan task dua"));
        data.add(new Task("3", "Task 3", "Kerjakan task tiga"));
        data.add(new Task("4", "Task 4", "Kerjakan task empat"));
        return data;
    }

    @Override
    public void performLogout(){
        //proses login
        //if login success call redirect to profile
        //view.redirectToLogin();
    }

}
