package outputstreamwriter.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * ���ֽ����������ַ������  �� OutputStreamWriter
 * ���췽��
 * OutputStreamWriter(OutputStream out) 
          ����ʹ��Ĭ���ַ������ OutputStreamWriter��
          ���õķ�����
  void	close() 
          �رմ�������Ҫ��ˢ������
 void	flush() 
          ˢ�¸����Ļ��塣
 String	getEncoding() 
          ���ش���ʹ�õ��ַ���������ơ�
 void	write(char[] cbuf, int off, int len) 
          д���ַ������ĳһ���֡�
 void	write(int c) 
          д�뵥���ַ���
 void	write(String str, int off, int len) 
          д���ַ�����ĳһ���֡�
 * 
 */
public class OutputStreamWriterDemo {
 public static void main(String[] args) throws Exception{
	 //ָ��һ��·��
	 File f = new File("d:"+File.separator+"test.txt");
	//����ת���������ֽ����������ַ�������������ַ�����
	Writer osw;
		osw = new  OutputStreamWriter(new FileOutputStream(f));
		osw.write("hello yuanfangwang");

		osw.close();

				
}
}
