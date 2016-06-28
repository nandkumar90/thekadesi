package Practice;

import java.util.HashMap;

public class LRUCacheImplUsingHashMap {
	HashMap<Integer, Node> hashMap = new HashMap<Integer, Node>();
	Node head = null;
	Node end = null;
	int capacity = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int remove(Node end) {
		return 0;
	}

	public void put(int key, int value) {
		if (hashMap.size() < capacity) {
			Node node = new Node();
			node.value = key;
			hashMap.put(key, node);
			setHead(node);

		}

		else {
        remove(end);
        Node  node=new Node();
        node.value=key;
        hashMap.put(key, node);
        setHead(node);	
		}

	}

	public Node get(int key) {
		Node node=hashMap.get(key);
		remove(node);
		setHead(node);
		return node;
	}

	public void setHead(Node node) {

		Node temp = node;
		if (head != null) {

			head.prev = node;
			temp.next = head;
			temp.prev = null;
			head = temp;

		} else {

			head = node;
			head.next = null;
			head.prev = null;
		}
	}
}
