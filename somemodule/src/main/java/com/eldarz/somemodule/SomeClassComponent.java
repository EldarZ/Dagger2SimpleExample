package com.eldarz.somemodule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { SomeClassModule.class })
interface SomeClassComponent {
    SomeClass makeSomeClass();
}
