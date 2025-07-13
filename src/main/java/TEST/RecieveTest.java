package TEST;

import IMPL.MDaoImpl;
import POJO.MaterialRes;

public class RecieveTest {
	public static void main(String[] args) {
		MaterialRes mr=new MaterialRes();
		MDaoImpl mdi=new MDaoImpl();
		//Insert
//		int poNum=55;
//		String poDate="12/4/2025";
//		String inDate="12/4/2025";
//		int docNum=3;
//		String mType="sfa";
//		int itemSize=4;
//		String  itemCode="PLUG5";
//		String itemName="DTYHS";
//		int itemQty=5;
//		double itemPrice=45.45;
//		mr=new MaterialRes(poNum,poDate,inDate,docNum,mType,itemSize,itemCode,itemName,itemQty,itemPrice);
//		boolean flag=mdi.addMaterial(mr);
//		if(flag) {
//			System.out.println("Inserted");
//		}
		
		//update
//		int poNum=55;
//		String poDate="13/4/2025";
//		String inDate="14/4/2025";
//		int docNum=0;
//		String mType="abc";
//		int itemSize=0;
//		String  itemCode="BUTTPLUG5";
//		String itemName="ASS";
//		int itemQty=0;
//		double itemPrice=420.69;
//		mr=new MaterialRes(poNum,poDate,inDate,docNum,mType,itemSize,itemCode,itemName,itemQty,itemPrice);
//		boolean flag=mdi.updateMaterial(mr);
//		if(flag) {
//			System.out.println("Updated");
//		}
		
		//delete
//		int poNum=55;
//		boolean flag=mdi.deleteMaterial(poNum);
//		if(flag) {
//			System.out.println("Deleted");
//		}
		
		//search By poNum
//		int poNum=55;
//		mr=mdi.showMaterial(poNum);
//		if(mr!=null) {
//			System.out.println(mr);
//		}
		
	}

}
