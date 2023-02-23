package price;

public class NumberValueValidator implements Validator{

    @Override
    public boolean validate(String value) {
        boolean isOnlyDigits = true;
        for(int i = 0; i < value.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(value.charAt(i))) {
                isOnlyDigits = false;
            }
        }
        return isOnlyDigits;
    }

    @Override
    public String message() {
        return "До пробела введено не число или оно отрицательно";
    }
}
