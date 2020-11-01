package com.hakim.appto_dolist.modul.list_todo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.hakim.appto_dolist.R;
import com.hakim.appto_dolist.base.BaseFragment;
import com.hakim.appto_dolist.data.model.Task;
import com.hakim.appto_dolist.modul.edit_list_todo.EditListToDoActivity;
import com.hakim.appto_dolist.modul.form_todo.FormToDoActivity;
import com.hakim.appto_dolist.modul.login.LoginActivity;
import com.hakim.appto_dolist.modul.new_list_todo.NewListToDoActivity;
import com.hakim.appto_dolist.modul.profile.ProfileActivity;
import com.hakim.appto_dolist.utils.RecyclerViewAdapterTodolist;

import java.util.ArrayList;

//import com.hakim.belajaractivity.FirstActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class ListToDoFragment extends BaseFragment<ListToDoActivity, ListToDoContract.Presenter> implements ListToDoContract.View {

    Bundle profile;
    Button btAddNew;
    RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public ListToDoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_lists_todo, container, false);
        //Toolbar toolbar = ((ListToDoActivity) getActivity()).getToolbar();
        //((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        //setHasOptionsMenu(true);
        mPresenter = new ListToDoPresenter(this);
        mPresenter.start();

        profile = getActivity().getIntent().getExtras();

        mRecyclerView = fragmentView.findViewById(R.id.recyclerViewTodolist);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(activity);
        mRecyclerView.setLayoutManager(mLayoutManager);
        final ArrayList<Task> data = mPresenter.getDataSet();
        mAdapter = new RecyclerViewAdapterTodolist(data);
        mRecyclerView.setAdapter(mAdapter);

        Log.d("Data", "Data : ++++++++++++++++++++++++++++++++++");
        Log.d("Data 1", data.get(3).getTitle());

        setTitle("To-Do List");

        btAddNew = fragmentView.findViewById(R.id.bt_addNewLists);
        btAddNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoNewTask();
            }
        });

        ((RecyclerViewAdapterTodolist) mAdapter).setOnItemClickListener(new RecyclerViewAdapterTodolist.MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                String id = data.get(position).getId();
                Log.d("BELAJAR ACTIVITY",">>>>>"+ position);
                editTask(id);
            }
        });

        return fragmentView;
    }

    @Override
    public void setPresenter(ListToDoContract.Presenter presenter) {
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
    public void redirectToForm() {
        Intent intent = new Intent(activity, FormToDoActivity.class);
        intent.putExtras(profile);

        startActivity(intent);
        activity.finish();
    }

    @Override
    public void redirectToProfile() {
        Bundle bundle = new Bundle();
        Intent intent = new Intent(activity, ProfileActivity.class);
        intent.putExtras(profile);

        startActivity(intent);
        activity.finish();
    }

    @Override
    public void gotoNewTask() {
        Intent intent = new Intent(activity, NewListToDoActivity.class);
        startActivity(intent);
    }

    public void editTask(String id) {
        Intent intent = new Intent(activity, EditListToDoActivity.class);
        intent.putExtra("TaskId", id);
        startActivity(intent);
    }

}
