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
		System.out.println("�����Ʒ1��ʾ");
	}
}

class ConcreteProduct2 implements Product{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("�����Ʒ2��ʾ");
	}
	
}

interface AbstractFactory {
	public Product newProduct();
}

//������ʵ���˲�Ʒ�����ɷ���
class ConcreteFactory1 implements AbstractFactory
{

	@Override
	public Product newProduct() {
		// TODO Auto-generated method stub
		System.out.print("���幤��1����-->�����Ʒ1");
		return new ConcreteProduct1();
	}
}

class ConcreteFactory2 implements AbstractFactory
{

	@Override
	public Product newProduct() {
		// TODO Auto-generated method stub
		System.out.print("���幤��2����-->�����Ʒ2");
		return new ConcreteProduct2();
	}
}






