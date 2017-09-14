package com.eldarz.somemodule;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
class DependencyClassModule {
    private final Context mContext;

    public DependencyClassModule(Context context){
        mContext = context;
    }

    @Provides
    public DependencyClass provideDependencyClass(){
        return new DependencyClassImpl(mContext);
    }
}
