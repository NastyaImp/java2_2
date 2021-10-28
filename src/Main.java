public class Main {
    public static void main(String[] args) {
        int account = 1100;
        int summa = 50;
        int result = account + summa;

        int bonus;
        int result1;
        if (result > 1000) {
            bonus = result / 100;
            result1 = result + bonus;
            System.out.println(result1);
        } else {
            System.out.println(result);
        }

    }
}
