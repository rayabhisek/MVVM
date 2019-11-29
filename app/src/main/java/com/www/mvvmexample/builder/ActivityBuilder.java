package com.www.mvvmexample.builder;

import com.www.mvvmexample.ui.splash.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder{

    @ContributesAndroidInjector
    abstract SplashActivity bindSplashActivity();
}
