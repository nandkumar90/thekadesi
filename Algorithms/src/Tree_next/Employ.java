package Tree_next;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Employ{
	private int id;
	private String name;
	private int superiorId;
	private Set<Integer> subordinateIds;
	
	public Employ(int id, String name, int superiorId){
		this.id = id;
		this.name = name;
		this.superiorId = superiorId;
		this.subordinateIds = null;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getSuperiorId(){
		return superiorId;
	}
	public void addSubordinate(int id){
		if(subordinateIds == null)
			subordinateIds = new HashSet<Integer>();
		subordinateIds.add(id);
	}
	
	@Override
	public String toString() {
		System.out.println(this.name);
		
		
		return super.toString();
	}
	
}
