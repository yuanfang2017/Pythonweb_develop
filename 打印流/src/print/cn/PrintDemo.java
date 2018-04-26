package print.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * �ֽڴ�ӡ�� �� �� PrintStream
 * �ַ���ӡ������ PrintWriter
 * �� PrintStream ���췽����
 * PrintWriter(OutputStream out) 
          �������е� OutputStream ���������Զ���ˢ�µ��� PrintWriter��
          ��Ҫ������
  void	print(boolean b) 
          ��ӡ boolean ֵ��
  void	print(char c) 
          ��ӡ�ַ���
  void	print(char[] s) 
          ��ӡ�ַ����顣
  void	print(double d) 
          ��ӡ double ���ȸ�������
  void	print(float f) 
          ��ӡһ����������
  void	print(int i) 
          ��ӡ������
  void	print(long l) 
          ��ӡ long ������
  void	print(Object obj) 
          ��ӡ����
  void	print(String s) 
          ��ӡ�ַ�����
          
       PrintWriter ��ز������api�ĵ�   
 */
public class PrintDemo {
	public static void main(String[] args) {
		PrintStream ps =null;
		try {
			 ps = new PrintStream(new FileOutputStream(new File("d:"+File.separator+"test2.txt")));
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ps.print("hello");
	    ps.println("world!!!");
	    ps.print("1+1 =22");
	}

}
