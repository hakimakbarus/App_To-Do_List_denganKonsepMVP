package com.hakim.appto_dolist.modul.list_todo;

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
    public void performLogout(){
        //proses login
        //if login success call redirect to profile
        //view.redirectToLogin();
    }

}
