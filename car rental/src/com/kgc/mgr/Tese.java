package com.kgc.mgr;

import java.util.Scanner;

import com.kgc.vehicle.MotoVehicle;

public class Tese {
		/**
		 * ������ѡ��
		 * @return
		 */
		public int inputNextInt(){
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			return input.nextInt();
		}
		public static void main(String[] args) {
			Tese t = new Tese();
			t.CarSystem();
		};
		public void CarSystem(){
			MotoOperation motoMgr = new MotoOperation();
			System.out.println("******��ӭ�����������޹�˾******");
			System.out.println("1���γ�\t2���ͳ�");
			System.out.println("��ѡ����Ҫ���޵ĳ������ͣ�");
			//int motoType = input.nextInt();
			//�⳵����
			String brand = "";//Ʒ��
			String type = "";//�ͺ�
			int seat = 0; //��λ��
			//�ͻ�ѡ��
			if(inputNextInt() == 1){
				//���޽γ�
				System.out.println("��ѡ����Ҫ���޵Ľγ�Ʒ�ƣ�1����� 2������");
				int choose = inputNextInt();
				if(choose==1){
					brand = "���";
					System.out.println("��ѡ����Ҫѡ��������ͺţ�1��������2��GL8");
					type = (inputNextInt() == 1)?"������":"GL8";
				}else if (choose == 2){
					brand = "����";
					System.out.println("��ѡ����Ҫѡ��������ͺţ�1��X6  2��550i");
					type = (inputNextInt() == 1)?"X6":"550i";
				}
			}else if (inputNextInt() == 2){
				//���޿ͳ�
				type = "";
				System.out.println("��ѡ����Ҫ���޵Ľγ�Ʒ�ƣ�1���� 2������");
				brand = (inputNextInt() == 1)?"��":"����";
				System.out.println("��ѡ����Ҫ���޵Ŀͳ���λ���� 1�� 16��  2�� 34��");
				seat = (inputNextInt() == 1)?16:34;
			}
			//�⳵
			MotoVehicle moto = motoMgr.motoLeaseOut(brand, type, seat) ;
			System.out.println("�����������޵�����");
			int days = inputNextInt();
			double money = moto.ca(days);
			System.out.println("�⳵�ɹ������ƺ�Ϊ��"+moto.getVhicleId());
			System.out.println("����Ҫ֧����"+money+"Ԫ");
		}
}
