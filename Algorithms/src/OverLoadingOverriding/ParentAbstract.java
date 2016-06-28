package OverLoadingOverriding;

public abstract class ParentAbstract {
	public static int parentInt = 80713;
	static {
		System.out.println("parent static executed");
		parentInt = 9;
	}

	public ParentAbstract() {
		System.out.println("parentAbstract initialized");
	}

	public void MethodInParent() {
		System.out.println("MethodInParent called");
		try {
			System.out.println("in try  ");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("in catch ");
			return;
		} finally {
			System.out.println("i don't know if this will get printed out.");
		}
	}

}
