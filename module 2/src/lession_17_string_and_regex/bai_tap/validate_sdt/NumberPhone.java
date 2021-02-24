package lession_17_string_and_regex.bai_tap.validate_sdt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NUMBER_PHONE = "(\\+84|0)\\s[0-9]{10}";

    public NumberPhone(){
    }
    public boolean validates(String regex){
        Pattern pattern = Pattern.compile(NUMBER_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static NumberPhone numberPhone;
    public static final String[] phoneRight = new String[]{"+84 0978489648"};
    public static final String[] phoneWrong = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        numberPhone =new NumberPhone();
        for (String phone:phoneRight){
            boolean isvalid = numberPhone.validates(phone);
            System.out.println("phone is: " + phone + " valid is " + isvalid);
        }
        for (String phone:phoneWrong){
            boolean  unvalid = numberPhone.validates(phone);
            System.out.println("phone is " +phone+ "valid is" + unvalid);
        }
    }
}
