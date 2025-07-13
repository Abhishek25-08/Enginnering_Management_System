package IMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import DAO.MDao;
import POJO.MaterialRes;
import Utility.DBUtility;

public class MDaoImpl implements MDao{

	@Override
	public boolean addMaterial(MaterialRes M) {
		Connection con=DBUtility.getConnect();
		String sql = "insert into M_Receive(poNum,poDate,inDate,docNum,mType,itemSize,itemCode,itemName,itemQty,itemPrice) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, M.getPoNum());
			ps.setString(2, M.getPoDate());
			ps.setString(3, M.getInDate());
			ps.setInt(4, M.getDocNum());
			ps.setString(5, M.getmType());
			ps.setInt(6, M.getItemSize());
			ps.setString(7, M.getItemCode());
			ps.setString(8, M.getItemName());
			ps.setInt(9, M.getItemQty());
			ps.setDouble(10, M.getItemPrice());
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
	public boolean updateMaterial(MaterialRes M) {
		Connection con=DBUtility.getConnect();
		String sql = "update M_Receive set poDate=?,inDate=?,docNum=?,mType=?,itemSize=?,itemCode=?,itemName=?,itemQty=?,itemPrice=? where poNum=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			//ps.setInt	(1,M.getmId());
			ps.setInt	(10,M.getPoNum());	
			ps.setString(1,M.getPoDate());	
			ps.setString(2,M.getInDate());
			ps.setInt	(3,M.getDocNum());
			ps.setString(4,M.getmType());
			ps.setInt	(5,M.getItemSize());
			ps.setString(6,M.getItemCode());
			ps.setString(7,M.getItemName());
			ps.setInt	(8,M.getItemQty());
			ps.setDouble(9,M.getItemPrice());
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
	public boolean deleteMaterial(int poNum) {
		Connection con=DBUtility.getConnect();
		String sql="delete from M_Receive where poNum=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, poNum);
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
	public MaterialRes showMaterial(int poNum) {
		Connection con=DBUtility.getConnect();
		MaterialRes MR=null;
		String sql="select * from M_Receive where poNum=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, poNum);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				MR=new MaterialRes();
				MR.setmId		(rs.getInt		(1));
				MR.setPoNum		(rs.getInt		(2));
				MR.setPoDate		(rs.getString	(3));
				MR.setInDate		(rs.getString	(4));
				MR.setDocNum		(rs.getInt		(5));
				MR.setmType		(rs.getString	(6));
				MR.setItemSize	(rs.getInt		(7));
				MR.setItemCode	(rs.getString	(8));
				MR.setItemName	(rs.getString	(9));
				MR.setItemQty	(rs.getInt		(10));
				MR.setItemPrice	(rs.getDouble	(11));
				return MR;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
