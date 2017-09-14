package com.eldarz.somemodule;

import dagger.Component;

@Component(modules = { SomeClassModule.class })
interface SomeClassComponent {
    SomeClass makeSomeClass();
}
