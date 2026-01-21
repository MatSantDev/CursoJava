package Exercice.Interface2.Services;

import Exercice.Interface2.Entities.Contract;
import Exercice.Interface2.Entities.Installment;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) throws ParseException {
        Double valorMensal = contract.getTotalValue() / months;
        for (int i = 0; i < months; i++) {
            Double paymentFee = valorMensal + onlinePaymentService.paymentFee(valorMensal);
            Double valorTaxado = paymentFee + onlinePaymentService.interest(paymentFee, i+1);
            String data = sdf.format(contract.getDate());
            contract.getInstallments().add(new Installment(sdf.parse(data), valorTaxado));
        }
    }
}
