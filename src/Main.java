public class Main {
    public static void main(String[] args) throws ValidationException {
        String phoneNumber = "0745123456";
        try {
            System.out.println("The number " + validatePhoneNumber(phoneNumber) + " is a valid phonenumber");
        } catch (ValidationException e) {
            System.out.println("Phonenumber not valid! " + e.getMessage());
        }
    }

    public static long validatePhoneNumber(String phoneNumber) throws ValidationException {
        long longPhoneNumber;
        boolean firstNumberValid = false;

        try {
            longPhoneNumber = Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new ValidationException("Number should be of long format!");
        }
/*        if (phoneNumber==null||phoneNumber.length()==0){
            throw new ValidationException("Phone number must not be null and must contain numbers");}*/
        if (phoneNumber.length() < 9 || phoneNumber.length() > 10) {
            throw new ValidationException("Phone number must be 9 or 10 characters long");
        }
        if (firstNumberRecognition(phoneNumber) != true) {
            throw new ValidationException("Phonenumber must start with 0 or 7");
        }
        return (longPhoneNumber);
    }

    public static boolean firstNumberRecognition(String phoneNumber) {
        boolean firstNumberValid = false;

        String arrayOfPhoneNumber[] = phoneNumber.split("", 0);
        int intArrayOfPhoneNumber[] = new int[arrayOfPhoneNumber.length];
        for (int i = 0; i < arrayOfPhoneNumber.length; i++) {
            intArrayOfPhoneNumber[i] = Integer.parseInt(arrayOfPhoneNumber[i]);
        }
        if (intArrayOfPhoneNumber[0] == 0 || intArrayOfPhoneNumber[0] == 7) {
            firstNumberValid = true;
        }
        return firstNumberValid;
    }
}
