public class PaymentService {

    public void payEMI(Loan loan, double amount) {
        if (loan.getStatus().equals("APPROVED")) {
            loan.payAmount(amount);
            System.out.println("EMI Paid Successfully");
        } else {
            System.out.println("Loan not approved!");
        }
    }

    public void payPrincipal(Loan loan, double amount) {
        if (loan.getStatus().equals("APPROVED")) {
            loan.payAmount(amount);
            System.out.println("Principal Paid Successfully");
        } else {
            System.out.println("Loan not approved!");
        }
    }
}
