package ru.geekbrains.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        //вызов методов
        boolean summ = checkSum(3,7);
        System.out.println(summ);
        System.out.println();
        checkPositive(3);
        System.out.println();
        boolean num = checkPositive2(2);
        System.out.println(num);
        System.out.println();
        printWord(5,"Dogs");
        System.out.println();
        boolean y =yearCheckVis(2020);
        System.out.println(y);
              }

              //проверка границ суммы
    public static boolean checkSum(int a, int b){
        if (a+b>=10 && a+b<=20){
            return true;
        } else
        return false;
        //проверка числа
    }
    public static void checkPositive(int a){
        if (a>=0) {
            System.out.println("Положительное число");
        } else
            System.out.println("Отрицательное число");
    }
    // проверка числа с возвратом
    public static boolean checkPositive2 (int a){
        if (a>=0) {
            return true;
        } else
            return false;
    }
    //печатоем слово n раз
    public static void printWord(int a, String s){
        for (int i=0; i<a;i++){
            System.out.println(s);
        }
    }
    // проверка високосного года
    public static boolean yearCheckVis(int year){
        if (year % 4 != 0){
            return false;
        } else if (year % 100 == 0){
            if (year % 400 == 0 ){
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
