package price;

public class Main {
    public static void main(String[] args) {
        IOService ioService = new IOStreamsService(System.out, System.in);
        PriceApplication application = new PriceApplication(ioService);
        application.run();
    }
}
