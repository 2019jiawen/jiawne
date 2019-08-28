package a;

import java.util.Scanner;


public class CalculatedRent extends automobile{
	private String xinghao;


	public void automo() {	
		Scanner sc = new Scanner(System.in);
		//选择汽车品牌
		int i = sc.nextInt();
		System.out.println("1、轿车  \t 2、客车\n请选择你要租赁的汽车类型：");
		if(i==2){
		System.out.println("请选择你要租赁的汽车品牌：1、金龙 2、金杯");
		return;
		}else {
			System.out.println("输入数字有错！");
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
