public class TFD {
    public static void main(String[] args) {
        int numberInput = 0;
        try {
            numberInput = Integer.parseInt(args[0]);
            for(int i = 1; i <= numberInput; i++) {
                System.out.println("Case #" + i + ": " + getFirstAlphabeString(args[i]));
            }
        } catch (Exception ex) {
            System.out.println("Input error");
            // Don nothing
        }
    }

    private static String getFirstAlphabeString(String input) {
        StringBuilder output = new StringBuilder();
        int len = input.length();
        for (int i = 0; i < len; i++) {
            output.append(input.charAt(i));
            if (i < len - 1) {
                if (input.charAt(i) < input.charAt(i+1)) {
                    output.append(input.charAt(i));
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
                        output.append(input.charAt(i));
                    }
                }
            }
        }
        return output.toString();
    }
}


