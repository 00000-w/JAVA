package practice4;

public class Student {
    private String name;
    private String studentId;
    private int score;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("成绩注入错误");
        } else
            this.score = score;
    }

    public void printInfo() {
        System.out.println("姓名： " + name + "; 学号： " + studentId + "; 成绩： " + score);
    }
}
