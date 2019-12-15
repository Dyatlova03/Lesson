package com.company.model;

import com.company.Human;
import java.util.Scanner;

public class Student extends Human {

    private boolean[] homeWork = new boolean[10];
    private int countHW = 0;
    private static int countStudent = 0;
    private int[] doneHomework = new int[10];

    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        setFirstName(scanner.nextLine());
        System.out.println("Enter your last name:");
        setLastName(scanner.nextLine());
        System.out.println("Enter your age:");
        setAge(scanner.nextInt());
        countStudent++;
    }
    public int getCountHW(){
        return countHW;
    }

    public boolean[] getHomeWork(){ //для типа boolean не меняется (при этом, вместо set - is)
        return homeWork;
    }

    public int[] getDoneHomework(){
        return doneHomework;
    }

    public void printInformation(){
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getAge());
    }

    public void birthday(){
        setAge(getAge() + 1);
        System.out.println(getAge());
    }

    public void doHomework(int doHW){
            homeWork[doHW] = true;
        countHW++;
    }

    public int[] homeworkDone(){
        //какие домашки сделаны
        for (int i = 0; i < homeWork.length; i++) {
            if(homeWork[i]==true){
                for (int j = 0; j < doneHomework.length; j++) {
                    doneHomework[j] = i;
                }
            }
        }
        return doneHomework;
    }


    static int NumberOfStudents(){  //количество студентов в группе
        System.out.println(countStudent);
        return countStudent;
    }

    @Override
    public void greet() {
        super.greet();//вызывает метод greet, который на класс выше в иерархии
        System.out.println( ". I'm student");
    }
}
