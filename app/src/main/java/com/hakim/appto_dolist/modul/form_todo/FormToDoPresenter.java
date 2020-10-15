package com.hakim.appto_dolist.modul.form_todo;

/**
 * Created by fahrul on 13/03/19.
 */

public class FormToDoPresenter implements FormToDoContract.Presenter{
    private final FormToDoContract.View view;



    public FormToDoPresenter(FormToDoContract.View view) {
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
