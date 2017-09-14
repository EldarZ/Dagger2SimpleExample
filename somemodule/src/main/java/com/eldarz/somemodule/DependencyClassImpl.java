package com.eldarz.somemodule;

import android.content.Context;

class DependencyClassImpl implements DependencyClass {
    private final Context mContext;

    public DependencyClassImpl(Context context){
        mContext = context;
    }

    @Override
    public String getMessage() {
        return "Prodaction code, " + mContext.getPackageName();
    }
}
