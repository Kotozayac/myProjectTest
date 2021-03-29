package Lesson1;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder n) {
        if (n.length()>3) { this.name=n; }
        else { throw new RuntimeException("Should contain at least 3 symbols"); }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int c) {
        if (c >= 1 && c <=4) {  this.course=c; }
        else { throw new RuntimeException("Must be in the range from 1 to 4 inclusive"); }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int g) {
        if (g >= 1 && g <=10) { this.grade=g; }
        else { throw new RuntimeException("Must be in the range from 1 to 10 inclusive"); }
    }

    void showInfo() {
        System.out.println(getName());
        System.out.println(getCourse());
        System.out.println(getGrade());
    }

}

class TestStudent extends Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Kolyan"));
        s.setCourse(3);
        s.setGrade(7);
        s.showInfo();
    }
}
