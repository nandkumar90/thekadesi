package Tree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrintHirerchy {

	public static void main(String a[]) {
		HashMap<Integer, EmpData> empMap = new HashMap<Integer, EmpData>();
		ArrayList<EmpData> empList = new ArrayList<EmpData>();
		String st1 = "id:1,2,3,4,5";
		String st2 = "name:harry,robbin,lilly,tom,jack";
		String str3 = "mgrId:3,4,2,0,2";
		String str4 = "salary:1000.00,1000.00,3000.00,5000.00,1500.00";

		String[] str5 = st1.split(":");
		String[] str6 = st2.split(":");
		String[] str7 = str3.split(":");
		String[] str8 = str4.split(":");

		String[] empId = str5[1].split(",");
		String[] empName = str6[1].split(",");
		String[] empMgrId = str7[1].split(",");
		String[] empSal = str8[1].split(",");

		int len = empId.length;
		for (int i = 0; i < len; i++) {

			EmpData emp = new EmpData(empId[i], empName[i], empMgrId[i],
					empSal[i]);
			empMap.put(Integer.parseInt(empId[i]), emp);
			empList.add(emp);
		}

		Collections.sort(empList, new Comparator<EmpData>() {

			@Override
			public int compare(EmpData o1, EmpData o2) {
				return o1.getSalary() > o2.getSalary() ? 1
						: (o1.getSalary() < o2.getSalary()) ? -1 : 0;
			}
		});

		/*for (EmpData e : empList) {
			System.out.println(e.id + "  " + e.Name);
		}*/
		System.out.println();
		List l=getempHirerchy(empMap, 1);
		System.out.println("end");
	}
	
	public static LinkedList<Integer> getempHirerchy(HashMap<Integer, EmpData>e,int reId){
		 int[] h = null;int count =0;
		 LinkedList<Integer> li=new LinkedList<Integer>();
		 do{
			 li.add(reId);
			 EmpData ee=e.get(reId);
			 reId=ee.getMgrId();
			 
		 }while(reId!=0);
		 
		 return li;
		
		
		
	}

}
