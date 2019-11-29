package com.www.mvvmexample.login;

import android.os.Bundle;

import com.www.mvvmexample.ui.base.BaseActivity;
import com.www.mvvmexample.ui.base.BaseViewModel;
import com.www.mvvmexample.ui.login.LoginNavigator;

import androidx.annotation.Nullable;

public class LoginActivity extends BaseActivity implements LoginNavigator {
    @Override
    public int getBindingVariable() {
        return 0;
    }

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public BaseViewModel getViewModel() {
        return null;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
