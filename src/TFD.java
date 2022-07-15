import java.util.ArrayList;
import java.util.Scanner;

public class TFD {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        String numberInput = scan.nextLine();
        try {
            int numberIP = Integer.parseInt(numberInput);
            for (int i = 0; i < numberIP; i++) {
                String line = scan.nextLine();
                input.add(line);
            }
            System.out.println("Output: ");
            //int numberInput = 0;
            int i = 1;
            for( String line: input) {
                System.out.println("Case #" + i + ": " + getFirstAlphabeString(line));
                i++;
            }
        } catch (Exception ex) {
            System.out.println("Input error");
            // Don nothing
        }
    }

    private static String getFirstAlphabeString(String input) {
        String output = "";
        int len = input.length();
        for (int i = 0; i < len; i++) {
            output = output + input.charAt(i);
            if (i < len - 1) {
                if (input.charAt(i) < input.charAt(i+1)) {
                    output = output + input.charAt(i);
                } else if(input.charAt(i) < input.charAt(i+1)) {
                    boolean isDouble = false;
                    for (int j = 0; j < len; j++) {
                        if (input.charAt(i) != input.charAt(j)) {
                            if (input.charAt(i) < input.charAt(j)) {
                                isDouble = true;
                            }
                            break;
                        }
                    }
                    if (isDouble) {
                        output = output + input.charAt(i);
                    }
                }
            }
        }
        return output;
    }
}


