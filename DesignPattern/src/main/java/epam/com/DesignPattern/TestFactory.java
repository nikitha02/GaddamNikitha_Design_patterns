package epam.com.DesignPattern;

public class TestFactory {
	public static void main(String[] args){
		System.out.println(Factory.buildCar(Cartype.SMALL));
		System.out.println(Factory.buildCar(Cartype.LUXURY));
		
		}

}
