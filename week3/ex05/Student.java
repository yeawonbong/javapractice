package ex05;

import java.util.ArrayList;

/**
 * 학생 정보 클래스
 */
public class Student {
    /**
     * 학생 ID
     */
    private int studentID;
    /**
     * 학생 이름
     */
    private String studentName;
    /**
     * Subject List
     */
    ArrayList<Subject> subjectList = new ArrayList<>();
    /**
     * 총점
     */
    private int totalScore=0;

    /**
     * Stud
     * @param studentID
     * @param studentName
     */
    Student (int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    /**
     * subject 추가
     * @param subjectName
     * @param subjectScore
     */
    public void addSubject(String subjectName, int subjectScore) {
        subjectList.add(new Subject(subjectName, subjectScore));
    }

    /**
     * StudentInfo 출력
     */
    public void showStudentInfo(){
        for(Subject subject : subjectList) {
            System.out.println("학생 " + studentName + "의 "
                    + subject.getSubjectName() + " 과목 성적은 "
                    + subject.getSubjectScore() + "입니다.");
            totalScore += subject.getSubjectScore();
        }
        System.out.println("학생 " + studentName + "의 총점은 " + totalScore + " 입니다.");
    }
}
