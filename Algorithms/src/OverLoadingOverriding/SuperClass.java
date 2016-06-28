package OverLoadingOverriding;

import java.io.FileNotFoundException;

public abstract class SuperClass {
	 //Overriden method
    public static  abstract int sum(Integer a, Integer b) throws FileNotFoundException;
    static {
    	
    	System.out.println("in parent static ");
    }
}
