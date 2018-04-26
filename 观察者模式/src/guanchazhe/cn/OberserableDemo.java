package guanchazhe.cn;

import java.util.Observable;
import java.util.Observer;

/*
 * �۲���ģʽ���ܶ๺���߶��ڹ�ע���۵ı仯��ÿ�����۷����仯ʱ�����еĹ����߶����Կ���
 * ʵ�ַ�ʽ��
 * ���۲��� ����̳� observable �࣬ observable ��ĳ��÷�����
 *  void	addObserver(Observer o) 
          ����۲����뼯�������еĹ۲��߲�ͬ���������Ĺ۲��߼�����Ӵ˹۲��ߡ�
     void	deleteObserver(Observer o) 
          �Ӷ���Ĺ۲��߼�����ɾ��ĳ���۲��ߡ�
     void	deleteObservers() 
          ����۲����б�ʹ�˶��������κι۲��ߡ�
    void	notifyObservers() 
          ��� hasChanged ����ָʾ�����Ѹı䣬��֪ͨ�����й۲��ߣ������� clearChanged ������ָʾ�˶����ٸı䡣
     void	notifyObservers(Object arg) 
          ��� hasChanged ����ָʾ�����Ѹı䣬��֪ͨ�����й۲��ߣ������� clearChanged ������ָʾ�˶����ٸı䡣
p    protected  void	setChanged() 
          ��Ǵ� Observable ����Ϊ�Ѹı�Ķ������� hasChanged ���������� true��
          
          
          �۲��߱���ʵ�� Observer �ӿڣ�Observer �ӿڶ������£�
          public interface Observer{
          public void update(Observable o,Object arg)
          }
          
 */
//���۲�����
class House extends Observable{
	private Float price;

	public House(Float price) {
		super();
		this.price = price;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		//���ñ仯��
		super.setChanged();
		super.notifyObservers(price);
		this.price = price;
	}
	
}
//�۲�����
class HousePriceObserver implements Observer{
	//�۲�������
	private String name;
	public HousePriceObserver(String name) {
		super();
		this.name = name;
	}

	//ʵ��update����
	public void update(Observable o,Object arg){
		//�жϲ�������
		if (arg instanceof Float) {
			System.out.println(this.name+"�۲쵽�ļ۸�仯Ϊ");
			System.out.println(((Float) arg).floatValue());
		}
	}
	
}
public class OberserableDemo {
	public static void main(String[] args) {
		//���۲��Ŷ���
		House hs =new House(1000f);
		//��ӹ۲���
		hs.addObserver(new HousePriceObserver("�۲���A"));
		hs.addObserver(new HousePriceObserver("�۲���B"));
		hs.addObserver(new HousePriceObserver("�۲���C"));
	    System.out.println("���ӵļ۸��ǣ�"+hs.getPrice());
	    hs.setPrice(600f);
	    //System.out.println("���ڷ��ӵļ۸��ǣ�"+hs.getPrice());
		
	}

}
