package a;

import java.util.Scanner;


public class Sedanca extends automobile{
	private  String zuoweishu ;
	
	public void automo() {	
		System.out.println("******��ӭ�����ڷ��������޹�˾******");
		Scanner sc = new Scanner(System.in);
		System.out.println("1���γ�  \t 2���ͳ�\n��ѡ����Ҫ���޵��������ͣ�");
		int i = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		
		if(i==1){//ѡ������Ʒ�ƣ�1Ϊ�γ�
		System.out.println("��ѡ����Ҫ���޵�����Ʒ�ƣ�1����� 2������");
		int i1 = sc.nextInt();
		if(i1==1){//ѡ��γ�����
		System.out.println("��ѡ����Ҫ���޵��������ͣ�1�����ȴ�� 2��GL8");
		
		}else if(i2==1){
		System.out.println("��������Ҫѡ���������");	
		
		}
		//ѡ������Ʒ��
		}else if(i==2) {//ѡ������Ʒ�ƣ�2Ϊ�ͳ�
		System.out.println("��ѡ����Ҫ���޵�����Ʒ�ƣ�1������ 2����");
		int i1 = sc.nextInt();
		if(i1==2){//ѡ��ͳ�����
		System.out.println("��ѡ����Ҫ���޵��������ͣ�1��16�� 2��34��");	
		}	
		}
		
		
		
		
		
		
	}
	public String getZuoweishu() {
		return zuoweishu;
	}
	public void setZuoweishu(String zuoweishu) {
		this.zuoweishu = zuoweishu;
	}
}
