
public class Room extends Building{
   //It throws an unchecked exception
   void color() 
   {
       System.out.println("White");
   }  
   public static void main(String args[]){  
       Building obj = new Room();  
       obj.color(); 
   } 
}
class Building {  
	   void color() throws NullPointerException
	   {
	       System.out.println("Blue");
	   }  
	}