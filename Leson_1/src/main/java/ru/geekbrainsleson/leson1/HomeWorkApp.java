package ru.geekbrainsleson.leson1;

public class HomeWorkApp {
    public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
    System.out.println("\nЗадание с *\n");
    double herpotenuse = getHypotenuseLength(3.5,2);
        System.out.println("Длинна гепотинузы равна: "+herpotenuse);
    }

    private static void printThreeWords(){
        System.out.println("Первое задание:\n");
        System.out.print("Orange\nBanana\nApple\n");
    }
    private static void checkSumSign(){
        System.out.println("\nВторое задание:\n");
        //задаем случайное целое число от -10 до 10
        int a = (int) Math.round(Math.random() * 20 - 10);
        System.out.println("Первое число равно: " + a);
        int b = (int) Math.round(Math.random() * 20 - 10);
        System.out.println("Второе число равно: " + b);
        int result = a+b;
        if (result>=0){
            System.out.println("Сумма чисел равна: "+result+ ", сумма положительная");
        } else {
            System.out.println("Сумма чисел равна: "+result+", сумма отрицательная");
        }
    }

    private static void printColor(){
        System.out.println("\nТретье задание:\n");
        int value  = (int) Math.round(Math.random() * 300 - 150);
        System.out.println("Число равно: " + value);
        if (value<=0){
            System.out.println("Красный");
        }
        else if(value>0 && value<=100){
            System.out.println("Желтый");
        }
        else{
            System.out.println("Зеленый");
        }

    }

    private static void compareNumbers(){
        System.out.println("\nЧетвёртое задание:\n");
        int a = (int) Math.round(Math.random() * 50 - 25);
        System.out.println("a равно: " + a);
        int b = (int) Math.round(Math.random() * 50 - 25);
        System.out.println("b равно: " + b);
        if (a>=b){
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }
    }
    public static double getHypotenuseLength(double a, double b){
        //Длинна гепотинузы равна корню из суммы квадратов катетов
        return Math.sqrt((a*a)+(b*b));
    }
}
