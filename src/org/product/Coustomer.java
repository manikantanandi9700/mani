package org.product;

public class Coustomer extends Client {
	
	public void company() {
		System.out.println("hcl");
	}
	public void employee() {
		System.out.println("ram");
	}
public static void main(String[] args) {
	Coustomer c = new Coustomer();
c.company();
c.employee();
c.clientname();
c.clientmobile();
}
}
