package TEST;

import IMPL.MSDaoImpl;
import POJO.MaterialSend;

public class SendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MSDaoImpl msdi=new MSDaoImpl();
		MaterialSend ms=null;
		
		//Insert
		int poNum=55;
		String outDate="25-12-2024";
		String vehNum="MH04DR0004";
		String tranName="ToyotaInova";
		ms=new MaterialSend(poNum,outDate,vehNum,tranName);
		boolean flag=msdi.addMaterial(ms);
		if(flag) {
			System.out.println("Inserted");
		}
		
		
	}

}
