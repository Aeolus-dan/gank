package com.witrecovery.gank;

import android.support.v4.app.Fragment;

import com.witrecovery.Constant;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;



/**
 * Created by Aeolus on 2017/12/18.
 */

public class App extends DaggerApplication implements HasSupportFragmentInjector{

    @Inject
    DispatchingAndroidInjector<Fragment> mFragmentSupportInjector;

    private static App mInstance;

    public static App getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize();
    }

    private void initialize() {
        mInstance = this;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return null;
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return mFragmentSupportInjector;
    }

}
