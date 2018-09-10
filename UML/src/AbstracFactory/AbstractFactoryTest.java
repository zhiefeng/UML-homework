package AbstracFactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		
	}
}

interface Product {
	public void show();
}

class ConcreteProduct1 implements Product{

	@Override
	public void show() {
		System.out.println("具体产品1显示");
	}
}

class ConcreteProduct2 implements Product{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("具体产品2显示");
	}
	
}

interface AbstractFactory {
	public Product newProduct();
}

//工厂，实现了产品的生成方法
class ConcreteFactory1 implements AbstractFactory
{

	@Override
	public Product newProduct() {
		// TODO Auto-generated method stub
		System.out.print("具体工厂1生成-->具体产品1");
		return new ConcreteProduct1();
	}
}

class ConcreteFactory2 implements AbstractFactory
{

	@Override
	public Product newProduct() {
		// TODO Auto-generated method stub
		System.out.print("具体工厂2生成-->具体产品2");
		return new ConcreteProduct2();
	}
}






