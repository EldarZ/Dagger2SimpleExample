package com.eldarz.additionallib;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ezilberm on 9/10/2017.
 */

@Module(includes = DependencyClassModule.class)
class SomeClassModule {
    @Singleton
    @Provides
    public SomeClass provideSomeClass(DependencyClass dependencyClass){
        return new SomeClassImpl(dependencyClass);
    }
}
