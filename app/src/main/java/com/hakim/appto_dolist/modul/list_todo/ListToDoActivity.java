package com.hakim.appto_dolist.modul.list_todo;

import android.view.Menu;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import com.hakim.appto_dolist.R;
import com.hakim.appto_dolist.base.BaseFragmentHolderActivity;


public class ListToDoActivity extends BaseFragmentHolderActivity {
    ListToDoFragment listToDoFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btUser.setVisibility(View.VISIBLE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);


        listToDoFragment = new ListToDoFragment();
        setCurrentFragment(listToDoFragment, false);
        //((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        //setHasOptionsMenu(true);

        btUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listToDoFragment.redirectToProfile();
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
