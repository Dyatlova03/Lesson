package com.company;

import com.company.model.Student;

public class Coaсh extends Human {
    private int yearsOfExperience;
    private Group group;

    public Student[] checkHomework(int numberHomework){
      group.checkHomework(numberHomework); //возвращаем массив студентов
        return null;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
