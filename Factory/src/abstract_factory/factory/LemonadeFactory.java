package abstract_factory.factory;

import abstract_factory.model.*;
import abstract_factory.utils.Customization;
import abstract_factory.utils.Product;

public class LemonadeFactory extends ProductFactory {

	@Override
	public Product getProduct(Customization cust) {
		return new Lemonade(cust);
	}

}