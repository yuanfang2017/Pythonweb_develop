package serializable.cn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class SerializableDemo {
public static void main(String[] args) throws Throwable {
	//new ����������
 	 Person [] per = {new Person("����",30),new Person("����",40),new Person("����",50)};
 	 //ser()���յ����������͵Ĳ���
 	 ser(per);
 	 //dser()���ص���һ������
 	Object[] ct = dser();
 	//��������
 	for (int i = 0; i < ct.length; i++) {
		//  ���� 1��System.out.println(ct[i]);
 		//����2 ������������ ת��Ϊperson����
 		Person p = (Person)ct[i];
 		System.out.println(p);	
	}	
}
//�������࣬��һ��object���͵��������
	public static void ser(Object[] obj) throws Throwable{
		File f = new File("d:"+File.separator+"e.txt");
		OutputStream out = new FileOutputStream(f);
		 ObjectOutputStream otp = new ObjectOutputStream(out);
		 //void	writeObject(Object obj)   ��ָ���Ķ���д�� ObjectOutputStream��
		 otp.writeObject(obj);		 
         otp.close();
	}	
	//����������,����һ��object ����
	  public static Object[] dser() throws Throwable{
	   File f = new File("d:"+File.separator+"e.txt");
	   InputStream ip = new FileInputStream(f);
	   //new һ������������
	   ObjectInputStream oji = new ObjectInputStream(ip);
      Object[] jec = ( Object[])oji.readObject();
        oji.close();
        return jec;     
	  }
}
