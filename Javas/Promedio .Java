package Javas;
 
 public class Promedio {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            suma += i;
        }

        System.out.println("Promedio: " + (suma / 10.0));
    }
}
