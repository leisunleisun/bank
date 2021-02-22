
public class bank {
	int accountnumber =123456789;
	double balance =500.0;
	String customername = "leisun";
	String email = "sl13733820@gmail.com";
	String phonenumberString="6824140390";
	
	//deposite method
	public void deposite(double num) {
		double newbalance = balance +num;
		balance=newbalance;
		System.out.println(balance);}
	//withdraw method 
	
	public void withdraw(double num) {
		double newbalance= balance - num;
		if (newbalance<0)
		{
			System.out.println("insufficient fund");
			System.out.println("balance: "+balance);
		}
		else {
		balance=newbalance;
		System.out.println(balance);
		}}
	
	//information method
	public void info() {
		System.out.println("name: "+customername);
		System.out.println("email: "+email);
		System.out.println("phone: "+phonenumberString);
		System.out.println("account number: "+accountnumber);
	}

}
