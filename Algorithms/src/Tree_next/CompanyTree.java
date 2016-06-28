package Tree_next;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class CompanyTree {

	public static void main(String[] args) throws IOException {

		CompanyTree company = new CompanyTree();

		Employ em1 = new Employ(1, "ABC", 2);
		Employ em2 = new Employ(2, "PRW", 0);
		Employ em3 = new Employ(3, "DEF", 2);
		Employ em4 = new Employ(4, "PRE", 3);
		Employ em5 = new Employ(5, "DKF", 4);

		HashMap<Integer, Employ> employeeList = new HashMap<Integer, Employ>();
		employeeList.put(1, em1);
		employeeList.put(2, em2);
		employeeList.put(3, em3);
		employeeList.put(4, em4);
		employeeList.put(5, em5);
		Employ boss = null;

		String empId = "1,2,3,4,5";
		String empName = "ABC,PRW,DEF,PRE,DKF";
		String managerId = "2,0,2,3,4";
		String[] eempId = empId.split(",");
		String[] eempname = empName.split(",");
		String[] eempManagerId = managerId.split(",");
		HashMap<Integer, Employ> empIndex = new HashMap<Integer, Employ>();
		HashMap<Integer, ArrayList<Integer>> emphirerchy = new HashMap<Integer, ArrayList<Integer>>();

		ArrayList<Integer> subemplist = null;
		for (int i = 0; i < 5; i++) {
			Employ emp = new Employ(Integer.parseInt(eempId[i]), eempname[i],
					Integer.parseInt(eempManagerId[i]));
			empIndex.put(Integer.parseInt(eempId[i]), emp);
			if (emphirerchy.get(Integer.parseInt(eempId[i])) != null) {
				ArrayList<Integer> hire = emphirerchy.get(Integer
						.parseInt(eempManagerId[i]));
				hire.add(Integer.parseInt(eempId[i]));
			}

			else {
				ArrayList<Integer> hiree = new ArrayList<Integer>();
				hiree.add(Integer.parseInt(eempId[i]));
				emphirerchy.put(Integer.parseInt(eempManagerId[i]), hiree);
			}
			if (Integer.parseInt(eempManagerId[i]) == 0) {

				boss = emp;
			}

		}
		Queue<Integer> linkedList=new LinkedList<Integer>();

		int level = emphirerchy.size();
		
		System.out.println("boss   " + boss.getName());
		ArrayList<Integer> levelemp = emphirerchy.get(boss.getId());
		int lelevelCount = levelemp.size();
		System.out.println(boss.getName());
		int hirerchyCount=emphirerchy.size();
		
			linkedList.offer(boss.getId());
			while(linkedList.isEmpty()){
				
				int e=linkedList.poll();
				ArrayList<Integer>elist=emphirerchy.get(e);
				Iterator<Integer>itr=elist.iterator();
				while(itr.hasNext()){
					Integer ee=itr.next();
					Employ em=empIndex.get(ee);
					System.out.println(em.getName());
					ArrayList<Integer> sunordinate=emphirerchy.get(ee);	
				    Iterator i=sunordinate.iterator();
				    while (i.hasNext()) {
						linkedList.offer((Integer) i.next());
						
					}
				}
				
				
			}
             
			
			
		

	}
}
