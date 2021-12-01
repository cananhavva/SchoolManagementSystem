package SMSystem;

public enum TELEPHONE_TYPE {
	HOME(1), CELLPHONE(2), GUARDIAN(3);
	
	private int idx;
	
	TELEPHONE_TYPE(int idx) {
		this.idx = idx;
	}
	
	public int getTelephoneIndex() {
		return this.idx;
	}
}
