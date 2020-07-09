package javaapplication1;
/**
 *
 * @author Durjoy_Acharya
 */
public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;
    public CreditCard(String cust,String bk,String acnt,int lim,double intblnc){
    customer=cust;
    bank=bk;
    account=acnt;
    limit=lim;
    balance=intblnc;
    }
    public CreditCard(String cust,String bk,String acnt,int lim){
    this(cust,bk,acnt,0,0);
    }
    public String getCustomer(){return customer;}
    public String getAccount(){return account;}
    public int getLimit(){return limit;}
    public double getBalance(){return balance;}
    public boolean Charge(double price){
    if(price+balance>limit)
        return false;
    balance+=price;
    return true;
    }
    public void makePayment(double amount){
    balance-=amount;
    }
    public static void PrintSummary(CreditCard card){
    System.out.println("Customer = "+card.customer);
    System.out.println("Bank = "+card.bank);
    System.out.println("Account = "+card.account);
    System.out.println("Balance = "+card.balance);
    System.out.println("Limit = "+card.limit);
    }
    public static void main(String args[]){
        CreditCard[] wallet=new CreditCard[3];
        wallet[0] = new CreditCard("Durjoy Acharya","Visa Mastercard","0550 6640 5587 3369",5000);
        wallet[1] = new CreditCard("Sahid Jahan Sadik","MOdhumoti Card","0150 4540 5787 1349",6000);
        wallet[2] = new CreditCard("Farzana Armani","Brac International Card","0124 4720 5677 0369",3500,400);
        
      for(int val=1;val<=16;val++){
          wallet[0].Charge(3*val);
          wallet[1].Charge(2*val);
          wallet[2].Charge(val);
      }
      for(CreditCard card:wallet){
          CreditCard.PrintSummary(card);
          while(card.getBalance()>200.0){
          card.makePayment(200);
          System.out.println("New Balance = "+card.getBalance());
          }
      }
    }
}
