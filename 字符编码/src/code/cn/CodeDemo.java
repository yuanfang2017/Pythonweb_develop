package code.cn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/*
 * ���ϵͳ�ı���
 */
public class CodeDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("ϵͳ��Ĭ�ϱ���Ϊ��"+System.getProperty("file.encoding"));
		//ת������
		File f = new File("d:"+File.separator+"c.txt");
		OutputStream out  = new FileOutputStream(f);
		String str = "�й�����ã�";
		//byte [] b = str.getBytes("ISO8859-1");
		byte [] b = str.getBytes("GBK");
		out.write(b); 
		out.close();
	}
}
