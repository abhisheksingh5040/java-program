package com.technoelevate.program.design_pattern;

public class Main {

    public static void main(String[] args) {
        Product build = Product.builder().id("1").age(28).build();
        System.out.println(build);
    }
}
