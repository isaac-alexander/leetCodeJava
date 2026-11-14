package RomanToInteger;

public class RomanToInteger {

    // Converts a Roman numeral into an integer.
    public int romanToInt(String s) {

        // Stores the final integer result.
        int total = 0;

        // Loop through each character in the Roman numeral.
        for (int i = 0; i < s.length(); i++) {

            // Get the value of the current Roman symbol.
            int current = getValue(s.charAt(i));

            // Check whether there is a next character.
            if (i + 1 < s.length()) {

                // Get the value of the next Roman symbol.
                int next = getValue(s.charAt(i + 1));

                // Subtract the current value if it is smaller than the next value.
                if (current < next) {
                    total -= current;
                } else {

                    // Otherwise, add the current value.
                    total += current;
                }

            } else {

                // Add the last Roman symbol because it has no next character.
                total += current;
            }
        }

        // Return the converted integer.
        return total;
    }

    // Returns the integer value of a Roman numeral symbol.
    public int getValue(char symbol) {

        switch (symbol) {

            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        // Create an instance of the RomanToInteger class.
        RomanToInteger solution = new RomanToInteger();

        // Declare the Roman numeral.
        String s = "MCMXCIV";

        // Convert the Roman numeral into an integer.
        int result = solution.romanToInt(s);

        // Display the result.
        System.out.println("Integer: " + result);
    }
}
