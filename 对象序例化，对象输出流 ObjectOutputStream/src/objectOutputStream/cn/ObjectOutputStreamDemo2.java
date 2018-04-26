package objectOutputStream.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*
 * �� ObjectOutputStream:���������
 * ���췽����
 *  ObjectOutputStream(OutputStream out) 
          ����д��ָ�� OutputStream �� ObjectOutputStream��
 */
public class ObjectOutputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		File f = new File("d:"+File.separator+"e.txt");
		OutputStream out = new FileOutputStream(f);
		 ObjectOutputStream otp = new ObjectOutputStream(out);
		 //void	writeObject(Object obj)   ��ָ���Ķ���д�� ObjectOutputStream��
		 otp.writeObject(new Person("����",30));
         otp.close();
	}

}
