package riqi.cn;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.sound.midi.SysexMessage;

/*
 * Calendar ����һ��������,
 * Ҫ��ʹ��һ�������࣬�������������Ķ�̬�ԣ�ͨ��������и����ʵ��������
 * ֱ����֪���ࣺ
 GregorianCalendar
 ���õķ�����
 static Calendar	getInstance() 
          ʹ��Ĭ��ʱ�������Ի������һ��������
          �����ó����ǣ�
          public static final int YEAR
          public static final int MONTH
          public static final int DAY_OF_MONTH
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//ͨ����̬������һ��Calendar����
		Calendar cd = new GregorianCalendar();
		System.out.println("��"+cd.get(Calendar.YEAR));
		System.out.println("��"+cd.get(Calendar.MONTH));
	    System.out.println("��"+cd.get(Calendar.DAY_OF_MONTH));  
		
	}

}
