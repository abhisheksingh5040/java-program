package com.technoelevate.program.design_pattern;

public class SingletonLazyLoading {

    private SingletonLazyLoading() {
    }

    private static SingletonLazyLoading instance;

    public static SingletonLazyLoading getInstance() {

        if (instance == null) {
            synchronized (SingletonLazyLoading.class) {
                instance = new SingletonLazyLoading();
            }
        }
        return instance;
    }
}
