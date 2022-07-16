package pkg1;

public class MyParent { //접근제어자가 default라서 다른 package에서사용불가 > public 붙여줘
	private 	int prv; //same class
				int dft; //same package (default)omission
	protected 	int prt; //same package + child(another package)
	public 		int pub; //No access restrictions
	
	public void printMembers() {
		System.out.println(prv); //ok
		System.out.println(dft); //ok
		System.out.println(prt); //ok
		System.out.println(pub); //ok
	}
}

class MyParentTest {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); //error
		System.out.println(p.dft); //ok
		System.out.println(p.prt); //ok
		System.out.println(p.pub); //ok
	}

}
