import java.util.ArrayList;
import java.util.List;

public class Student extends People {

    //无参构造
    public Student() {
    }
    
    //有参构造
    public Student(String name, int number, String sex) {
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

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }


    //选课方法
    public void selectCourse(Course course){
        if (this.courseList == null){
            this.courseList = new ArrayList<>();
        }
        this.courseList.add(course);
    }

    //退课方法
    public void unSelectCourse(Course course){
        if (this.courseList != null){
            if (this.courseList.contains(course)){
                this.courseList.remove(course);
            }
        }
    }

}
