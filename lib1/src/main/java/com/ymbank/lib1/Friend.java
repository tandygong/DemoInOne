package com.ymbank.lib1;

public class Friend {
    public String getName() {
        return new Parent().getName();
    }
    public int getAge() {
        return new Parent().getAge();
    }
}
