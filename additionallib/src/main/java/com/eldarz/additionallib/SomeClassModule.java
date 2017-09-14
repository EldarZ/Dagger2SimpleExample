package com.eldarz.additionallib;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ezilberm on 9/10/2017.
 */

@Module(includes = DependencyClassModule.class)
class SomeClassModule {
    @Provides
    public SomeClass provideSomeClass(DependencyClass dependencyClass){
        return new SomeClassImpl(dependencyClass);
    }
}
