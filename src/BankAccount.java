public class BankAccount {
    private double balance; //баланс счёта

    public BankAccount(double openingBalance) { //конструктор
        balance = openingBalance;
    }

    public void deposit(double amount) { //внесение средств
        balance = balance + amount;
        System.out.println("Внесено: " + amount);
        System.out.println("Баланс теперь равен: " + balance);
    }

    public void withdraw(double amount) { //снятие средств
        balance = balance - amount;
        System.out.println("Снято со счёта: " + amount);
        System.out.println("Баланс теперь равен: "+ balance);
    }

    public void display() { //Вывод баланса
        System.out.println("balance=" + balance);
    }


}
