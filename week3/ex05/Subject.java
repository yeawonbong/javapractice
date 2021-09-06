package ex05;

/**
 * 과목 정보를 저장하는 클래스
 */
public class Subject {
    /**
     * 과목 이름
     */
    private String subjectName;
    /**
     * 과목 점수
     */
    private int subjectScore;

    /**
     * 과목 이름과 점수를 매개변수로 받는 생성자
     * @param subjectName
     * @param subjectScore
     */
    Subject(String subjectName, int subjectScore) {
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }

    /**
     * @return subjectName
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * @param subjectName
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * @return subjectScore
     */
    public int getSubjectScore() {
        return subjectScore;
    }

    /**
     * @param subjectScore
     */
    public void setSubjectScore(int subjectScore) {
        this.subjectScore = subjectScore;
    }
}
