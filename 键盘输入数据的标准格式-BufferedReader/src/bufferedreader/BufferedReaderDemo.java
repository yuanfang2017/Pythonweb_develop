package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * java.io �� BufferedReader :���ڴӻ������ж�ȡ���ݣ����е������ֽ����ݶ���
 * ���췽����
 * BufferedReader(Reader in) 
          ����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ���������
     int	read() 
          ��ȡ�����ַ���
    int	  read(char[] cbuf, int off, int len) 
          ���ַ����������ĳһ���֡�
    String	readLine() 
          ��ȡһ���ı��С�
 */
public class BufferedReaderDemo {
	public static void main(String[] args) {
		//����һ��BufferedReader�Ķ���
		//BufferedReaderֻ�����ַ�����������system.in �� �ֽ�������������Ҫͨ������ת�� InputStreamReaderת��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�������������
		String str = null;
		System.out.println("���������ݣ�");
		//��ȡ���������
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���str
		System.out.println(str);	
	}

}
