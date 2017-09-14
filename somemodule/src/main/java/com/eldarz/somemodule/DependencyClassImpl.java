package com.eldarz.somemodule;

import android.content.Context;

import javax.inject.Inject;

class DependencyClassImpl implements DependencyClass {
    private final Context mContext;

    @Inject
    public DependencyClassImpl(Context context){
        mContext = context;
    }

    @Override
    public String getMessage() {
        return "Prodaction code, " + mContext.getPackageName();
    }
}
