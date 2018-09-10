package AbstracFactory;

import java.awt.*;
import javax.swing.*;

public class AnimalFarmTest {
	public static void main(String[] args) {
		
	}
}

interface Animal{
	public void show();
}

class Horse implements Animal{
	JScrollPane sp;
	JFrame jf = new JFrame("工厂方法模式测试");
	public Horse() {
		Container cintentPane = jf.getContentPane();
		JPanel pl = new JPanel();
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}