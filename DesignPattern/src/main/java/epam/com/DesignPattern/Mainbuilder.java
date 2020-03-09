package epam.com.DesignPattern;

public class Mainbuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User.UserBuilder("jhon", "kabeer")
				.age(25)
				.phone("9213671528")
				.address("Nizambad")
				.build();
		System.out.println(user1);
		User user2 = new User.UserBuilder("sachin", "deeraj")
				.age(90)
				//no number
				.address("Imaran")
				.build();
		System.out.println(user2);
	}
}
