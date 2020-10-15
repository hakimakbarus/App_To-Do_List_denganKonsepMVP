package com.hakim.appto_dolist.modul.form_todo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.hakim.appto_dolist.R;
import com.hakim.appto_dolist.base.BaseFragment;
import com.hakim.appto_dolist.modul.list_todo.ListToDoActivity;
import com.hakim.appto_dolist.modul.profile.ProfileActivity;

//import com.hakim.belajaractivity.FirstActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class FormToDoFragment extends BaseFragment<FormToDoActivity, FormToDoContract.Presenter> implements FormToDoContract.View {

    Bundle profile;

    public FormToDoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_form_todo, container, false);
        Toolbar toolbar = ((FormToDoActivity) getActivity()).getToolbar();
        //((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        setHasOptionsMenu(true);
        mPresenter = new FormToDoPresenter(this);
        mPresenter.start();

        profile = getActivity().getIntent().getExtras();

        setTitle("To-Do List");

        return fragmentView;
    }

    @Override
    public void setPresenter(FormToDoContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        //getActivity().getMenuInflater().inflate(R.menu.menu_ops1, menu);
        menu.clear();
        inflater.inflate(R.menu.menu_ops1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void redirectToLists() {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(activity, ListToDoActivity.class);
        intent.putExtras(profile);

        startActivity(intent);
        activity.finish();
    }
}
