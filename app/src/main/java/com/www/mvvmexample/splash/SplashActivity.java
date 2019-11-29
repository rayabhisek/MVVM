package com.www.mvvmexample.splash;

import android.content.Intent;
import android.os.Bundle;

import com.www.mvvmexample.BR;
import com.www.mvvmexample.MainActivity;
import com.www.mvvmexample.R;
import com.www.mvvmexample.ViewModelProviderFactory;
import com.www.mvvmexample.ui.base.BaseActivity;
import com.www.mvvmexample.ui.base.BaseViewModel;
import com.www.mvvmexample.ui.splash.SplashNavigator;
import com.www.mvvmexample.ui.splash.SplashViewModel;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;


public class SplashActivity extends BaseActivity implements SplashNavigator {

    @Inject
    ViewModelProviderFactory factory;

    private SplashViewModel mSplashViewModel;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public BaseViewModel getViewModel() {
        mSplashViewModel = ViewModelProviders.of(this,factory).get(SplashViewModel.class);
        return mSplashViewModel;
    }

    @Override
    public void openLoginActivity() {


    }

    @Override
    public void openMainActivity() {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSplashViewModel.setNavigator(this);
        mSplashViewModel.startSeeding();
    }
}
