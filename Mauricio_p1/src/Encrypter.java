
public class Encrypter {

    public static String encrypt(String numberToEncrypt) {
    	
    	// If input is not 4 digits, then program exits
        if (numberToEncrypt.length() != 4) {
            System.out.println("Length has to be 4");
            System.exit(0);
        }
        
        // Split up digits in the string
        String[] stringArray = numberToEncrypt.split("");
        
        // Initialize 4 integer index array
        int[] digitArray = new int[4];
        
        // Fill each index with the digits and encrypt
        for (int i = 0; i < numberToEncrypt.length(); i++) {
            digitArray[i] = Integer.valueOf(stringArray[i]);
            digitArray[i] = (digitArray[i] + 7) % 10;
        }
        
        //Swap 1st and 3rd digits
        int temp1 = digitArray[0];
        digitArray[0] = digitArray[2];
        digitArray[2] = temp1;
        
        // Swap 2nd and 4th digits
        int temp2 = digitArray[1];
        digitArray[1] = digitArray[3];
        digitArray[3] = temp2;
        
        // Initialize string builder
        StringBuilder build = new StringBuilder();
        
        // New string with new encrypted values
        for (int val : digitArray) {
            build.append(val);
        }
        
        // Return the encrypted 4 digit number
        return build.toString();
    }

}

