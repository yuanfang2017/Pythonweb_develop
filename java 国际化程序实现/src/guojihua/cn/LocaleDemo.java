package guojihua.cn;

import java.util.ResourceBundle;

/* �������õķ���
 * static ResourceBundle	getBundle(String baseName) 
          ʹ��ָ���Ļ������ơ�Ĭ�ϵ����Ի����͵����ߵ����������ȡ��Դ����
static ResourceBundle	getBundle(String baseName, Locale locale) 
          ʹ��ָ���Ļ������ơ����Ի����͵����ߵ����������ȡ��Դ����
   String	getString(String key) 
          �Ӵ���Դ��������ĳ�������л�ȡ���������ַ�����
 */
public class LocaleDemo {
	public static void main(String[] args) {
		//�ҵ���Դ�ļ�
		ResourceBundle rb = ResourceBundle.getBundle("Message");
		System.out.println(rb.getString("info"));
	}

}
