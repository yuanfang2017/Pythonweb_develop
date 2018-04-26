package externalizable.cn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
public class ExternalizableDemo {
	public static void main(String[] args) throws Throwable {
		ser();
		dser();	
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
