package Practice;

public class ReverseNodeByaGivenNo {
	public static Node head = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one = new Node();
		one.value = 1;

		Node two = new Node();
		two.value = 2;

		Node three = new Node();
		three.value = 3;

		Node four = new Node();
		four.value = 4;

		Node five = new Node();
		five.value = 5;

		Node six = new Node();
		six.value = 6;
		six.next = null;

		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		head = one;
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
		}
		
		Node reverse=reverseNode(head, 2);
		while (reverse != null) {
			System.out.println(reverse.value);
			reverse = reverse.next;
		}	
	}

	public static Node reverseNode(Node node, int k){
	   Node next=null;
	   Node prev=null;
       Node current=node;
       int count=0;
       while(count<k){
    	   next=current.next;
    	   current.next=prev;
    	   prev=current;
    	   current=next;
    	   count++;
       }
		
       if(next!=null)
    	   head.next=reverseNode(next, k);
		return prev;
		}
	
}
