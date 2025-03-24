public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int desiredSum = 2459000;
        int sum = 0;
        int amount = 15000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < desiredSum){
            sum += amount;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number ++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Задача 3");
        int population = 12000000;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * 17 / 1000 - population * 8 / 1000;
            System.out.println("Год " + year + ", численость населения составляет " + population);
        }

        System.out.println();
        System.out.println("Задача 4");
        percent = 7D / 100;
        sum = amount;
        month = 0;
        while (sum < 12000000) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println();
        System.out.println("Задача 5");
        sum = amount;
        month = 0;
        while (sum < 12000000) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача 6");
        sum = amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0); {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day +=7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
        System.out.println("Задача 8");
        int period = 79;
        int startSeening = 0;
        int start = currentYear - 200;
        int end = currentYear +100;
        for (int year =startSeening; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}