package Practice;
//author nand
public class MinMiddleInStack {
	public static Node head;
	public static int size = 0;
	public static Node min;
	public static Node middle;

	public static void main(String[] args) {
	

		MinMiddleInStack pairwise = new MinMiddleInStack();

		for (int i = 0; i < 10; i++) {
			pairwise.push(i);
			System.out.println(pairwise.getMin());
			System.out.println(pairwise.getmiddle());
		}

		for (int i = 0; i < 10; i++) {
			pairwise.pop();
			System.out.println(pairwise.getMin());
			System.out.println(pairwise.getmiddle());
		}

	}

	public int getMin() {

		return min.value;

	}

	public int getmiddle() {
		return middle.value;
	}

	// put element at top
	public void push(int n) {
		if (head == null) {
			Node temp = new Node();
			temp.value = n;
			temp.next = null;
			head = temp;
			min = head;
			middle = head;
			size++;
		}

		else {
			size++;
			Node temp = new Node();
			temp.value = n;
			temp.next = head;
			temp.prev = null;
			head.prev = temp;
			head = temp;

			if (n < head.value) {
				min = head;
			}
			if (size % 2 == 0)
				middle = middle.prev;
			else {
				if (middle.prev != null)
					middle = middle;
			}
		}

	}

	public int pop() {
		Node temp = head;
		head = head.next;
		size--;
		if (size % 2 == 0 && middle.next != null)
			middle = middle.next;
		else
			middle = middle;

		if (min.value == temp.value)
			System.out.println();

		return temp.value;
	}

}
