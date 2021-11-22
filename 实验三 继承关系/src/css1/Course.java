package css1 ;

public class Course {
	private int number;
    private String classname;
    private String spot;
    private String time;
    private String teacherName;

    public Course() {
    }

    public Course(int number, String classname, String spot, String time, String teacherName) {
        this.number = number;
        this.classname = classname;
        this.spot = spot;
        this.time = time;
        this.teacherName = teacherName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
