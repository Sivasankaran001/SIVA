import java.io.*;
import java.util.*;
public class Account{	
	private long accountNumber;
	private float balance;
	private String customerName;
	private int pin;
	void setAccNumber(long acc ){
		this.accountNumber=acc;
	}
	void setBal(float bal){
		this.balance=bal;
	}
	void setCustomerName(String name){
		this.customerName=name;
	}
	void setPin(int pin){
		this.pin=pin;
	}
	public long getAccNumber(){
		return accountNumber;
	}
	public float getBal(){
		return balance;
	}
	public String getCustomerName(){
		return customerName;
	}
	public int getPin(){
		return pin;
	}
	public static void main(String args[]){
		Account m=new Account();
		m.setAccNumber(38777717364L);
		m.setBal(5000);
		m.setCustomerName("Siva");
		m.setPin(2001);
		Boolean banking=true;
		Scanner s=new Scanner(System.in);
		Console r=System.console();
		while(banking){
		System.out.println("--------------------------------------------------------");
		System.out.println("Select the number ,According to the operation you want");
		System.out.println("1.Balance Inquiry");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		int num=s.nextInt();
		if (num==1){
			System.out.println("Enter the Account Number");
			long userAcc=s.nextLong();
			System.out.println("Enter the pin");
			String pass= new String(r.readPassword());
			int userPin=Integer.parseInt(pass);
			if (m.getPin()==userPin && m.getAccNumber()==userAcc){
				System.out.println("Hi, "+m.getCustomerName()+", Your Account Balance is "+m.getBal());	
			}else{
				System.out.println("AccountNumber or pin is incorrect!, Please tryagain");
			}
			System.out.println("Press 1 to exit");
				int res=s.nextInt();
				if(res==1){
				continue;
				}
		}
		else if(num==2){
			System.out.println("Enter the Account Number");
			long userAcc=s.nextLong();
			System.out.println("Enter the Amount to Deposit");
			int DepAmount=s.nextInt();
			System.out.println("Enter the pin");
			String pass= new String(r.readPassword());
			int userPin=Integer.parseInt(pass);
			if (m.getPin()==userPin && m.getAccNumber()==userAcc){
				m.setBal(m.getBal()+DepAmount);
				System.out.println("Hi, "+m.getCustomerName()+", Rs."+DepAmount+" has been credited to your Account");	
				
			}else{
				System.out.println("AccountNumber or pin is incorrect!, Please tryagain");
				}
			System.out.println("Press 1 to exit");
				int res=s.nextInt();
				if(res==1){
				continue;
				}
		}
		else if(num==3){
			System.out.println("Enter the Account Number");
			long userAcc=s.nextLong();
			System.out.println("Enter the Amount to withdraw");
			int withdrawAmount=s.nextInt();
			System.out.println("Enter the pin");
			String pass= new String(r.readPassword());
			int userPin=Integer.parseInt(pass);
			if (m.getPin()==userPin && m.getAccNumber()==userAcc){
				if(m.getBal()>=withdrawAmount){
				m.setBal(m.getBal()-withdrawAmount);
				System.out.println("Hi, "+m.getCustomerName()+", Rs."+withdrawAmount+" has been debited from your Account");
				}else{
					System.out.println("Not enough money");
				}	
				
			}else{
				System.out.println("AccountNumber or pin is incorrect!, Please tryagain");
				}
			System.out.println("Press 1 to exit");
				int res=s.nextInt();
				if(res==1){
				continue;
				}
		}
		else{
			banking=false;
		}
	}

	s.close();
	}
}
	