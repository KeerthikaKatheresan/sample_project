interface BankAccount{
    void deposit(int amt);
    void withdraw(int amt);
}

class SavingsAccount implements BankAccount{
    int bal=0;
    @Override
    public void withdraw(int amt)
    {
        bal=bal-amt;
        System.out.println("Balance from savings account after withdraw:"+bal);
    }
    public void deposit(int amt)
    {
        bal=bal+amt;
        System.out.println("Balance from savings account afetr depoist:"+bal);
    }
}

class CheckingAccount implements BankAccount{
    int bal=0;
    @Override
    public void withdraw(int amt)
    {
        bal=bal-amt;
        System.out.println("Balance from checking account after withdraw:"+bal);
    }
    public void deposit(int amt)
    {
        bal=bal+amt;
        System.out.println("Balance from checking account afetr depoist:"+bal);
    }
}

public class q3{
    public static void main(String[] args)
    {
        BankAccount  o1=new SavingsAccount();
        BankAccount o2=new CheckingAccount();

        o1.deposit(5000);
        o1.withdraw(200);
        o2.deposit(100000);
        o2.withdraw(300);
    }
}