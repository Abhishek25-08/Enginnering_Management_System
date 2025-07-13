package POJO;

public class MaterialSend {
	private int billNum;
	private int poNum;
	private String poDate;
	private String outDate;
	private int docNum;
	private String mType;
	private int itemSize;
	private String itemCode;
	private String itemName;
	private int itemQty;
	private double itemPrice;
	private String vehNum;
	private String tranName;
	public MaterialSend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MaterialSend(int poNum, String poDate, String outDate, int docNum, String mType, int itemSize,
			String itemCode, String itemName, int itemQty, double itemPrice, String vehNum, String tranName) {
		super();
		this.poNum = poNum;
		this.poDate = poDate;
		this.outDate = outDate;
		this.docNum = docNum;
		this.mType = mType;
		this.itemSize = itemSize;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
		this.vehNum = vehNum;
		this.tranName = tranName;
	}
	
	public MaterialSend(int poNum, String outDate, String vehNum, String tranName) {
		super();
		this.poNum = poNum;
		this.outDate = outDate;
		this.vehNum = vehNum;
		this.tranName = tranName;
	}
	public int getBillNum() {
		return billNum;
	}
	public void setBillNum(int billNum) {
		this.billNum = billNum;
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
	public String getOutDate() {
		return outDate;
	}
	public void setOutDate(String outDate) {
		this.outDate = outDate;
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
	public String getVehNum() {
		return vehNum;
	}
	public void setVehNum(String vehNum) {
		this.vehNum = vehNum;
	}
	public String getTranName() {
		return tranName;
	}
	public void setTranName(String tranName) {
		this.tranName = tranName;
	}
	@Override
	public String toString() {
		return "MaterialSend [billNum=" + billNum + ", poNum=" + poNum + ", poDate=" + poDate + ", outDate=" + outDate
				+ ", docNum=" + docNum + ", mType=" + mType + ", itemSize=" + itemSize + ", itemCode=" + itemCode
				+ ", itemName=" + itemName + ", itemQty=" + itemQty + ", itemPrice=" + itemPrice + ", vehNum=" + vehNum
				+ ", tranName=" + tranName + "]";
	}
	
	
}
