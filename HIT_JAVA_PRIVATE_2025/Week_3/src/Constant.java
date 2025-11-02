public class Constant {
    public static class Account {
        public static boolean isAccountLocked = false;
        public static double isAccountDepoLimit = 100000000;
        public static double isAccountDrawLimit = 2000;
    }

    public static class ErrorMessages {
        public static String ACCOUNT_LOCKED = "ACCOUNT LOCKED";
        public static String INVALID_ACCOUNT = "INVALID ACCOUNT";
        public static String OVER_LIMIT_AMOUNT = "OVER LIMIT AMOUNT";
        public static String BANK_MAINTAIN = "BANK MAINTAIN";
        public static String NOT_ENOUGH_MONEY = "NOT ENOUGH MONEY";
    }
}
