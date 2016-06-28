import java.util.Stack;


public class putNextBiginArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []A ={7, 5, 6, 3, 4, 1, 2, 9, 11};
        int l=A.length;
		int j=1;
		Stack<Integer> eleA=new Stack<Integer>();
		Stack<Integer> index=new Stack<Integer>();
		
		eleA.push(A[0]);
		index.push(0);
		//http://www.careercup.com/question?id=6497025214382080
		while(j<l){
			while(!eleA.isEmpty() && A[j]>eleA.lastElement()){
				A[index.pop()]=A[j];
				eleA.pop();
			}
			
			eleA.push(A[j]);
			index.push(j);
			j++;
		}
		
		if(j==l){
			while(!index.isEmpty()){
				A[index.pop()]=eleA.pop();
			}
		}
		
		for(int a:A){
			System.out.print(a+" ");
		}
	}

}
