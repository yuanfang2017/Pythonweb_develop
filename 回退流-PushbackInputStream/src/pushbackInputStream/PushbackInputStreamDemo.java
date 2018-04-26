package pushbackInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/*
 * ���������� ���� PushbackInputStream
 * 
 * ���췽����
 * PushbackInputStream(InputStream in) 
          ���� PushbackInputStream ��������������������� in�����Թ�����ʹ�á�
 */
public class PushbackInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//����һ���ַ���
		String str = "hello.world.hah.heihei";
		//����һ���ڴ�������
		ByteArrayInputStream ba  = new ByteArrayInputStream(str.getBytes());
		//����һ������������
		PushbackInputStream pd = null;
		pd = new PushbackInputStream(ba);
		System.out.println("��ȡ֮�������Ϊ��");
		int temp = 0;
		while ((temp =pd.read())!=-1){
			if (temp == '.') {
			   pd.unread(temp);
			   temp = pd.read();
			   System.out.print("(�˻�"+(char)temp+")");
			
			}
			   else {
					System.out.print((char)temp);
				}
		}
		
				
	}
}
