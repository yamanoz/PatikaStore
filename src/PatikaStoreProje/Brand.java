package PatikaStoreProje;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Brand implements Comparable<Brand> {
	
	private int id;
	private String name;
	
	private static int count;
	public static Set<Brand> brands=new TreeSet<>();
	
	
	
	public Brand() {
		
	}
	public Brand(String name) {
		
		this.name=name;
		count++;
		this.id=count;
		
	}
	@Override
	public int compareTo(Brand o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	/*public void printBrands() {
		
		Iterator itr=brands.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	*/
	public void printBrands() {
		
		for(Brand b:brands) {
			System.out.println(b.getName());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
