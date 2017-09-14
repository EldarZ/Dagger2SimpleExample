package com.eldarz.somemodule;

import dagger.Binds;
import dagger.Module;

@Module(includes = DependencyClassModule.class)
abstract class SomeClassModule {
    @Binds
    public abstract SomeClass provideSomeClass(SomeClassImpl someClass);
}
