package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends Account {
    private CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
        Transfer result = super.makeTransfer(counterAccount, amount);
        if (result.getCounterAccount().equals(registeredCounterAccount)) {
            return result;
        } else {
            throw new BusinessException("Not Registered!");
        }
    }
}
// end::SavingsAccount[]
