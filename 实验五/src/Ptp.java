
import java.util.Scanner;
public class Ptp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int position =0;
	    int times=0;
	    String poem = "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������";  
	    String str1 = poem.replaceAll ("(.{14})", "$1��");
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
    	System.out.println("������Ҫ�������ַ����ַ���");
    	String stext =a.next();
		while(str3.indexOf(stext,position)>=0){
		    times++;
		    position=str3.indexOf(stext,position)+stext.length();
		}
		System.out.println(stext+"���ֵĴ���Ϊ:"+times);
        }
}