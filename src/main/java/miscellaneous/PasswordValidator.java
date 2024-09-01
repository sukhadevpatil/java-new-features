package miscellaneous;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    // digit + lowercase char + uppercase char + punctuation + symbol
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static boolean isValid(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String pwd1 = "iampwd";
        System.out.println(isValid(pwd1));

        String pwd2 = "IamPwd";
        System.out.println(isValid(pwd2));

        String pwd3 = "IamPwd9";
        System.out.println(isValid(pwd3));

        String pwd4 = "IamPwd98";
        System.out.println(isValid(pwd4));

        String pwd5 = "IamPwd@98";
        System.out.println(isValid(pwd5));
    }

}
