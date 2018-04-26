package simpledataformat.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * �ڿ����о�����string ���ͱ��data������
 * ���õķ���Ϊ��
 * SimpleDateFormat(String pattern) 
          �ø�����ģʽ��Ĭ�����Ի��������ڸ�ʽ���Ź��� SimpleDateFormat��
           Date	parse(String text, ParsePosition pos) 
          �����ַ������ı������� Date��
          StringBuffer	format(Date date, StringBuffer toAppendTo, FieldPosition pos) 
          �������� Date ��ʽ��Ϊ����/ʱ���ַ��������������ӵ������� StringBuffer��
          public final string format(data datd)
             ��һ��data ���Ͱ���ָ����ʽ��� string ����      
 */
public class SimpleDataFormatDemo {
public static void main(String[] args) throws Exception {
	//����һ������
	String ing = "2017-5-9 12:34:23";
	//����һ��ģ��
	String str = "yyyy-MM-dd HH:mm:ss";
	//���� SimpleDateFormatһ��ʵ��������
	SimpleDateFormat sd = new SimpleDateFormat(str);
	//�����ַ������ı������� Date
	Date d = sd.parse(ing);
	System.out.println(d);	
}
}
