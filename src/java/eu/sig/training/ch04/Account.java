package eu.sig.training.ch04;

public class Account {
    private Money balance = new Money();

    public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
        if(Accounts.isValid(counterAccount)){
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            return new Transfer(this, acct, amount); // <2>
        } else {
            throw new BusinessException("Invalid account number!!");
        }
    }

    public void addInterest(float percentage) {
        Money interest = balance.multiply(percentage);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
}
