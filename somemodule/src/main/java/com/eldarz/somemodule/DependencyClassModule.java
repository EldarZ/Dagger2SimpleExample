package com.eldarz.somemodule;

import dagger.Binds;
import dagger.Module;

@Module(includes = ContextModule.class)
abstract class DependencyClassModule {
    @Binds
    public abstract DependencyClass provideDependencyClass(DependencyClassImpl dependencyClass);
}
