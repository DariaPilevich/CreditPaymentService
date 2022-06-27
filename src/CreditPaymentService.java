public class CreditPaymentService {
    public int calculate(int totalAmount, double annualRate, int creditPeriod) {
        double monthRate;
        monthRate = annualRate / 1200;
        int result = (int) Math.round(totalAmount * (monthRate / (1 - (Math.pow((1 + monthRate), -(creditPeriod))))));
        return result;
    }
}
