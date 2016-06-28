package Hasmapimpl;

public class CustomizeHashMapImpl {
	
	Node arr[]=new Node[16];

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public void put(String key, String value){
		int index=key.hashCode()%16;
		Node node=arr[index];
		if(node==null)
		{
			Node n=new Node(key,value);
			n.setNext(null);
			arr[index]=n;
		
		}
		
		else {
			while(node.getNext()!=null)
			{
				node=node.getNext();
				
				
			}
			
		}
		
	}
	
	public Node get(String key){
		
		int index=key.hashCode()%16;
		Node node=arr[index];
		if(node.getKey().equals(key))
			return node;
		else {
			while(node.getNext()!=null){
			 node =node.getNext();
			 if(node.getKey().equals(key))
					return node;
				
				
			}
			return null;
			
			
		}
					
					
	
	}

}
