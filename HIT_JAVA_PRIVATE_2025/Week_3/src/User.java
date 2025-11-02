import java.util.UUID;

public class User {
    private String id;
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.balance = balance;
    }

    public User() {
    }

    public String getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(String id, double amount) {
        if (!this.id.equals(id)) {
            System.out.println(Constant.ErrorMessages.INVALID_ACCOUNT);
            return;
        }

        if (Constant.Account.isAccountLocked) {
            System.out.println(Constant.ErrorMessages.ACCOUNT_LOCKED);
            return;
        }

        if (Constant.Account.isAccountDepoLimit < amount) {
            System.out.println(Constant.ErrorMessages.OVER_LIMIT_AMOUNT);
            return;
        }

        this.balance += amount;
    }

    public void withDraw(String id, double amount) {
        if (!this.id.equals(id)) {
            System.out.println(Constant.ErrorMessages.INVALID_ACCOUNT);
            return;
        }

        if (Constant.Account.isAccountLocked) {
            System.out.println(Constant.ErrorMessages.ACCOUNT_LOCKED);
            return;
        }

        if (Constant.Account.isAccountDrawLimit > amount) {
            System.out.println(Constant.ErrorMessages.OVER_LIMIT_AMOUNT);
            return;
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", tên: " + name + ", số tiền: " + balance;
    }
}
