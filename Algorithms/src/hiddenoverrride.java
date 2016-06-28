
 class hiddenoverrride {

  public static void show(){
    System.out.println("Parent");
  }
}

 class Child extends hiddenoverrride{

  public static void show(){
    System.out.println("Child");
  }
  public static void main(String[] args) {
	    hiddenoverrride parent=new Child();
	    parent.show(); // it will call parent show method
	  }
}



