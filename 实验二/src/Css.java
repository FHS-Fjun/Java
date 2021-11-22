import java.util.List;
	public class Css {
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		    //实例化两个老师对象
		    Teacher teacher1 = new Teacher("李冉",001,"女");
	        Teacher teacher2 = new Teacher("何威",002,"男");
	        Teacher teacher3 = new Teacher("王伟",002,"男");
	        Teacher teacher4 = new Teacher("吴迪",002,"男");
  
	        //教师开设课程
	        Course course0 = teacher1.addCourse(1,"C","A001","8:00");
	        Course course1 = teacher1.addCourse(2,"JAVA","A002","15:00");
	        Course course2 = teacher2.addCourse(3,"C#","A003","10:00");
	        Course course3 = teacher2.addCourse(4,"Linux","A004","9:00");
	        Course course4 = teacher3.addCourse(5,"Unix","A005","12:00");
	        Course course5 = teacher4.addCourse(6,"Python","A006","13:00");
	        Course course6 = teacher3.addCourse(7,"Go","A007","14:00");
	        
	        //实例化两个学生对象
	        Student student1 = new Student("张三",202101,"男");
	        Student student2 = new Student("李四",202102,"女");
 
	        //学生选课退课操作
	        student1.selectCourse(course0);
	        student1.selectCourse(course2);
	        student1.selectCourse(course4);
	        student1.selectCourse(course6);
	        student2.selectCourse(course1);
	        student2.selectCourse(course3);
	        student2.selectCourse(course5);

	        student1.unSelectCourse(course2);
	        student2.unSelectCourse(course3);

	        List<Course> courseList1 = student1.getCourseList();
	        List<Course> courseList2 = student2.getCourseList();

	        //打印学生课表信息
	        System.out.println("学生1【课程-】课程信息:");
	        for (int i = 0; i < courseList1.size(); i++) {
	            System.out.println(courseList1.get(i).getClassname());
	        }

	        System.out.println("学生2【课程-】课程信息:");
	        for (int i = 0; i < courseList2.size(); i++) {
	            System.out.println(courseList2.get(i).getClassname());
	        }

	  
	        }
	  }
