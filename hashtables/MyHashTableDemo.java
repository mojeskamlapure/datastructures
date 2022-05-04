package datastructures.hashtables;

import java.util.ArrayList;

class HashItem {
	String key;
	int value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public HashItem(String key, int i) {
		super();
		this.key = key;
		this.value = i;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		return this.getKey().equals(obj);
	}

	@Override
	public String toString() {
		return "HashItem [key=" + key + ", value=" + value + "]";
	}
	
	
	
}
class MyHashTable<E>{
	ArrayList<E> bucket[];
	
	public MyHashTable(int size) {
		bucket=new ArrayList[size];
	}
	
	int hashFunction(String key){
		int hash=0;
		for(int i=0;i<key.length();i++) {
			int part=hash+(int)key.charAt(i)*(i+78);
			hash=part%bucket.length;
		}
		return hash;
	}

	void set(String key, E item) {
		int address = hashFunction(key);
		ArrayList<E> list = bucket[address];
		if (list == null) {
			list = new ArrayList<E>();
			bucket[address]=list;
		}
		list.add(item);
		
	}
	
	void display() {
		System.out.println(" **************** HashTable **************** ");
		for(ArrayList<E> l:bucket) {
			System.out.println(l);
		}
	}
	
	ArrayList<String> getAllKeys() {
		ArrayList<String> keys=new ArrayList<String>();
		System.out.println(" **************** Keys **************** ");
		for(ArrayList<E> l:bucket) {
			if(l!=null)
			for(E item:l) {
				HashItem it=(HashItem)item;
				keys.add(it.getKey());
			}
		}
		return keys;
	}

	public E get(String key) {
		E item=null;
		int hashValue=hashFunction(key);
		System.out.println("hashValue\t"+hashValue);
		
		ArrayList<E> buck=bucket[hashValue];
		for(E entry :buck) {
			if(entry.equals(key)) {
				item=entry;
				break;
			}
		}
		return item;
		
	}
	
}
public class MyHashTableDemo {

	public static void main(String[] args) {
		
		MyHashTable<HashItem> mht=new MyHashTable<HashItem>(7);
		mht.set("abc",new HashItem("abc", 1000));
		mht.set("acb",new HashItem("acb", 2000));
		mht.set("abcd",new HashItem("abcd", 5000));
		mht.set("acb",new HashItem("xyz", 4000));
		//mht.display();
		System.out.println(mht.get("abc"));
		System.out.println(mht.get("acb"));
		System.out.println(mht.get("abcd"));
		mht.display();
		System.out.println(mht.getAllKeys());
	}

}
