
/*
 * ��������н��Ϊ name �� null ��age :30 
 * ������Ϊ��transient ���ε����ԣ��ڱ���������ʱ��û�б�����������
 * ���������ڷ���������ʱ���������ʱ����Ĭ��ֵ null
 */

package tran.cn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TransientDemo {
 public static void main(String[] args) {
	 try {
		ser();
		dser();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
//��������
	public static void ser() throws Throwable{
		File f = new File("d:"+File.separator+"e.txt");
		OutputStream out = new FileOutputStream(f);
		 ObjectOutputStream otp = new ObjectOutputStream(out);
		 //void	writeObject(Object obj)   ��ָ���Ķ���д�� ObjectOutputStream��
		 otp.writeObject(new Person("����",30));
        otp.close();
	}	
	//����������
	  public static void dser() throws Throwable{
	   File f = new File("d:"+File.separator+"e.txt");
	   InputStream ip = new FileInputStream(f);
	   //new һ������������
	   ObjectInputStream oji = new ObjectInputStream(ip);
      Object object = oji.readObject();
      oji.close();
      System.out.println(object);
	  }
}
