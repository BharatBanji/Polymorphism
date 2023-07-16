package polymorphism;

public class MethodOverloading {
	
	 public void Home() {
		 System.out.println("Wallcome to my home");
	 }
	 
	 
	 public void Home(String a) {
		 System.out.println("Wellcome to my home Address : "+a);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.Home();
		obj.Home("Sisauli near by bus stand (choudharan patti)");
	}

}
