package a;

import java.util.Scanner;


public class CalculatedRent extends automobile{
	private String xinghao;


	public void automo() {	
		Scanner sc = new Scanner(System.in);
		//ѡ������Ʒ��
		int i = sc.nextInt();
		System.out.println("1���γ�  \t 2���ͳ�\n��ѡ����Ҫ���޵��������ͣ�");
		if(i==2){
		System.out.println("��ѡ����Ҫ���޵�����Ʒ�ƣ�1������ 2����");
		return;
		}else {
			System.out.println("���������д�");
		return;
		}
		
	}
	public String getXinghao() {
		return xinghao;
	}
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}

}
