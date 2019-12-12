import org.apache.commons.lang3.StringUtils;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("PUT IN A NUMBER BANANA: ");

        System.out.println(StringUtils.isNumeric(input.getString()));
        System.out.println("input some stuff: ");
//        input = sc.nextLine();
        System.out.println(StringUtils.swapCase(input.getString()));
//        System.out.println(StringUtils.getLevenshteinDistance(input, input, 4));
//        System.out.println(input);

        System.out.println("Enter some other thing: ");
        System.out.println(StringUtils.reverse(input.getString()));


    }
}
