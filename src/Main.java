public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double rate = 9.99;
        int period = 36;
        int result;
        result = service.calculate(amount, rate, period);
        System.out.println(result);
    }
}
