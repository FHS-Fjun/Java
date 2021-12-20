
import java.util.Scanner;
public class Ptp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int position =0;
	    int times=0;
	    String poem = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";  
	    String str1 = poem.replaceAll ("(.{14})", "$1。");
	    StringBuffer str2 = new StringBuffer(str1);
	    for(int i=7;i<=str2.length();){  
	    	str2.insert(i,",");
	    	i=i+16;
        }
	    for(int i=16;i<str2.length();) {
	    	str2.insert(i, "\n");
            i=i+17;
	    }
	    String str3 = str2.toString() ;

	    Scanner a = new Scanner(System.in);
    	System.out.println("请输入要检索的字符或字符串");
    	String stext =a.next();
		while(str3.indexOf(stext,position)>=0){
		    times++;
		    position=str3.indexOf(stext,position)+stext.length();
		}
		System.out.println(stext+"出现的次数为:"+times);
        }
}