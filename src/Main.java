public class Main {
    public static void main(String[] args) {
        int bank = 1000;
        int put = 1000;
        int bonus;
        if (put > 1000) {
            bonus = put / 100 + put + bank;
        } else {
            bonus = put + bank;
        }
        if (put > 1000) {
            System.out.println("бонус," + put / 100);

        }

        System.out.println("Сумма на карте," + bonus);
    }
}
