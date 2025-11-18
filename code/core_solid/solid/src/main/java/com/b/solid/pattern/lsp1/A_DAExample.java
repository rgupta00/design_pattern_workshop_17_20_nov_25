package com.b.solid.pattern.lsp1;
class Ak47{	
}
class SuperGun extends Ak47{	
}
class FallFantException extends RuntimeException{}
//AB--> Abhi
class Don{
	public void shootAnyBody(Ak47 ak47) {
		System.out.println("shootAnyBody ");
	}
	public void enjoy() {
		System.out.println("enjoy");
	}
}
class DonNextGen {
	private Don don=new Don();
	
	public void study() {
		System.out.println("phd in ai ml");
	}
	
	public void enjoy() {
		don.enjoy();
	}
}
//class DonNextGen extends Don{
//	public void shootAnyBody(Ak47 ak47) {
//		throw new FallFantException();
//	}
//	
//	public void enjoy() {
//		System.out.println("enjoy enjoy super");
//	}
//}

public class A_DAExample {
	
	public static void main(String[] args) {
		DonNextGen donNextGen=new DonNextGen();
		donNextGen.study();
		donNextGen.enjoy();
	}

}
