package dymnamicProgrammig;

import java.util.Scanner;

public class TravelTime {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
	int arr[]={1,2,3,4};	
    int input2=arr.length;
    System.out.println(traveltime(arr, input2));
	}
	

    public static int traveltime(int[] input1,int input2)
    {  int max=0;
    	
    	for(int i=0;i<input2;i++){
    		for(int j=0;j<input2;j++){
    			
    			int cSum=clockSum(input1[i],input1[j],i,j);
    			int acSum=anticlockSum(input1[i],input1[j],i,j,input2);
                
    			int maxV=max(cSum,acSum);
    			if(maxV>max){
    				max=maxV;
    			}
    		}
    	}

		return max;
    }
    
    private static int anticlockSum(int i, int j, int i2, int j2,int  input2) {
        int pathvale=0;
        int diff=j2-i2-input2;
        pathvale=i+j+Math.abs(diff);
    	
    	return pathvale;
	}

 static int clockSum(int i, int j, int i2, int j2) {
		int pathvale=0;
        if(i2)
		int diff=i2-j2;
        pathvale=i+j+Math.abs(diff);
    	
    	return pathvale;
	}


	public static int min(int x,int y ){
    	
    	return x<y?x:y;
    }
	
	public static int max(int x,int y){
		return x>y?x:y;
	}

}
