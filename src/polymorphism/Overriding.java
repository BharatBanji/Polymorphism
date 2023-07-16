package polymorphism;

public class Overriding {

	public void bike() {
		System.out.println("Duke 250cc");
	}
	
	public void RoyalEnfield() {
		System.out.println("RoyalEnfield 500cc DarkBlack");
	}
	
}

 class Overriding1 extends Overriding{
	
	 public void RoyalEnfield() {
		 System.out.println("Haryal Deversion 1000cc darkBlack");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Overriding1 obj=new Overriding1();
		 obj.RoyalEnfield();
	}

}
