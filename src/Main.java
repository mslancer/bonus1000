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

        System.out.println("Сумма на карте");
        System.out.println(bonus);
    }
}
