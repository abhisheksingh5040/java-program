package com.technoelevate.program.design_pattern;

public class Product {

    private String id;
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Product{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", salary=" + salary +
            '}';
    }

    public static class Builder {

        private Product product = new Product();

        public Builder id(String id) {
            product.id = id;
            return this;
        }

        public Builder name(String name) {
            product.name = name;
            return this;
        }

        public Builder age(int age) {
            product.age = age;
            return this;
        }

        public Builder salary(double salary) {
            product.salary = salary;
            return this;
        }

        public Product build() {
            return this.product;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
