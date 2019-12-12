import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PUT IN A NUMBER BANANA: ");
        String input = sc.nextLine();
        System.out.println(StringUtils.isNumeric(input));
        System.out.println("input some stuff: ");
        input = sc.nextLine();
//        System.out.println(StringUtils.swapCase(input));
        System.out.println(StringUtils.getLevenshteinDistance(input, input, 4));
//        System.out.println(input);


    }
}
