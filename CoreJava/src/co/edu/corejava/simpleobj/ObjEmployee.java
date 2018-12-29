package co.edu.corejava.simpleobj;

public class ObjEmployee {
	
	public ObjEmployee() {
		
	}
			
	public ObjEmployee(String eName, long ePhoneNo, long eId) {
		super();
		this.eName = eName;
		this.ePhoneNo = ePhoneNo;
		this.eId = eId;
	}
	
	private String eName;

	private long ePhoneNo;
	
	private long eId;
	
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public long getePhoneNo() {
		return ePhoneNo;
	}

	public void setePhoneNo(long ePhoneNo) {
		this.ePhoneNo = ePhoneNo;
	}

	public long geteId() {
		return eId;
	}

	public void seteId(long eId) {
		this.eId = eId;
	}

	@Override
	public String toString() {
		return "ObjEmployee [eName=" + eName + ", ePhoneNo=" + ePhoneNo + ", eId=" + eId + "]";
	}

	
}
