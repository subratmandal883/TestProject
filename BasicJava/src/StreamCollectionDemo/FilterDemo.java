package StreamCollectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id; String name;double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class FilterDemo {

	public static void main(String[] args) {
		
		List<Product> productlist= new ArrayList<Product>();
		List<Product> newproductlist= new ArrayList<Product>();
		productlist.add(new Product(1,"HP",25000));
		productlist.add(new Product(2,"DELL",30000));
		productlist.add(new Product(3,"Lenovo",28000));
		productlist.add(new Product(4,"SONY",23000));
		productlist.add(new Product(5,"Apple",90000));
		
		productlist.stream().
				filter(n->n.price>25000).
				forEach(pr->System.out.println(pr.id+" "+pr.name+" "+pr.price));
				
	}

}
