public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardOwner,Money limit){
        this.owner = newCardOwner;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }
    public Money getBalance(){
        return new Money(balance);
    }
    public Money getCreditLimit(){
        return new Money(creditLimit);
    }
    public String getPersonals(){
        return owner.toString();
    }
    public void charge(Money amount){
        if(creditLimit.compareTo(balance.add(amount)) <= 0){
            System.out.println("Exceeds credit limit");
        }else balance = balance.add(amount);
    }
    public void payment(Money amount){
        balance = balance.subtract(amount);
    }
}
