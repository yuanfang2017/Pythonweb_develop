package pushbackInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/*
 * �Լ���дһ��
 */
public class PushbackInputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		//����һ���ַ���
		String str = "hello.hai.heihei.laiba...";
		//����һ���ڴ�����������
		ByteArrayInputStream bai = new ByteArrayInputStream(str.getBytes());
		//����һ������������
		PushbackInputStream pbi = new PushbackInputStream(bai);
		System.out.println("��ȡ������Ϊ��");
		int temp = 0;
		while ((temp = pbi.read())!=-1) {
		  if (temp =='.') {
			pbi.unread(temp);
			 temp = pbi.read();
			 System.out.print("(����"+(char)temp+")");
		}
		  else {
			  System.out.print((char)temp);
		}
			
		}
		
	}

}
