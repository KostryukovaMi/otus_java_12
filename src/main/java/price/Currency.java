package price;

public enum Currency {
    rub(new String[] {"рубль", "рубля", "рублей"}), usd(new String[] {"доллар","доллара","долларов"}), euro(new String[] {"евро","евро","евро"});
    private final String[] endings;

    Currency(String[] endings) {
        this.endings = endings;
    }


    public String price(int n) {
    if (n % 10 == 1){
        if (n % 100 == 11)
        {
            return n + " " + endings[0];
        }
        else {
            return n + " " + endings[0];
        }
    } else if (n % 10 == 0 || (n % 10 >= 5 && n % 10 <= 9)) {
        return n + " " + endings[2];
    } else if (n % 10 >= 2 && n % 10 <= 4) {
        if (n % 100 >= 12 && n % 100 <= 14) {
            return n + " " + endings[2];
        }
        return n + " " + endings[1];
        }
    return null;
    }
}
