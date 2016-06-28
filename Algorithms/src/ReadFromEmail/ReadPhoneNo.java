package ReadFromEmail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadPhoneNo {
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fileReader = null;
		List emailList = null;
		try {
			fileReader = new FileReader(
					new File(
							"F:\\email.txt"));

			br = new BufferedReader(fileReader);
			Scanner s = new Scanner(fileReader);

			emailList = new ArrayList();
			System.out.println();
			while (s.hasNext()) {
				//final String RE_MAIL = "([\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Za-z]{2,4})";
				// Pattern p = Pattern.compile(RE_MAIL);
				// Pattern p = Pattern.compile("^[a-zA-Z]+([0-9]+).*");
				String value = "   New Requestmumbai  04/23/2016 you location  \n" +
    "\n" +
    " User  Admin Check  via mail.drop.com 0123456789";
				Pattern p = Pattern.compile("\\s?(\\d{10})\\s?");
				String line = s.nextLine();
				
//				System.out.println(line);
				Matcher m = p.matcher(line);
				while (m.find()) {
					String email = m.group(1).trim();
					if (!emailList.contains(email)) {
						emailList.add(email);
					}
				}
			}
			for (int i = 0; i < emailList.size(); i++) {
				System.out.println(emailList.get(i));
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException:- " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException:- " + e.getMessage());
		} finally {
			try {
				fileReader.close();
				br.close();
			} catch (IOException e) {
				System.out.println("IOException Finally:- " + e.getMessage());
			}
		}

	}
}
