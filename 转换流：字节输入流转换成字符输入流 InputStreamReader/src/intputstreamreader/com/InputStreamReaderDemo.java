
 /*
 * ���ֽ�����������ַ�������     �� InputStreamReader
 * ���췽����
 * InputStreamReader(InputStream in) 
          ����һ��ʹ��Ĭ���ַ����� InputStreamReader��
          ���÷�����        
    ����ժҪ
 void	close() 
          �رո������ͷ���֮������������Դ��
 String	getEncoding() 
          ���ش���ʹ�õ��ַ���������ơ�
 int	read() 
          ��ȡ�����ַ���
 int	read(char[] cbuf, int offset, int length) 
          ���ַ����������е�ĳһ���֡�
 boolean	ready() 
          �жϴ����Ƿ��Ѿ�׼�������ڶ�ȡ��
 *
 */


package intputstreamreader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderDemo {
	public static void main(String[] args){
		//ָ��һ��·��
		File f = new File("d:"+File.separator+"test.txt");
		try {
			
			
			//����ת���������ֽ�����������ַ��������������ַ�����
		    Reader ipr = new InputStreamReader(new FileInputStream(f));
		    char [] ch = new char[(int) f.length()];
		    ipr.read(ch);
		    ipr.close();
		    for (int i = 0; i < ch.length; i++) {
		    	 System.out.print(ch[i]);
			}
		   
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
