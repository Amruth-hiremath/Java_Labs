package part_b;

class TeacherInfo {
    private String teacherName;

    public void setTeacherName(String name) {
        this.teacherName = name;
    }

    public synchronized void courseTeacher(String studentName, String course) {
        System.out.println(studentName + " is enrolled in " + course + ". Teacher: " + teacherName);
    }
}

class StudentA extends Thread {
    private TeacherInfo teacherInfo;
    private String course;

    public StudentA(TeacherInfo info, String course) {
        this.teacherInfo = info;
        this.course = course;
    }

    @Override
    public void run() {
        teacherInfo.courseTeacher("Student A", course);
    }
}

class StudentB extends Thread {
    private TeacherInfo teacherInfo;
    private String course;

    public StudentB(TeacherInfo info, String course) {
        this.teacherInfo = info;
        this.course = course;
    }

    @Override
    public void run() {
        teacherInfo.courseTeacher("Student B", course);
    }
}

public class lab5_b {

	public static void main(String[] args) {
        TeacherInfo sharedTeacher = new TeacherInfo();
        
        sharedTeacher.setTeacherName("Dr. Smith");

        StudentA s1 = new StudentA(sharedTeacher, "Computer Science");
        StudentB s2 = new StudentB(sharedTeacher, "Information Technology");

        s1.start();
        s2.start();
	}

}
