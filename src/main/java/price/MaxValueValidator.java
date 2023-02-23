package price;

public class MaxValueValidator implements Validator{

    private final int maxValue;

    public MaxValueValidator(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean validate(String value) {
        long n = Long.parseLong(value);
        return n < maxValue;
    }

    @Override
    public String message() {
        return "Введено слишком большое число";
    }
}

