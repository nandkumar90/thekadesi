package Practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Utilities {
	 private static Pattern VALID_IPV4_PATTERN = null;
	  private static Pattern VALID_IPV6_PATTERN = null;
	  private static final String ipv4Pattern = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
	  private static final String ipv6Pattern = "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";

	  static {
	    try {
	      VALID_IPV4_PATTERN = Pattern.compile(ipv4Pattern, Pattern.CASE_INSENSITIVE);
	      VALID_IPV6_PATTERN = Pattern.compile(ipv6Pattern, Pattern.CASE_INSENSITIVE);
	    } catch (PatternSyntaxException e) {
	      //logger.severe("Unable to compile pattern", e);
	    }
	  }

	  /**
	   * Determine if the given string is a valid IPv4 or IPv6 address.  This method
	   * uses pattern matching to see if the given string could be a valid IP address.
	   *
	   * @param ipAddress A string that is to be examined to verify whether or not
	   *  it could be a valid IP address.
	   * @return <code>true</code> if the string is a value that is a valid IP address,
	   *  <code>false</code> otherwise.
	   */
	  public static boolean isIpAddress(String ipAddress) {

	    Matcher m1 = Utilities.VALID_IPV4_PATTERN.matcher(ipAddress);
	    if (m1.matches()) {
	      return true;
	    }
	    Matcher m2 = Utilities.VALID_IPV6_PATTERN.matcher(ipAddress);
	    return m2.matches();
	  }

}
/*public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		String b = in.nextLine();
		for (int i = 0;i<testcase; i++){
			String test = in.nextLine();
			String splitter [] = test.split(" "); 
			if(splitter[0].matches("([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])") == true){
				System.out.println("IPv4");
			}
*/