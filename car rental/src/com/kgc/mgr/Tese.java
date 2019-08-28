package com.kgc.mgr;

import java.util.Scanner;

import com.kgc.vehicle.MotoVehicle;

public class Tese {
		/**
		 * 请输入选择
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
			System.out.println("******欢迎光临汽车租赁公司******");
			System.out.println("1、轿车\t2、客车");
			System.out.println("请选择您要租赁的车型类型：");
			//int motoType = input.nextInt();
			//租车条件
			String brand = "";//品牌
			String type = "";//型号
			int seat = 0; //座位数
			//客户选车
			if(inputNextInt() == 1){
				//租赁轿车
				System.out.println("请选择您要租赁的轿车品牌：1、别克 2、宝马");
				int choose = inputNextInt();
				if(choose==1){
					brand = "别克";
					System.out.println("请选择您要选择的汽车型号：1、林荫大道2、GL8");
					type = (inputNextInt() == 1)?"林荫大道":"GL8";
				}else if (choose == 2){
					brand = "宝马";
					System.out.println("请选择您要选择的汽车型号：1、X6  2、550i");
					type = (inputNextInt() == 1)?"X6":"550i";
				}
			}else if (inputNextInt() == 2){
				//租赁客车
				type = "";
				System.out.println("请选择您要租赁的轿车品牌：1、金杯 2、金龙");
				brand = (inputNextInt() == 1)?"金杯":"金龙";
				System.out.println("请选择您要租赁的客车座位数： 1、 16座  2、 34座");
				seat = (inputNextInt() == 1)?16:34;
			}
			//租车
			MotoVehicle moto = motoMgr.motoLeaseOut(brand, type, seat) ;
			System.out.println("请输入您租赁的天数");
			int days = inputNextInt();
			double money = moto.ca(days);
			System.out.println("租车成功，车牌号为："+moto.getVhicleId());
			System.out.println("您需要支付："+money+"元");
		}
}
