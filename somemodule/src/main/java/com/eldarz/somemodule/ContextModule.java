package com.eldarz.somemodule;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

@Module
class ContextModule {
    private final Context mContext;
    public ContextModule(Context context){
        mContext = context;
    }

    @Provides
    public Context provideContext(){ return mContext; }
}
