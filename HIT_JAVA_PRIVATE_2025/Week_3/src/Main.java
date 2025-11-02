import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        User[] users = new User[3];
        Scanner sc = new Scanner(System.in);

        users[0] = new User("Nam", 100000);
        users[1] = new User("Phuc", 500000);
        users[2] = new User("Tien", 1000000);

        System.out.println("INFOMATION OF EVERYONE:");
        for (int i = 0; i < 3; i++) {
            System.out.println(users[i]);
        }

        String id1, id2;
        double money;
        String choose;
        System.out.println();
        do {
            int human1 = 0, human2 = 0 ;
            System.out.print("Transfer from? (Input ID): "); id1 = sc.nextLine();
            System.out.print("to? (Input ID): "); id2 = sc.nextLine();
            System.out.println("How much money do u want to transfer?: "); money = sc.nextDouble(); sc.nextLine();
            for (int i = 0; i < 3; i++) {
                if(users[i].getId().equalsIgnoreCase(id1)) {
                    human1 = i;
                } if(users[i].getId().equalsIgnoreCase(id2)) {
                    human2 = i;
                }
            }
            bankService.transfer(users[human1], users[human2], money);
            System.out.println("Thông tin mới của mọi người: ");
            for (int i = 0; i < 3; i++) {
                System.out.println(users[i]);
            }
            System.out.print("Do you want to transfer more? (y/n) "); choose = sc.nextLine();
        } while (choose.equalsIgnoreCase("yes") || choose.equalsIgnoreCase("y"));
    }
}