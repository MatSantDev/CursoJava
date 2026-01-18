package Exercice.Interface2.Services;

import Exercice.Interface2.Entities.Contract;
import Exercice.Interface2.Entities.Installment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        List<Installment> installments = new ArrayList<>();
        Double valor = contract.getTotalValue() / months;
        for (int i = 0; i < months; i++) {
            Double valor2 = onlinePaymentService.paymentFee(valor);
            Double valor3 = onlinePaymentService.interest(valor2, i+1);
            Date data = contract.getDate();
            Installment installment = new Installment(data, valor3);
            installments.add(installment);
        }
        contract.setInstallments(installments);
    }
}
