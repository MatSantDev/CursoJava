package Exercice.Interface2.Services;

public interface OnlinePaymentService {

    public Double paymentFee(Double amount);
    public Double interest(Double amount, Integer months);
}
