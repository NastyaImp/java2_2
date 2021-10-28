public class Main {
    public static void main(String[] args) {
        int account = 1100; // начальный счет
        int summa = 50;     // сумма пополнения
        int result = account + summa;  // итоговый счет

        int bonus;      // бонусные рубли
        int result1;    // итог с бонусами
        if (result > 1000) {
            bonus = result / 100;
            result1 = result + bonus;
            System.out.println(result1);
        } else {
            System.out.println(result);
        }
    }
}
