package file.cn;
/*
 * ��ϰһ��ʵ��
 * ����һ���ļ�·��������ļ��Ѵ�����ɾ�����������ļ������ڣ��򴴽�һ���µ�
 */

import java.io.File;
import java.io.IOException;
import java.util.MissingFormatArgumentException;

public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		//����һ��·��
		File f = new File("d:"+File.separator+"test.txt");
		if (f.exists()) {
			f.delete();
		}
		else {
			f.createNewFile();
		}
	}

}
