package OverridingvsOverloading;

class Animal {
	// Use 'static' or 'private' access modifiers to see how method hiding work.
	private void testInstancePrivateMethod(String source) {
	    System.out.println("\tAnimal: instance Private method calling from "+source);
	}
	public void testInstanceMethodUsingPrivateMethodInside() {
	    System.out.println("\tAnimal: instance Public method with using of Private method.");
	    testInstancePrivateMethod( Animal.class.getSimpleName() );
	}

	// Use default, 'protected' or 'public' access modifiers to see  how method overriding work.
	protected void testInstanceProtectedMethod(String source) {
	    System.out.println("\tAnimal: instance Protected method calling from "+source);
	}
	public void testInstanceMethodUsingProtectedMethodInside() {
	    System.out.println("\tAnimal: instance Public method with using of Protected method.");
	    testInstanceProtectedMethod( Animal.class.getSimpleName() );
	  } 
	}  


	public class Cat extends Animal {
	private void testInstancePrivateMethod(String source) {
	    System.out.println("Cat: instance Private method calling from " + source );
	}
	public void testInstanceMethodUsingPrivateMethodInside() {
	    System.out.println("Cat: instance Public method with using of Private method.");
	    testInstancePrivateMethod( Cat.class.getSimpleName());
	    System.out.println("Cat: and calling parent after:");
	    super.testInstanceMethodUsingPrivateMethodInside();
	}

	protected void testInstanceProtectedMethod(String source) {
	    System.out.println("Cat: instance Protected method calling from "+ source );
	}
	public void testInstanceMethodUsingProtectedMethodInside() {
	    System.out.println("Cat: instance Public method with using of Protected method.");
	    testInstanceProtectedMethod(Cat.class.getSimpleName());
	    System.out.println("Cat: and calling parent after:");
	    super.testInstanceMethodUsingProtectedMethodInside();
	}

	public static void main(String[] args) {
	    Cat myCat = new Cat();
	    System.out.println("----- Method hiding -------");
	    myCat.testInstanceMethodUsingPrivateMethodInside();
	    System.out.println("\n----- Method overriding -------");
	    myCat.testInstanceMethodUsingProtectedMethodInside();
	}
	}