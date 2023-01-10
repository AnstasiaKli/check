public class Main {

    public static void main(String[] args) {
        int initialBalance = 200; // Начальный счет баланса
        int replenishmentAmount = 400; // Пополнение счета
        int threshold = 1000; // Порог пополнения для начисления бонусов
        int bonus = 0;
        if (replenishmentAmount > threshold) {
            bonus = replenishmentAmount / 100;
        }


            System.out.println((replenishmentAmount + initialBalance + bonus)+ " итоговый счёт");
            System.out.println((bonus)+ " бонусные рубли");
        }
    }