package datastructures.arrays;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class MyArray<E> {
	int length;
	List<E> objects;
	public MyArray() {
		this.length=0;
		objects=new ArrayList<E>();
	}
	
	void push(E object){
		objects.add(object);
	}
	E get(int index){
		return objects.get(index);
	}
	
	void pop(){
		objects.remove(objects.size()-1);
		System.out.println("After pop"+(objects.size()-1));
	}
	
	E deleteByAPI(int index){
		long st=new Date().getTime();
		E obj=objects.get(index);
		objects.remove(index);
		System.out.println("After delete"+(objects.size()-1));
		long ed=new Date().getTime();
		System.out.println("took" + (ed-st));
		return obj;
	}

	
	E deleteBySgifting(int index){
	long st=new Date().getTime();
		E obj=objects.get(index);
		int total=objects.size()-1;
		System.out.println("Size:"+total);
		for(int i=index;i<total-1;i++) {
			objects.remove(i);
			objects.add(i, objects.get(i+1));
			/*if(i==5)
				break;*/
		}
		objects.remove(objects.size()-1);
		long ed=new Date().getTime();
		System.out.println("took" + (ed-st));
		System.out.println("After delete and shift"+(objects.size()-1));
		return obj;
	}
	
	void display() {
		for(E item:objects)
			System.out.print(item+",");
	}

}
public class MyArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray<String> myArray=new MyArray<String>();
		myArray.push("ffsfsdf");
		myArray.push("ad");
		myArray.push("ffsd");
		myArray.push("qq");
		myArray.push("jgff");
		myArray.push("wrwrw");
		System.out.println(myArray.get(0));
		System.out.println(myArray.deleteByAPI(0));		
		System.out.println(myArray.deleteBySgifting(0));
		myArray.pop();
		myArray.display();
		
		
		

	}

}
