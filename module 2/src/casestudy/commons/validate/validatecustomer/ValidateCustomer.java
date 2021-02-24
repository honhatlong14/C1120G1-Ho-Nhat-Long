package casestudy.commons.validate.validatecustomer;

import casestudy.commons.exception.*;

public class ValidateCustomer {
    public static void validateName(String name) throws NameException {
        String regexName ="[A-Z][a-z]+";
        if (!name.matches(regexName)){
            throw new NameException("Only the first letter must be uppercase, try again !");
        }
    }
    public static void validateEmail(String email) throws EmailException {
        String regexEmail="[a-z0-9]{5,20}@+[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}";
        if (!email.matches(regexEmail)){
            throw new EmailException("Invalid, email must be abc@abc.abc");
        }
    }
    public static void validateBirthday(String birthday) throws BirthdayException {
        String regexBirthday="^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([012])|[1][9]\\d{2})$";
        if (!birthday.matches(regexBirthday)){
            throw new BirthdayException("Year must have the correct date of birth format of type dd/MM/yyyy and have the year of birth> 1900");
        }
    }
    public static void validateGender(String gender) throws GenderException {
        String regexGender="(Male|Female|Unknown)";
        //sai
        if (!gender.matches(regexGender)){
            throw new GenderException("gender must be is: Male/Female/Unknown");
        }
    }
    public static void validateIdCard(String idCard) throws IdCardException {
        String regexIdCard="\\d{3}\\s\\d{3}\\s\\d{3}";
        if (!idCard.matches(regexIdCard)){
            throw new IdCardException("The Id Card must have 9 digits and be in the format XXX XXX XXX");
        }
    }
}
