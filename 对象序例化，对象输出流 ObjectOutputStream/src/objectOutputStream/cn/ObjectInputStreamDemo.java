package objectOutputStream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/*
 * ObjectInputStream  �����������
 * ���췽����
 * 	ObjectInputStream(InputStream in) 
          ������ָ�� InputStream ��ȡ�� ObjectInputStream��
          
 */
public class ObjectInputStreamDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("d:"+File.separator+"e.txt");
		InputStream ip = new FileInputStream(f);
		//new һ������������
		ObjectInputStream oji = new ObjectInputStream(ip);
	   Object object =  oji.readObject();
	   oji.close();
	   System.out.println(object);
	}

}
