public class Main {
    public static void main(String[] args) {

        int dipozit = 895; // сумма на счету
        int addition = 1352; // сумма пополнения
        int bonus; // количество начисленных бонусов


        if (addition > 1000) {
            bonus = addition / 100;
        } else {
            bonus = 0;
        }

        int summa = dipozit + addition + bonus;
        System.out.println("Вам начислено " + bonus + " бонусов");
        System.out.println("На вашем счету " + summa + " рублей");


    }
}