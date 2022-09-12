public class BankAccount {
    private double balance; //баланс счёта

    public BankAccount(double openingBalance) { //конструктор
        balance = openingBalance;
    }

    public void deposit(double amount) { //внесение средств
        balance = balance + amount;
    }

    public void withdraw(double amount) { //снятие средств
        balance = balance - amount;
    }

    public void display() { //Вывод баланса
        System.out.println("balance=" + balance);
    }


}
