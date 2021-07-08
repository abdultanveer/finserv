package basics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Customer {
	String name;
	String shippingAdress;
	
	
	
	
	
	public void walkIn() {
		System.out.println("customer is walking in");
	}
	public void browseProducts() {
		System.out.println("customer is browsing the products in");

	}
	public void shopProducts() {
		System.out.println("customer is putting products in shopping cart");

	}
	

}
