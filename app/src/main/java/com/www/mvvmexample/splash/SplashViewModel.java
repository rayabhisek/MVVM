package com.www.mvvmexample.splash;

import android.os.Handler;

import com.www.mvvmexample.ui.base.BaseViewModel;
import com.www.mvvmexample.ui.splash.SplashNavigator;


public class SplashViewModel extends BaseViewModel<SplashNavigator> {

    public SplashViewModel() {
    }


    public void startSeeding() {

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                getNavigator().openMainActivity();
            }
        }, 5000);


    }


}
