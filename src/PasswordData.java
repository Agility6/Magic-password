import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: PasswordData
 * Description:
 *
 * @Author Agility6
 * @Create 2023-06-20
 * @Version 1.0
 */
public class PasswordData {
  public static final String CAPITAL_LETTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static final String SMALL_LETTER = "abcdefghijklmnopqrstuvwxyz";
  public static final String NUMBERS = "1234567890";

  private final StringBuilder password;

  public PasswordData(boolean NumberType, boolean capitalLetter, boolean smallLetter) {
    password = new StringBuilder();

    if (NumberType) password.append(NUMBERS);
    if (capitalLetter) password.append(CAPITAL_LETTER);
    if (smallLetter) password.append(SMALL_LETTER);
  }

  public String getPassWord() {
    return password.toString();
  }
}
