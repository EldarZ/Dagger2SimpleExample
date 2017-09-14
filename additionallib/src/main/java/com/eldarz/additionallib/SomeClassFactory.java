package com.eldarz.additionallib;

import android.content.Context;

/**
 * Created by ezilberm on 9/10/2017.
 */

public class SomeClassFactory {
    public static SomeClass CreateSomeClass(Context context){
        return DaggerSomeClassComponent.builder()
                .dependencyClassModule(new DependencyClassModule(context)).build().makeSomeClass();
    }
}
