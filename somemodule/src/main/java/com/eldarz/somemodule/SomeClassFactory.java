package com.eldarz.somemodule;

import android.content.Context;

public class SomeClassFactory {
    public static SomeClass CreateSomeClass(Context context){
        return DaggerSomeClassComponent.builder().contextModule(new ContextModule(context)).build().makeSomeClass();
    }
}
