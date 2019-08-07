package com.company.TasksCLASSObject;

public class Student {

    int SID;
    String sname;
    int Sub1;
    int Sub2;
    int Sub3;

    public void getStuData(int SID, String sname) {
        this.SID = SID;
        this.sname = sname;
    }

    public void getStuMarks(int marks1, int marks2 , int marks3) {
    this.Sub1 = marks1;
    this.Sub2 = marks2;
    this.Sub3 = marks3;
}

  public int totalMarks(){
        int sum = Sub1 + Sub2 + Sub3;
        return sum;
  }

    public static void main(String[] args) {

        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();

        stu1.getStuData(2,"Melani");
        stu1.getStuMarks(3,5,9);
        System.out.println(stu1.totalMarks());

    }

}
