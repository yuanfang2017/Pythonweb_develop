package reader.cn;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/*
 * �Ľ�2 ʹ��ѭ���ķ�ʽ��ȡ����
 */
public class ReaderDemo2 {
	public static void main(String[] args) throws Exception {
		//����file ָ��·��
		File f = new File("d:"+File.separator+"test.txt");
		//ͨ������ʵ�����������
		Reader r = new FileReader(f);
		//����һ���ַ��ռ�
		char[] ch = new char[(int)f.length()];
		int temp;
		int len = 0;
		while ((temp = r.read())!=-1) {
			 ch[len] = (char)temp;
			 len++;		
		}
		
		System.out.println(new String (ch));
		
	}

}
