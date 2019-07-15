public class Main {
    public static void main(String[] args){
        String phoneNumber="0745123456";

    }

    public static long validatePhoneNumber(String phoneNumber) throws ValidationException{
        long longPhoneNumber;
        try{
            longPhoneNumber=Long.parseLong(phoneNumber);
        } catch (NumberFormatException e){throw new ValidationException("Number should be of long format!");}
        if (phoneNumber==null||phoneNumber.length()==0){
            throw new ValidationException("Phone number must not be null and must contain numbers");}
        if (phoneNumber.length()<9||phoneNumber.length()>10){
            throw new ValidationException("Phone number must be within 9 and 10 characters long");}
        if (){}

        }
    }
}
