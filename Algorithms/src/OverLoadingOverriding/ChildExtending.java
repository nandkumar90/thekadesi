package OverLoadingOverriding;

public class ChildExtending extends ParentAbstract{

    public int childInt =111213;
    static{
        System.out.println("child static block executed");
    }

    public ChildExtending() {
        System.out.println("child const initialized");
    }
    public void MethodInChild(){
        System.out.println("MethodInChild called");
    }
    public static void main(String[] args){
        System.out.println(ParentAbstract.parentInt);
        System.out.println(ChildExtending.parentInt);
    }
}
