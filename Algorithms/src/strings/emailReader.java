package strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailReader {
	/*if (filew.exists() && filew.isFile() && filew.length() > 1024) {
		f++;
		File filess = new File("D:\\email" + f + ".txt");
		 fw = new FileWriter(filess.getAbsoluteFile());
	}*/
	
	 private static Pattern emailNamePtrn = Pattern.compile(
			    "@");
			   
	public static void main(String[] args) throws IOException {
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern pattern = Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}");

		FileReader file = null;
		int f = 0;
		File filew = null;
		try {
			//D:\dmps\aminno_member_email.dump
			file = new FileReader(new File(
					"D:\\dmps\\aminno_member_email.dump\\aminno_member_email.dump"));
			filew = new File("D:\\email.txt");
		} catch (FileNotFoundException e1) {
			System.err.println("File dichromatic.dat not found!");
			e1.printStackTrace();
		}
		FileWriter fw = new FileWriter(filew.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(file);
		String line;
		try {
			while ((line = br.readLine()) != null) {
				String[] str=line.split(",");
				for(String s:str){
					//System.out.println(s);
				//Matcher matcher = pattern.matcher(line.toUpperCase());
				//bw.write(line);
			    //System.out.println(line);
                 if(s.contains("@")){
                	 bw.write(s);
                	 bw.newLine();
                        // System.out.println(s);
                 }
                 
				/* if (validateEmailAddress(s)) {    
		                System.out.println(": '" + s + "'");
		            }*/}
			}

		} catch (IOException e) {
			System.err.println("Error when reading");
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
         } catch (IOException e) {
                    System.err.println("Unexpected error");
                    e.printStackTrace();
                }
            }
        }

	}
	public static boolean validateEmailAddress(String userName){
        
        Matcher mtch = emailNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
}
