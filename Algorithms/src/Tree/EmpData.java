package Tree;

public class EmpData {
	int id;
	String Name;
	int mgrId;
	double salary;

	public EmpData(String string, String string2, String string3, String string4) {

		this.id=Integer.parseInt(string);
		this.Name=string2;
		this.mgrId=Integer.parseInt(string3);
		this.salary=Double.parseDouble(string4);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMgrId() {
		return mgrId;
	}

	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}
