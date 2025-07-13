package IMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.MSDao;
import POJO.MaterialRes;
import POJO.MaterialSend;
import Utility.DBUtility;

public class MSDaoImpl implements MSDao{

	@Override
	public boolean addMaterial(MaterialSend M) {
		Connection con=DBUtility.getConnect();
		String sql = "insert into M_Send(poNum,poDate,outDate,docNum,mType,itemSize,itemCode,itemName,itemQty,itemPrice,vehNum,tranName) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, M.getPoNum());
			MDaoImpl mdi=new MDaoImpl();
			MaterialRes mr=mdi.showMaterial(M.getPoNum());
			ps.setString(2, mr.getPoDate());
			ps.setString(3, M.getOutDate());
			ps.setInt(4, mr.getDocNum());
			ps.setString(5, mr.getmType());
			ps.setInt(6, mr.getItemSize());
			ps.setString(7, mr.getItemCode());
			ps.setString(8, mr.getItemName());
			ps.setInt(9, mr.getItemQty());
			ps.setDouble(10, mr.getItemPrice());
			ps.setString(11, M.getVehNum());
			ps.setString(12, M.getTranName());
			int i=ps.executeUpdate();
			if(i>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateMaterial(MaterialSend M) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMaterial(int poNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MaterialSend showMaterial(int poNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
