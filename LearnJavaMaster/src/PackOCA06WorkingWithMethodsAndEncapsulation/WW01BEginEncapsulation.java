package OCA06_Working_with_Methods_and_Encapsulation;

public class WW01BEginEncapsulation {

	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");
		//encap.name = "James"; not working variable in mode private, using method public access variable

		System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	}

}
