package Hasmapimpl;

public class Node {

String key;
String value;
Node next;

Node(String key,String value ){
	this.key=key;
	this.value=value;
}

public String getKey() {
	return key;
}

public void setKey(String key) {
	this.key = key;
}

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}

public Node getNext() {
	return next;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((key == null) ? 0 : key.hashCode());
	result = prime * result + ((next == null) ? 0 : next.hashCode());
	result = prime * result + ((value == null) ? 0 : value.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Node other = (Node) obj;
	if (key == null) {
		if (other.key != null)
			return false;
	} else if (!key.equals(other.key))
		return false;
	if (next == null) {
		if (other.next != null)
			return false;
	} else if (!next.equals(other.next))
		return false;
	if (value == null) {
		if (other.value != null)
			return false;
	} else if (!value.equals(other.value))
		return false;
	return true;
}

public void setNext(Node next) {
	this.next = next;
}

}
