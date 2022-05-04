package datastructures.trees;

public class BinaryNode<E> {
 E value;
 BinaryNode<E> left;
 BinaryNode<E> right;

 public BinaryNode(E value) {
	 this.value=value;
	 this.left=null;
	 this.right=null;
}
 
 @Override
	public String toString() {
		return this.value.toString();
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
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
	BinaryNode other = (BinaryNode) obj;
	if (value == null) {
		if (other.value != null)
			return false;
	} else if (!value.equals(other.value))
		return false;
	return true;
}

public E getValue() {
	return value;
}

public void setValue(E value) {
	this.value = value;
}

public BinaryNode<E> getLeft() {
	return left;
}

public void setLeft(BinaryNode<E> left) {
	this.left = left;
}

public BinaryNode<E> getRight() {
	return right;
}

public void setRight(BinaryNode<E> right) {
	this.right = right;
}
 
}
