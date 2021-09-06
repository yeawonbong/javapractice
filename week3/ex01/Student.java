package ex01;

public class Student {
    int studentID;
    String studentName;
    private static int serialNum=1000;

    public Student(){
        this.studentID = ++serialNum;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public static int getSerialNum() {
        return serialNum;
    }
}