package com.hakim.appto_dolist.modul.edit_list_todo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.hakim.appto_dolist.R;
import com.hakim.appto_dolist.base.BaseFragment;
import com.hakim.appto_dolist.data.model.Task;
import com.hakim.appto_dolist.modul.list_todo.ListToDoActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class EditListToDoFragment extends BaseFragment<EditListToDoActivity, EditListToDoContract.Presenter> implements EditListToDoContract.View {

    EditText etTaskTitle;
    EditText etTaskDescription;
    Button btnSave;
    String id;


    public EditListToDoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_form_todo, container, false);
        mPresenter = new EditListToDoPresenter(this);
        mPresenter.start();

        etTaskTitle = fragmentView.findViewById(R.id.tif_judul);
        etTaskDescription = fragmentView.findViewById(R.id.tif_deskripsi);
        btnSave = fragmentView.findViewById(R.id.btn_submit);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtSaveClick();
            }
        });

        setTitle("Add New Task");
        mPresenter.loadData(this.id);

        return fragmentView;
    }

    public void setBtSaveClick(){
        String title = etTaskTitle.getText().toString();
        String description = etTaskDescription.getText().toString();
        mPresenter.saveData(title,description);
    }

    @Override
    public void setPresenter(EditListToDoContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToTaskList() {
            Intent intent = new Intent(activity, ListToDoActivity.class);
            startActivity(intent);
            activity.finish();
    }

    @Override
    public void showData(Task task) {
        this.etTaskTitle.setText(task.getTitle());
        this.etTaskDescription.setText(task.getDescription());
    }

    @Override
    public void setId(String id) {
        this.id=id;
    }

}
