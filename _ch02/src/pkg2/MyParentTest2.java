package pkg2;

import pkg1.MyParent; //cmd+shift+o or 밑에 extends pkg1. MyParent로변경.

class MyChild extends MyParent {
	public void printMembers() {
//		System.out.println(prv); //error :only in same class
//		System.out.println(dft); //error :only in same package
		System.out.println(prt); //ok : child
		System.out.println(pub); //ok
	}
}

public class MyParentTest2 {
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); //error : 완전히다른패키지에 다른클래스라서.
//		System.out.println(p.dft); //error : 완전히다른패키지에 다른클래스라서.
//		System.out.println(p.prt); //error : 완전히다른패키지에 다른클래스라서.
		System.out.println(p.pub); //ok : 접근제한없으니까.
	}
}
