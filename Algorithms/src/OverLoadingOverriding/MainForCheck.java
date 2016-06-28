package OverLoadingOverriding;

public class MainForCheck {
    public static void main(String[] args){
    /*  ParentAbstract pa = new ParentAbstract(){

        };*/

    /*  ChildExtending ce = new ChildExtending();
        ce.childInt=5;*/

        /*ChildExtending ce = new ChildExtending();
        ce.childInt=5;
        ce.MethodInChild();
        System.out.println("pareny int is"+ce.parentInt);*/


        ChildExtending ce = new ChildExtending();
        ce.MethodInParent();

    }
}