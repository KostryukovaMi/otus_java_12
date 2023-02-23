package price;

public class PriceApplication {

    private final IOService ioService;

    public PriceApplication(IOService ioService) {
        this.ioService = ioService;
    }

    public void run() {
        MaxValueValidator maxValueValidator = new MaxValueValidator(2147483647);
        NumberValueValidator numberValueValidator = new NumberValueValidator();
        while (true) {
            int n = -1;
            ioService.outputString("Введите число и валюту через пробел или команду \"exit\"");
            String[] command = ioService.inputStringMassive();
            if (command[0].equals("exit")) {
                break;
            } else {
                if (numberValueValidator.validate(command[0])) {
                    if (maxValueValidator.validate(command[0])) {
                        try {
                            n = Integer.parseInt(command[0]);
                        } catch (Exception e) {
                            ioService.outputString("В процессе выполнения произошла ошибка (ScannerException)");
                        }
                            try {
                                Currency currency = Currency.valueOf(command[1]);
                                String currencyValue = currency.price(n);
                                ioService.outputString("Ваш ответ: ");
                                ioService.outputString(currencyValue);
                            } catch (Exception e) {
                                ioService.outputString("Введена некорректная валюта");
                            }
                    } else {
                        ioService.outputString(maxValueValidator.message());
                    }
                }
                else
                {
                    ioService.outputString(numberValueValidator.message());
                }
            }
        }
    }
}
