package eu.sig.training.ch04;

public class Account {
    public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
        if(Accounts.isValid(counterAccount)){
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            return new Transfer(this, acct, amount); // <2>
        } else {
            throw new BusinessException("Invalid account number!!");
        }
    }
}
