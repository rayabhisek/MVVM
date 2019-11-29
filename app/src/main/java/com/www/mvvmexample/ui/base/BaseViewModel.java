package com.www.mvvmexample.ui.base;

import com.www.mvvmexample.ui.splash.SplashActivity;

import java.lang.ref.WeakReference;

import androidx.lifecycle.ViewModel;

public class BaseViewModel<N> extends ViewModel {


    private WeakReference<N> mNavigator;

    public BaseViewModel() {
    }


    public N getNavigator() {
        return mNavigator.get();
    }

    public void setNavigator(N navigator) {
        this.mNavigator = new WeakReference<>(navigator);
    }
}
