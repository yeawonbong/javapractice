package week2.ex03;

public class Student {
    int studentID;
    String studentName;

    Subject korean = new Subject();
    Subject math = new Subject();

    public Student(int studentID, String studentName){

        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void setKorean(String subject, int score) {
        korean.setKoreaSubject(subject);
        korean.setKoreaScore(score);
    }
    public void setMath(String subject, int score){
        math.setMathSubject(subject);
        math.setMathScore(score);
    }
    public void showStudentInfo() {
        int sum = korean.getKoreanScore() + math.getMathScore();
        System.out.println("학생 " + this.studentName + "의 총점은 " + sum + "입니다.");
    }

}
