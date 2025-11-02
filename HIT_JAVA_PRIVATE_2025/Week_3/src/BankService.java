public class BankService {
    public void transfer(User from, User to, double amount) {
        if (from.getBalance() < amount) {
            System.out.println(Constant.ErrorMessages.NOT_ENOUGH_MONEY);
            return;
        }
        from.withDraw(from.getId(), amount);
        to.deposit(to.getId(), amount);
    }
}
