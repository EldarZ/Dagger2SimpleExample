package com.eldarz.additionallib;

import android.content.Context;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ezilberm on 9/10/2017.
 */

@Module
class DependencyClassModule {
    private Context mContext;

    public DependencyClassModule(Context context){
        mContext = context;
    }

    @Provides
    public DependencyClass provideDependencyClass(){
        return new DependencyClassImpl(mContext);
    }
}
