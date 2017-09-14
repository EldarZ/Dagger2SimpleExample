package com.eldarz.somemodule;

import javax.inject.Inject;

class SomeClassImpl implements SomeClass {
    private final DependencyClass mDependencyClass;

    @Inject
    public SomeClassImpl(DependencyClass dependencyClass){
        mDependencyClass = dependencyClass;
    }

    @Override
    public String getMessage() {
        return mDependencyClass.getMessage();
    }
}
