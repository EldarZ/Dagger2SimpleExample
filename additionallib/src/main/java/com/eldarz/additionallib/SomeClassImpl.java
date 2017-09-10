package com.eldarz.additionallib;

import javax.inject.Inject;

/**
 * Created by ezilberm on 9/7/2017.
 */

class SomeClassImpl implements SomeClass {
    private DependencyClass mDependencyClass;

    @Inject
    public SomeClassImpl(DependencyClass dependencyClass){
        mDependencyClass = dependencyClass;
    }

    @Override
    public String getMessage() {
        return mDependencyClass.getMessage();
    }
}
