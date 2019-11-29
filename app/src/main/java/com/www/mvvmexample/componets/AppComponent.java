package com.www.mvvmexample.componets;

import android.app.Application;

import com.www.mvvmexample.MvvmApp;
import com.www.mvvmexample.di.builder.ActivityBuilder;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class,ActivityBuilder.class})
public interface AppComponent {

    void inject(MvvmApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
