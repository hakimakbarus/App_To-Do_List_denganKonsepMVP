package com.hakim.appto_dolist.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
//import com.hakim.belajaractivity.FirstActivity;
import com.hakim.appto_dolist.R;
import com.hakim.appto_dolist.base.BaseFragment;
import com.hakim.appto_dolist.modul.list_todo.ListToDoActivity;
import com.hakim.appto_dolist.modul.login.LoginActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {

    TextView tvEmail;
    TextView tvPassword;
    ImageButton bBack;
    Bundle profile;


    public ProfileFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();

        tvEmail = fragmentView.findViewById(R.id.tv_email);
        tvPassword = fragmentView.findViewById(R.id.tv_password);
        bBack = fragmentView.findViewById(R.id.btBack);

        setTitle("Profile");
        showProfile();

        return fragmentView;
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToLogin() {
            Intent intent = new Intent(activity, LoginActivity.class);
            startActivity(intent);
            activity.finish();
    }

    @Override
    public void redirectToLists() {
        Intent intent = new Intent(activity, ListToDoActivity.class);
        intent.putExtras(profile);

        startActivity(intent);
        activity.finish();
    }

    @Override
    public void showProfile() {
        if(getActivity().getIntent().getExtras() != null) {
            Bundle bundle = getActivity().getIntent().getExtras();
            profile = bundle;
            tvEmail.setText(bundle.getString("email"));
            tvPassword.setText(bundle.getString("password"));
        }
    }


}
