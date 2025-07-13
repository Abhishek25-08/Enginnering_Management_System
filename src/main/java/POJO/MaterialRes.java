package POJO;

public class MaterialRes {
	private int mId;
	private int poNum;
	private String poDate;
	private String inDate;
	private int docNum;
	private String mType;
	private int itemSize;
	private String itemCode;
	private String itemName;
	private int itemQty;
	private double itemPrice;
	
	
	
	public MaterialRes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public MaterialRes(int poNum, String poDate, String inDate, int docNum, String mType, int itemSize,
			String itemCode, String itemName, int itemQty, double itemPrice) {
		super();
		this.poNum = poNum;
		this.poDate = poDate;
		this.inDate = inDate;
		this.docNum = docNum;
		this.mType = mType;
		this.itemSize = itemSize;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}



	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getPoNum() {
		return poNum;
	}

	public void setPoNum(int poNum) {
		this.poNum = poNum;
	}

	public String getPoDate() {
		return poDate;
	}

	public void setPoDate(String poDate) {
		this.poDate = poDate;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public int getDocNum() {
		return docNum;
	}

	public void setDocNum(int docNum) {
		this.docNum = docNum;
	}

	public String getmType() {
		return mType;
	}

	public void setmType(String mType) {
		this.mType = mType;
	}

	public int getItemSize() {
		return itemSize;
	}

	public void setItemSize(int itemSize) {
		this.itemSize = itemSize;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}



	@Override
	public String toString() {
		return "MaterialRes [mId=" + mId + ", poNum=" + poNum + ", poDate=" + poDate + ", inDate=" + inDate
				+ ", docNum=" + docNum + ", mType=" + mType + ", itemSize=" + itemSize + ", itemCode=" + itemCode
				+ ", itemName=" + itemName + ", itemQty=" + itemQty + ", itemPrice=" + itemPrice + "]";
	}
	
	

}
