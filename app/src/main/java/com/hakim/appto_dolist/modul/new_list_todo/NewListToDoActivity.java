package com.hakim.appto_dolist.modul.new_list_todo;

import android.view.View;

import com.hakim.appto_dolist.base.BaseFragmentHolderActivity;


public class NewListToDoActivity extends BaseFragmentHolderActivity {
    NewListToDoFragment newListToDoFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        newListToDoFragment = new NewListToDoFragment();
        setCurrentFragment(newListToDoFragment, false);

    }




}
