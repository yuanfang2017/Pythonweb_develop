package scanner.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * ʵ������ 3�� ���ļ��еõ� ����
 */
public class ScannerDemo4 {
	public static void main(String[] args) {
		//ָ���ļ�
		File f = new File("d:"+File.separator+"test.txt");
		  Scanner sc = null;
	     try {
	    	 //���ļ���Ϊ�������
		   sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     //�����ļ�����������ǿ��Ա䶯�ģ����������stringbuffer ����
	     StringBuffer sb = new StringBuffer();
	     while (sc.hasNext()) {			
	    	 sb.append(sc.next());
		}
		   System.out.println(sb);
	}

}
