package a;

import java.util.Scanner;


public class Sedanca extends automobile{
	private  String zuoweishu ;
	
	public void automo() {	
		System.out.println("******欢迎光临腾飞汽车租赁公司******");
		Scanner sc = new Scanner(System.in);
		System.out.println("1、轿车  \t 2、客车\n请选择你要租赁的汽车类型：");
		int i = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		
		if(i==1){//选择汽车品牌，1为轿车
		System.out.println("请选择你要租赁的汽车品牌：1、别克 2、宝马");
		int i1 = sc.nextInt();
		if(i1==1){//选择轿车类型
		System.out.println("请选择你要租赁的汽车类型：1、林萌大道 2、GL8");
		
		}else if(i2==1){
		System.out.println("请输入您要选择的天数：");	
		
		}
		//选择汽车品牌
		}else if(i==2) {//选择汽车品牌，2为客车
		System.out.println("请选择你要租赁的汽车品牌：1、金龙 2、金杯");
		int i1 = sc.nextInt();
		if(i1==2){//选择客车类型
		System.out.println("请选择你要租赁的汽车类型：1、16座 2、34座");	
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
