package com.company;
import com.company.model.Student;

public class Group {

    private int ID=0;
    private Student[] students;
    private Group[] groups;
    private String programmingLanguage;


    public Group(){
        students = new Student[1];
        ID++;
    }

    public void printInformation(){
        for (int i = 0; i < students.length; i++) {
            System.out.println(ID);
            students[i].printInformation();
            programmingLanguage = "Java" ;
            System.out.println(programmingLanguage);

        }
    }
    public Student[] checkHomework(int numberHomework){
        //какие студенты сделали домашку с определённым номером
        for (int i = 0; i < students.length; i++) {
            boolean[] hWStudent = students[i].getHomeWork();//создали массив для массива домашек из студентов
              if(hWStudent[numberHomework]==true){
                  System.out.println(students[i]);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      мс




              }
        }

       return null;
    }

    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

}
