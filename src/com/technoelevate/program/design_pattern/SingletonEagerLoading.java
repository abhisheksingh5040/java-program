package com.technoelevate.program.design_pattern;

public class SingletonEagerLoading {

    private SingletonEagerLoading() {
    }

    private static SingletonEagerLoading instance = new SingletonEagerLoading();

    public static SingletonEagerLoading getInstance() {
        return instance;
    }
}
