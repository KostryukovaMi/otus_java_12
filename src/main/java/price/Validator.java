package price;

public interface Validator {
    default boolean validate(String value) {
        return true;
    }
    default boolean validate(long value){
        return true;
    }
    default boolean validate(String[] value){
        return true;
    }
    String message();
}
