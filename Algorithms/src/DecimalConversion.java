import java.util.HashMap;
import java.util.Stack;


public class DecimalConversion {
    Stack st = new Stack();
    private static HashMap<Integer, String> hm = new HashMap<Integer, String>();
     
    /**
     * converts number to given base
     * @param number
     * @param base
     */
    public void decimalToXXXConversion(int number, int base) {
        System.out.println("Number "+number+" in base "+base+" is: ");
        while(number>0) {
            st.push(number%base);
            number = number/base;
        }
         
        while(!st.isEmpty()) {
            int n = (int) st.pop();
            if(n>9) {
                String str = hm.get(n);
                System.out.print(str);
            } else {
                System.out.print(n);
            }
        }
        System.out.println();
    }
     
    /**
     * @param args
     */
    public static void main(String[] args) {
        DecimalConversion dc = new DecimalConversion();
     
        // decimal to binary conversion
        dc.decimalToXXXConversion(100, 2);
 
        // decimal to octal conversion
        dc.decimalToXXXConversion(100, 8);
                 
        // decimal to hexadecimal conversion
        hm.put(10, "A");
        hm.put(11, "B");
        hm.put(12, "C");
        hm.put(13, "D");
        hm.put(14, "E");
        hm.put(15, "F");
        dc.decimalToXXXConversion(10012, 16);   
    }
}