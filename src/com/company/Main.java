package com.company;
import com.company.model.Student;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
//
//        students.firstName = "Volha";
//        students.lastName =  "Kyzhal";
//        students.age = 22;

        Group group1 = new Group();
        group1.addStudent(student1);
        group1.printInformation();
        student1.doHomework(5);
        student1.homeworkDone();
        student1.birthday();
        student1.greet();
        System.out.println(student1.getCountHW());
    }
}
