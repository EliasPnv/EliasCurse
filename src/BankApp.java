public class BankApp {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100.00); //создание счёта
        System.out.print("Before transactions: ");
        ba1.display(); //вывод баланса
        ba1.deposit(74.35); //внесение средств
        ba1.withdraw(20.00); //снятие средств
        System.out.print("After transactions: ");
        ba1.display(); //вывод баланса
    }
}
