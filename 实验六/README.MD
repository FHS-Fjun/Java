# 实验目的
掌握文件输入输出；  
掌握对象序列化方法。  

# 实验要求
在实验三（学生选课模拟系统）的基础上，利用文件保存选课结果，过程如下：  
1.采用对象序列化的writeObject方法把选课结果存到硬盘文件系统中；  
2.采用对象序列化的readObject方法从文件中恢复对象，并操作学生的选课课表，实现退课操作。  
3.打印课程对象信息，采用覆盖定义toString（）方法的方式。  

# 核心代码 
              try {

	            FileOutputStream fileOut = new FileOutputStream("D:/css");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(courseList1);
	            out.close();
	            fileOut.close();

	            FileInputStream fileIn = new FileInputStream("D:/css");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            courseList1 = (List<Course>) in.readObject();
	            in.close();
	            fileIn.close();
	            courseList1.remove(1);
	            System.out.println();
	            
		        }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
          
# 感想
在实验三的基础上增加了文件输入输出功能，体会到了一个完整功能系统的实现需要不断的改进，  
并且能根据现实需求，通过增加代码，实现想要的效果。

