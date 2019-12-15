package com.company;

public class Human {
    String firstName;
    String lastName;
    int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if(age>0 && age<100){
        this.age = age;
        } else {
            System.out.println("You enter incorrect data.");
        }
    }

    public void greet(){
        System.out.print("Hello! My name is " + firstName);
    }
}
