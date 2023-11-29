package btec_2;

import java.util.ArrayList;

/*
 * @author Abdsaleh
 */
public class ClothingStore implements Subject{

	private ArrayList<Subscriber> listOfSubscribers;
	private ArrayList<Product> listOfProducts;
	
	
	public ArrayList<Subscriber> getListOfSubscribers() {
		return listOfSubscribers;
	}

	public void setListOfSubscribers(ArrayList<Subscriber> listOfSubscribers) {
		this.listOfSubscribers = listOfSubscribers;
	}

	public ArrayList<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(ArrayList<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	@Override
	public void subscribe(Subscriber sub) {
		listOfSubscribers.add(sub);
	}

	@Override
	public void unsubscribe(Subscriber sub) {
		listOfSubscribers.remove(sub);
	}

	@Override
	public void notifiy() {
		
		for (int i = 0; i < listOfSubscribers.size(); i++) {
			listOfSubscribers.get(i).notifyCustomer();
		}
	}
	
	public void addProduct(Product prod)
	{
		listOfProducts.add(prod);
		notifiy();
	}
	
	public void removeProduct(Product prod)
	{
		listOfProducts.remove(prod);
	}	

	@Override
	public String toString() {
		return "ClothingStore{" + "listOfSubscribers=" + listOfSubscribers + ", listOfProducts=" + listOfProducts + '}';
	}
}
