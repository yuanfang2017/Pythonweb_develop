package tianjia.cn;
/*
 * ������λ�� �������
 * api������
 *  StringBuffer	insert(int offset, boolean b) 
          �� boolean �������ַ�����ʾ��ʽ����������С�
 StringBuffer	insert(int offset, char c) 
          �� char �������ַ�����ʾ��ʽ����������С�
 StringBuffer	insert(int offset, char[] str) 
          �� char ����������ַ�����ʾ��ʽ����������С�
 StringBuffer	insert(int index, char[] str, int offset, int len) 
          ��������� str ����������ַ�����ʾ��ʽ����������С�
 StringBuffer	insert(int dstOffset, CharSequence s) 
          ��ָ�� CharSequence ����������С�
 StringBuffer	insert(int dstOffset, CharSequence s, int start, int end) 
          ��ָ�� CharSequence �������в���������С�
 StringBuffer	insert(int offset, double d) 
          �� double �������ַ�����ʾ��ʽ����������С�
 StringBuffer	insert(int offset, float f) 
          �� float �������ַ�����ʾ��ʽ����������С�
 StringBuffer	insert(int offset, int i) 
          �� int �������ַ�����ʾ��ʽ����������С�
 StringBuffer	insert(int offset, long l) 
          �� long �������ַ�����ʾ��ʽ����������С�
 StringBuffer	insert(int offset, Object obj) 
          �� Object �������ַ�����ʾ��ʽ������ַ������С�
 StringBuffer	insert(int offset, String str) 
          ���ַ���������ַ������С�
 */
public class StingBufferDemo1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.insert(1, "world");
		//��������
		sb.insert(sb.length(), "!!!");
		System.out.println(sb);
	}

}
