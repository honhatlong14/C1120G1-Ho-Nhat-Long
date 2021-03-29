package common.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String REGEX_CUSTOMER_ID = "^(KH-)\\d{4}$";
    private static final String REGEX_PHONE = "^(09|\\(84\\)\\+9)[01]\\d{7}$";
    private static final String REGEX_DATE = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|" +
            "((29|30)[\\/](0[4,6,9]|11)))[\\/]([2-9][0-9]\\d\\d|19\\d[1-9])$)|" +
            "(^29[\\/]02[\\/]((19|[2-9][0-9])(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)|[2-9][0-9]00)$)";
    private static final String REGEX_ID_CARD = "^\\d{9}|\\d{12}$";
    private static final String REGEX_EMAIL = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
}