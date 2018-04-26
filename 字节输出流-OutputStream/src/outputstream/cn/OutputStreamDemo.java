package outputstream.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * �� OutputStream
 * �ֽڵ������   ������
 * ��Ҫ�ķ�����
 * void	close() 
          �رմ���������ͷ�������йص�����ϵͳ��Դ��
 void	flush() 
          ˢ�´��������ǿ��д�����л��������ֽڡ�
 void	write(byte[] b) 
          �� b.length ���ֽڴ�ָ���� byte ����д����������
 void	write(byte[] b, int off, int len) 
          ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����������
abstract  void	write(int b) 
          ��ָ�����ֽ�д����������
 */
public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//ʹ��file ���ҵ�һ���ļ�
		File f = new File("d:"+File.separator+"test.txt");
		//����OutputStream �ǳ����࣬����ͨ������ʵ���� �������
		OutputStream op = new FileOutputStream(f);
		//����һ���ַ���
		String str = "hello world !!";
		//����OutputStream�ķ���ֻ����byte�������ͣ�������Ҫ��string ����ת��Ϊbyte����
		byte[] b = str.getBytes();
		op.write(b);
		//�ر������
		op.close();
		
	}

}
