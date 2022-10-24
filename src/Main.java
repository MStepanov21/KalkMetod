import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int num1 = Integer.parseInt(sc.nextLine());


        System.out.println("Введите второе число");
        int num2 = Integer.parseInt(sc.nextLine());



        System.out.println("Введите действие в виде символа");
        String s  = sc.nextLine();
        calclSystem(num1,num2,s);





    }


    public static void calclSystem(int num1,int num2,String s){
        if (s.equals("+")){
                plus(num1,num2);

        } else if (s.equals("*")){
                um(num1,num2);

        }else if (s.equals("/")){
                del(num1,num2);

        }else if (s.equals("-")){
                vch(num1,num2);
        } else {
            System.out.println("Неправильный символ");
        }


}

public static void plus(int num1,int num2){
    proverka(num1 + num2);
}

public static void um(int num1, int num2){
    proverka(num1 * num2);
}
public static void del(int num1, int num2){
        float one = num1;
        float two = num2;
    proverka(one / two);
}
public static void vch(int num1, int num2){
    proverka(num1 - num2);
}
public static void proverka(float otvet){
        if ( otvet - Math.floor(otvet) == 0.0 ){
            int n = (int) otvet;
            System.out.println(n);
        }else {
            System.out.println(otvet);
        }
}

//            System.out.println("Введите второе число");
//            int num2 = sc.nextInt();
//
//            System.out.println("Введите действие в виде символа");
//            String s = sc.nextLine();
//
//            if (s.equals(+)) {
//                System.out.println(num1 + num2);
//
//            } else if (s.equals(*)){
//                System.out.println(num1 * num2);
//
//            }else if (s.equals(/)){
//                System.out.println(num1 / num2);
//
//            }else if (s.equals(-)) {
//                System.out.println(num1 - num2);
//            } else {
//                System.out.println("Неправильный символ");
//            }
//



    }
