package com.cs4u.creational.singleton;

/**
 * In eager initialization, the instance of the class is created at the time of class loading. The drawback to the eager initialization is that the method is created
 * even though the client application might not be using it.
 */

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

/**
 * If your singleton class is not using a lot of resources, this is the approach to use. But in most of the scenarios, singleton classes are created for
 * resources such as FileSystem, Database connections, etc
 * We should avoid the instantiation unless the client calls getInstance method. Also, this method does not provide
 * any options for exception handling
 */