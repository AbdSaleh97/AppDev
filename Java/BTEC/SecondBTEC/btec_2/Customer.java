package btec_2;

/*
 * @author Abdsaleh
 */
public class Customer implements Subscriber{
	private String name;
	private ClothingStore store;
	
	public Customer(String name, ClothingStore store)
	{
		this.name = name;
		this.store = store;
		
		store.subscribe(this);
	}

	@Override
	public String toString() {
		return "Customer{" + "name=" + name + '}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ClothingStore getStore() {
		return store;
	}
	
	@Override
	public void notifyCustomer() {
		System.out.println("Hello " + name + " we have a new " +  store.getListOfProducts().get(store.getListOfProducts().size()-1).getFabric()+ " " + store.getListOfProducts().get(store.getListOfProducts().size()-1).getClass().getSimpleName() + " in our store why don't you check it out? it's only " + store.getListOfProducts().get(store.getListOfProducts().size()-1).getPrice()+"$");
	}
	
	public void subscribe()
	{
		store.subscribe(this);
	}
	
	public void unsubscribe()
	{
		store.unsubscribe(this);
	}
	
}
