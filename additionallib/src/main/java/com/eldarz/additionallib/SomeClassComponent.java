package com.eldarz.additionallib;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ezilberm on 9/10/2017.
 */

@Singleton
@Component(modules = { SomeClassModule.class })
interface SomeClassComponent {
    SomeClass make();
}
