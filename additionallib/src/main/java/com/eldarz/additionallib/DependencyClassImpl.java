package com.eldarz.additionallib;

import android.content.Context;

/**
 * Created by ezilberm on 9/10/2017.
 */

class DependencyClassImpl implements DependencyClass {
    private Context mContext;

    public DependencyClassImpl(Context context){
        mContext = context;
    }

    @Override
    public String getMessage() {
        return "Prodaction code, " + mContext.getPackageName();
    }
}
