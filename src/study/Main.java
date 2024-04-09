package study;
import java.util.Scanner;
// import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person kate = new Person("Kate", 32);
        kate.displayInfo();

        Scanner in = new Scanner(System.in);

        double result = sqrt(20);
        out.println(result); 
    }
}