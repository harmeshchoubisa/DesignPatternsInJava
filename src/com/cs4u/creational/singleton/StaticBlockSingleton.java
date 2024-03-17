package com.cs4u.creational.singleton;

/**
 * Static block initialization is similar to Eager initialization, except that instance of the class is created in static block
 * and that provides the option for exception handling.
 */

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception exception) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public StaticBlockSingleton getInstance() {
        return instance;
    }
}

/**
 * Both eager and static block initialization create the instance even before it's being used and that is not the best
 * practise to use.
 */
