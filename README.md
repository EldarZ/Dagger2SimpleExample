# [Dagger2](https://github.com/google/dagger) simple example
This example demonstrates how to use dagger2 for production Android archive module (aar). 
The application is using the [production code](app/src/main/java/com/eldarz/dagger2simpleexample/MainActivity.java) from the aar, while the [test](somemodule/src/test/java/com/eldarz/somemodule/SomeClassUnitTests.java) inject a mock dependency.

SomeModule is your procution module, [SomeClass](somemodule/src/main/java/com/eldarz/somemodule/SomeClass.java) is a class from your production module that has an internal dependency, [DependencyClass](somemodule/src/main/java/com/eldarz/somemodule/DependencyClass.java),  that you would like to mock in your tests.
