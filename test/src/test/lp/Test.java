package test.lp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test {
	
	public static void main(String[] args) {
		//ָ��һ��·��
				File f = new File("d:"+File.separator+"test.txt");
				try {
	
					//����ת���������ֽ�����������ַ��������������ַ�����
				    Reader ipr = new InputStreamReader(new FileInputStream(f));
				    char [] ch = new char[(int) f.length()];
				    ipr.read(ch);
				    ipr.close();
				    for (int i = 0; i < ch.length; i++) {
				    	 System.out.println(ch[i]);
					}
				   
				} catch (Exception e) {
					// TODO: handle exception
				}
	}

}
