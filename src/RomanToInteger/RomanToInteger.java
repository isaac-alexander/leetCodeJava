package RomanToInteger;


public class RomanToInteger {

    // Converts a Roman numeral into an integer.
    public int romanToInt(String s) {

        // Stores the final integer result.
        int total = 0;

        // Loop through each character in the Roman numeral.
        for (int i = 0; i < s.length(); i++) {

            // Get the value of the current Roman symbol.

            // Check whether there is a next character.

                // Get the value of the next Roman symbol.

                // Subtract the current value if it is smaller than the next value.
                    // Otherwise, add the current value.


                // Add the last Roman symbol because it has no next character.

        }

        // Return the converted integer.
        return total;
    }


}
