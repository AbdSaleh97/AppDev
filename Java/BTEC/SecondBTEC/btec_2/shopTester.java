package btec_2;

import java.util.ArrayList;

/*
 * @author Abdsaleh
 */
public class shopTester {
	public static void main(String []args)
	{
		Product p1 = new Skirt("red","coton",30.99);
		
		Product p2 = new Skirt("blue","wool",40.99);
		
		Product p3 = new Jacket("blue","Jeans",20.99);
		
		ClothingStore s1 = new ClothingStore();
		s1.setListOfProducts(new ArrayList<>());
		s1.setListOfSubscribers(new ArrayList<>());
				
		s1.addProduct(p2);
		
		s1.addProduct(p1);
	
		Customer c1 = new Customer("Ahamd", s1);

		Customer c2 = new Customer("Saleh", s1);
		
		Product p4 = new Jacket("Red","Coton",25.99);
		
		s1.addProduct(p4);
	
		s1.notifiy();
		c1.unsubscribe();
		
		s1.notifiy();
		
		s1.addProduct(p3);
		
		c1.subscribe();
		
		s1.notifiy();
		
		Product p5 = new Dress("green","polystreen",25.5);
		
		Customer c3 = new Customer("sara", s1);
		s1.addProduct(p5);
		
		
		
		Product p6 = new Shirt("blue","cotton",2.99);
		
		ClothingStore s2 = new ClothingStore();
		s2.setListOfProducts(new ArrayList<>());
		s2.setListOfSubscribers(new ArrayList<>());
		
		s2.addProduct(p6);
		
		Customer kalaf = new Customer("kalaf", s2);
		
//		s2.notifiy();
		s1.removeProduct(p6);

		Product p7 = new Pants("Brown","cotton",15.99);
		s2.addProduct(p7);
		
		Customer c5 = new Customer("sarah", s2);
		
		s2.notifiy();
		s1.unsubscribe(c3);
		
		kalaf.unsubscribe();
		
		Product p8 = new Dress("green","polystreen",10.99);
		s2.addProduct(p8);
		
		kalaf.subscribe();
		
		s2.notifiy();
		
		System.out.println(s1.getListOfSubscribers());
		System.out.println(s2.getListOfSubscribers());
		s1.subscribe(c3);
		
		
		System.out.println("****************");
		
		Product p9 = new Shirt("grey","silk",59.99);
		
		s1.addProduct(p9);
	}	
}
