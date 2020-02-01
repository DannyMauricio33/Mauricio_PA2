
public class Decrypter {
	
	public static String decrypt(String numberToDecrypt){
		
		// If input is not 4 digits, the program exits
        if (numberToDecrypt.length() != 4){
            System.out.println("Length has to be 4");
            System.exit(0);
        }
        
        // Splits up digits in the string
        String[] stringArray = numberToDecrypt.split("");
        
        // Initialize 4 integer index array
        int[] digitArray = new int[4];
        
        // Fill digits into the array
        for(int i = 0; i < numberToDecrypt.length(); i++) {
        	digitArray[i] = Integer.valueOf(stringArray[i]);
        }
        
        // Add 3 to the numbers and get remainder of 10 to get original digits
        for (int i = 0; i < numberToDecrypt.length(); i++){
            digitArray[i] = Integer.valueOf(stringArray[i]);
            digitArray[i] = (digitArray[i] + 3) % 10;
        }
        
        // Swap the positions of the 1st and 3rd digits
        int temp1 = digitArray[0];
        digitArray[0] = digitArray[2];
        digitArray[2] = temp1;
        
        // Swap the positions of the 2nd and 4th digits
        int temp2 = digitArray[1];
        digitArray[1] = digitArray[3];
        digitArray[3] = temp2;
        
        // Assemble the integer array back to a string
        StringBuilder build = new StringBuilder();
        for (int val : digitArray){
            build.append(val);
        }
        
        // Return the decrypted number
        return build.toString();
    }
	
}
