package Interface;

public class Developing implements BankingClient, DomainClient {
//now this class is responsible to implement ALL method of Banking client
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Developing d=new Developing();
d.paycreditcard();
d.checkingbalance();
d.transferbalance();
d.login();
BankingClient dr=new Developing();//run time polimorf
//dr.login();
DomainClient dc = new Developing();
dc.invesment();
	}
	

@Override
public void paycreditcard() {
	// TODO Auto-generated method stub
	System.out.println("paycreditcard implemented");
}

@Override
public void transferbalance() {
	// TODO Auto-generated method stub
	System.out.println("transferbalance implemented");
}

@Override
public void checkingbalance() {
	// TODO Auto-generated method stub
	System.out.println("checkingbalance implemented");
}
	public void login() {
	System.out.println("Login");
	}


	@Override
	public void invesment() {
		// TODO Auto-generated method stub
		System.out.println("investment implemented");
	}
	}

