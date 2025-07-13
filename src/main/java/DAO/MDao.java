package DAO;

import java.util.List;

import POJO.MaterialRes;

public interface MDao {
	public boolean addMaterial(MaterialRes M);
	public boolean updateMaterial(MaterialRes M);
	public boolean deleteMaterial(int poNum);
	public MaterialRes showMaterial(int poNum);
}
