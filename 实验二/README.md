# 实验目的
 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
 掌握面向对象的类设计方法（属性、方法）；
 掌握通过构造方法实例化对象；
 学会使用数组。
# 要求
 1.编写实体类以及测试主类
 2.在测试主类中，实例化多个类实体，模拟
   1）教师开设某课操作；
   2）学生选课操作、退课操作
   3）打印学生课表信息（包括：编号、课程名称、上课地点、时间、授课教师）
 
# 核心代码
'''JAVA
  //老师开设课程
    public Course addCourse(int number, String classname, String spot, String time){
        Course course = new Course(number,classname,spot,time,this.getName());
        if (this.courseList == null){
            this.courseList = new ArrayList<>();
        }
        this.courseList.add(course);
        return course;

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
'''
# 系统运行结果
 学生1【课程-】课程信息:
 
 C
 
 Unix
 
 Go
 
 学生2【课程-】课程信息:
 
 JAVA
  
 Python
  
# 感想
 对类设计方法有了新的理解，懂得了如何用构造方法实例化对象。
