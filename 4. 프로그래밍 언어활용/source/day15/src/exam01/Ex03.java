package exam01;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random rand = new Random();

        rand.ints(6).forEach(System.out::println); //난수 6개 정수범위에서 발생
    }
}
