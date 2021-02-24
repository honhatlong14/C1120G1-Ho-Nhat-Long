package lession_17_string_and_regex.bai_tap.validate_name_of_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static final String NAME_CLASS = "[CAP]\\d{4}[GHIKLM]";
    public static final String[] validClass = new String[]{"C0318G","C1020G"};
    public static final String[] unValidClass = new String[]{"M0318G","P0323A"};
    public NameClass(){
    }
    public boolean validate(String regex){
        Pattern pattern =Pattern.compile(NAME_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
        NameClass nameClass = new NameClass();
        for (String name: validClass){
            boolean isvalid = nameClass.validate(name);
            System.out.println("NameClass is " + name +" is valid: "+ isvalid);
        }
        for (String name: unValidClass){
            boolean unvalid = nameClass.validate(name);
            System.out.println("NameClass is " + name + " is valid " + unvalid);
        }
    }
}
