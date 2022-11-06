public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int yearToday = 2022;
        int yearEarly = yearToday - 200;
        int yearFuture = yearToday + 100;
        int i = 0;
        while (i <= yearFuture) {
            i+=79;
            if (i <= yearFuture && i >= yearEarly) {
                System.out.println(i);
            }
        }

        //Задание 2
        System.out.println("Задание 2");
        int x = 2;
        for (int j = 1; j < 11; j++) {
            System.out.println(x + "*" + j + "=" + x*j);
        }
    }
}