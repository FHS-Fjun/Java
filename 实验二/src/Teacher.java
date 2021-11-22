import java.util.ArrayList;
import java.util.List;

public class Teacher {
	private String name;
    private int number;
    private String sex;
    private List<Course> courseList;

    public Teacher() {
    }

    public Teacher(String name, int number, String sex) {
        this.name = name;
        this.number = number;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList){
        this.courseList = courseList;
    }

    //老师开设课程
    public Course addCourse(int number, String classname, String spot, String time){
        Course course = new Course(number,classname,spot,time,this.getName());
        if (this.courseList == null){
            this.courseList = new ArrayList<>();
        }
        this.courseList.add(course);
        return course;
    }

}
