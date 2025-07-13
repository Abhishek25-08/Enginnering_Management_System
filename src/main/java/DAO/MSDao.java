package DAO;

import POJO.MaterialSend;

public interface MSDao {
		public boolean addMaterial(MaterialSend M);
		public boolean updateMaterial(MaterialSend M);
		public boolean deleteMaterial(int poNum);
		public MaterialSend showMaterial(int poNum);

}
