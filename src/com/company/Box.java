package com.company;

public class Box <T> {
    private T age;

    public Box() {
    }

    public Box(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
    
       static <T> Box num(){
        return new Box(18);
}
    @Override
    public String toString() {
        return "Box: " +
                "age = " + age ;
    }
}
