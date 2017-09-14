package com.eldarz.somemodule;

import dagger.Module;
import dagger.Provides;

@Module(includes = DependencyClassModule.class)
class SomeClassModule {
    @Provides
    public SomeClass provideSomeClass(DependencyClass dependencyClass){
        return new SomeClassImpl(dependencyClass);
    }
}
