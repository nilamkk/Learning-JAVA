package com.company;

public class Student {
    private int scholarId;
    private String name;
    private String branch;
    private int semester;
    private double cgpa;

    public Student(){
        this("X",-1,"X",-1,0.0d);
        System.out.println("This is the default constructor!!!");
    }
    public Student(String name,int scholarId,String branch, int semester, double cgpa){
        System.out.println("This is the main constructor!!!");

        this.scholarId = scholarId;
        this.name = name;
        this.branch = branch;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    public int getScholarId() {
        return scholarId;
    }

    public void setScholarId(int scholarId) {
        this.scholarId = scholarId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
