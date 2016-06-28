package Practice;

//author nand

public class ReversenthNodeFromLast {

	public static Node head;
	public static int count = 0;

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
			System.out.println(temp.value);
			temp = temp.next;
		}
		// it will swaped 1 && 4
		swapNthnodefromLast(head, 3);

		temp = head;
		// it will print new list
		while (temp != null) {
			System.out.println("   " + temp.value);
			temp = temp.next;
		}

	}

	public static void swapNthnodefromLast(Node root, int pos) {

		if (root == null)
			return;

		else {
			swapNthnodefromLast(root.next, pos);
			count++;
			if ((count - 1) == pos) {
				Node Nodetoreplace = root.next;
				Node temp1 = head.next;
				head.next = Nodetoreplace.next;
				root.next = head;
				head = Nodetoreplace;
				head.next = temp1;
			}
		}
	}

	public static Node RevertElementsbyK(Node root, int k) {
		Node prev = null, next = null;
		Node current = root;
		int count = 0;

		while (count < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		if (root != null)
			root = current.next;

		count = 0;
		while (count < k - 1 && current != null) {
			current = current.next;

		}

		if (current != null)
			current.next = RevertElementsbyK(current.next, k);

		return prev;

	}
	
	
	public static Node swapPairwise(Node root,int k){
		Node current=root;
		Node prev=null;
		Node next=null;
		int count =0;
		
		while(count <k){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(next!=null)
			root.next=swapPairwise(next, k);
		
		
		return prev;
		
	}

	
	
	
}
