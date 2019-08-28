package com.kgc.mgr;

import com.kgc.vehicle.Bus;
import com.kgc.vehicle.Car;
import com.kgc.vehicle.MotoVehicle;

//����ҵ����
public class MotoOperation {
	//�������͵����飬����������Ϊ��������
	public MotoVehicle[]motos = new MotoVehicle[8];
	
	public MotoOperation() {
		motos [0] = new Car("��N12345","����",800,"X6"); //MotoVehicle  m = new Car();
		motos [1] = new Car("��U88888","����",600,"550i");
		motos [2] = new Car("��G66666","���",300,"������");
		motos [3] = new Car("��H98889","���",800,"G28");
		motos [4] = new Bus("��O00000","��",1500,16);
		motos [5] = new Bus("��Y22222","��",800,34);
		motos [6] = new Bus("��F33333","����",800,16);
		motos [7] = new Bus("��S44444","����",1500,34);
	}
	//��ʼ��������Ϣ
	/*public void init(){
		
	}*/
	//�⳵:�����û��ṩ������ȥ���������в�����Ӧ�ĳ���������
	//������޵��ǿͳ�  ��Ҫ������ : Ʒ��  ��λ��  �ͺ�null
	//������޵��ǽγ�  ��Ҫ������ : Ʒ��  ��λ��  ��λ��0
	public MotoVehicle  motoLeaseOut(String brand, String type,int seat){
		MotoVehicle  moto = null;
		//init ();
		for(MotoVehicle mymoto : motos){
			if (mymoto instanceof  Car){
				Car car=(Car)mymoto;
				if(car.getBrand().equals(brand)&&car.getType().equals(type)){
					moto = car;
					break;
				}
			}else {
				Bus bus = (Bus)mymoto;
				if(bus.getBrand().equals(brand) && bus.getSeatCount()==seat){
					moto = bus;
					break;
				}
			}
		}
		return moto;
	}
}
