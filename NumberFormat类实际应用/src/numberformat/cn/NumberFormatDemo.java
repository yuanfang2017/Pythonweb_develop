package numberformat.cn;

import java.text.NumberFormat;

/*NumberFormat ��������ֵ��ʽ�ĳ������
 * ���� ���������Ҫͨ����̬��ʵ����������NumberFormat����һ����̬����������ֱ��ȡ��ʵ��������
 * static NumberFormat	getInstance() 
          ���ص�ǰĬ�����Ի�����ͨ����ֵ��ʽ��
   String	format(double number) 
          ��ʽ�淶��
 */
public class NumberFormatDemo {
 public static void main(String[] args) {
	 //ʵ����NumberFormat����
	 NumberFormat nf = NumberFormat.getInstance();
	 System.out.println(nf.format(800000));
	 System.out.println(nf.format(100000.789));
}
}
