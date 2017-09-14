package com.eldarz.somemodule;

import android.content.Context;

public class SomeClassFactory {
    public static SomeClass CreateSomeClass(Context context){
        return DaggerSomeClassComponent.builder()
                .dependencyClassModule(new DependencyClassModule(context)).build().makeSomeClass();
    }
}
