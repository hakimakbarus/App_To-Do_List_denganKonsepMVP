package com.hakim.appto_dolist.modul.edit_list_todo;

import android.view.View;

import com.hakim.appto_dolist.base.BaseFragmentHolderActivity;


public class EditListToDoActivity extends BaseFragmentHolderActivity {
    EditListToDoFragment editTaskFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        editTaskFragment = new EditListToDoFragment();
        String id = getIntent().getExtras().getString("TaskId");
        editTaskFragment.setId(id);
        setCurrentFragment(editTaskFragment, false);

    }




}
