package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends Account {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
        Transfer result = super.makeTransfer(counterAccount, amount);
        if (result.getCounterAccount().equals(this.registeredCounterAccount)) {
            return result;
        } else {
            throw new BusinessException("Not Registered!");
        }
    }
}
// end::SavingsAccount[]
