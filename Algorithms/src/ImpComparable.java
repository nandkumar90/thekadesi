import java.util.Comparator;
import java.util.Stack;
import java.util.TreeSet;


class Dog implements Comparable<Dog>{
	int size;
 
	Dog(int s) {
		size = s;
	}
 
	@Override
	public int compareTo(Dog o) {
		return o.size - this.size;
	}
}
 
class SizeComparator implements Comparator<Dog> {
	@Override
	public int compare(Dog d1, Dog d2) {
		return d1.size - d2.size;
	}}
public class ImpComparable {
	public static void main(String[] args) {
		TreeSet<Dog> d = new TreeSet<Dog>();
		d.add(new Dog(1));
		d.add(new Dog(2));
		d.add(new Dog(1));
		TreeSet<Dog> dd = new TreeSet<Dog>(new SizeComparator()); // pass comparator
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);
//		String s1 = "Hello";
//        StringBuffer sb = new StringBuffer(s1);
//        sb.reverse();
//        s1.concat(sb.toString());
//        System.out.println(s1 + sb + s1.length() + sb.length());
	}
}