package co.edu.madr.corejava.equals;

import java.util.Objects;

public class EqEmp {
	
	public EqEmp(String eName, int eSalary) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
	}

	private String eName;
	
	private int eSalary;

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public long geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "EqEmp [eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
	@Override
    public int hashCode() {
        return this.eSalary;
    }
	
	@Override
	public boolean equals(Object o) {
		EqEmp emp = (EqEmp) o;
		if(this.eName.equals(emp.eName)) {
			return true;
		}
		return false;
	}
}
