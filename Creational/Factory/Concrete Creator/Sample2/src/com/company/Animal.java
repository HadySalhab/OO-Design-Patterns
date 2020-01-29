package com.company;

public interface Animal {
    public void talk();
}
class Tiger implements Animal{
    @Override
    public void talk() {
        System.out.println("Tiger is talking");
    }
}
class Bird implements Animal{
    @Override
    public void talk() {
        System.out.println("Bird is talking");
    }
}
class Dog implements Animal{
    @Override
    public void talk() {
        System.out.println("Dog is talking");
    }
}
