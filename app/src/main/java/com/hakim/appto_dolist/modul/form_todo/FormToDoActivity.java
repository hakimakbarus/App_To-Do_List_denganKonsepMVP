package com.hakim.appto_dolist.modul.form_todo;

import android.view.Menu;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import com.hakim.appto_dolist.R;
import com.hakim.appto_dolist.base.BaseFragmentHolderActivity;


public class FormToDoActivity extends BaseFragmentHolderActivity {
    FormToDoFragment formTodoFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.VISIBLE);
        btUser.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);


        formTodoFragment = new FormToDoFragment();
        setCurrentFragment(formTodoFragment, false);
        //((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        //setHasOptionsMenu(true);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formTodoFragment.redirectToLists();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_ops1, menu);
        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    public Toolbar getToolbar() { return mToolbar; }
}
