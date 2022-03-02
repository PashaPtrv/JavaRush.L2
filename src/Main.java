import javax.xml.catalog.Catalog;

public class Main {


    public static void main(String[] args) {
        //Вызываем функции и присваиваем им значения для проверки.
        System.out.println(min(12,4));
        System.out.println(max(5,10));
        System.out.println(minThreeNum(23,12,3));
        System.out.println(minFourNum(45,34,12,2));
        printThreeLines("Привет, когда я стану сеньором?");
        printThreeWords("Скоро");



    }
    //Написать функцию, которая возвращает минимум из двух чисел.
    public static int min(int a, int b){
        if (a > b)
            return b;
            else return a;
    }
    //Написать функцию, которая вычисляет максимум из двух чисел.
    public static int max(int a, int b){
        if (a > b) return a;
        else return b;
    }
    //Написать функцию, которая вычисляет минимум из трёх чисел.
    public static int minThreeNum(int a, int b, int c){
        if (a < b && a < c) {
            return a;
        } else if (b < c){
            return b;
        }   else return c;

    }
    //	Минимум четырёх чисел ,(вызывать) функцию min(a,b)
    public static int minFourNum(int a, int b, int c, int d){
        if (min(a, b) < c && min(a, b) < d){
            return min(a, b);
        } else if (c < d) {
            return c;
        } else return d;
    }
    //Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
    public static void printThreeLines(String str){
        for (int i = 0; i < 3; i++){
            System.out.println(str);
        }
    }
    /*Написать функцию, которая выводит переданную строку (слово) на экран три раза,
          но в одной строке. Слова должны быть разделены пробелом и не должны сливаться в одно. */
    public static void printThreeWords(String words){
        for (int i = 0; i < 3; i++){
            System.out.print(words + " ");
        }
    }

}








