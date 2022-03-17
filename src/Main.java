public class Main {
    public static void main(String[] args) {

        int balance = 100; // Баланс клиента
        int refill = 1100; // Сумма пополнения

        int bonus;
        if (refill <= 1000) {
            bonus = 0;
        } else {
            bonus = refill / 100;
        }

        int sum = balance + refill + bonus;

        System.out.println("Размер бонуса: " + bonus);
        System.out.println("Ваш баланс: " + sum);
    }

}