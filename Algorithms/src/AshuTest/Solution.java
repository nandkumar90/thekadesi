package AshuTest;


import java.util.*;

class Solution{
   
    static boolean ok(int i ,int j ,int k , String s){
        
        if((s.charAt(i)*100 + s.charAt(j)*10 + s.charAt(k))%8==0)
          return true ;
        else
            return false ;
    }
    
    static void check(String z){
        
        int si = z.length();
         
        if(si==0){
                System.out.println("NO");
                return ;
            }
      
        if(si==1){
            if(Integer.parseInt(z)%8==0){
                System.out.println("YES");
                return ;
            }
            System.out.println("NO");
                return ;
        }
        
        if(si==2){
            int a = z.charAt(0)-48 ;
            int b = z.charAt(1)-48 ;
            
            if(((a*10+b)%8==0) || ((b*10+a)%8==0)){
                System.out.println("YES");
                return ;
            }
            System.out.println("NO");
                return ;
        }
        
         
        for(int i=0 ; i < si-2 ;i++){
                for(int j=i+1 ; j < si-1 ; j++){
                       for(int k = j+1 ; k < si ; k++ ){
                         
                     if(ok(i,j,k,z) || ok(i,k,j,z) || ok(j,i,k,z) || ok(j,k,i,z) || ok(k,j,i,z) || ok(k,i,j,z) ){
                         System.out.println("YES");
                            return ;    
                     }  
                  }
                }
        }
        
        System.out.println("NO");    
    }
    
    
    public static void main(String ss[]){
        Scanner s = new Scanner(System.in);
       
            String  z = s.nextLine();
            check(z);
       
    }
}