import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoanService loanService = new LoanService();
        PaymentService paymentService = new PaymentService();
        Manager manager = new Manager(100, "Admin");

        int choice;
        int loanIdCounter = 1;

        do {
            System.out.println("\n1.Apply Loan");
            System.out.println("2.Approve/Reject Loan");
            System.out.println("3.View Loans");
            System.out.println("4.Pay EMI");
            System.out.println("5.Pay Principal");
            System.out.println("0.Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    System.out.print("Enter Loan Amount: ");
                    double amt = sc.nextDouble();

                    Loan loan = new Loan(loanIdCounter++, uid, amt);
                    loanService.applyLoan(loan);
                    break;

                case 2:
                    System.out.print("Enter Loan ID: ");
                    int lid = sc.nextInt();
                    Loan loanToApprove = loanService.findLoanById(lid);

                    if (loanToApprove != null) {
                        System.out.print("Approve? (true/false): ");
                        boolean approve = sc.nextBoolean();
                        manager.approveLoan(loanToApprove, approve);
                        System.out.println("Loan Status: " + loanToApprove.getStatus());
                    }
                    break;

                case 3:
                    for (Loan l : loanService.getLoans()) {
                        System.out.println(
                            "LoanID: " + l.getLoanId() +
                            " UserID: " + l.getUserId() +
                            " Status: " + l.getStatus() +
                            " Remaining: " + l.getRemainingAmount()
                        );
                    }
                    break;

                case 4:
                    System.out.print("Loan ID: ");
                    int emiId = sc.nextInt();
                    System.out.print("EMI Amount: ");
                    double emiAmt = sc.nextDouble();
                    paymentService.payEMI(
                        loanService.findLoanById(emiId), emiAmt
                    );
                    break;

                case 5:
                    System.out.print("Loan ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Principal Amount: ");
                    double pAmt = sc.nextDouble();
                    paymentService.payPrincipal(
                        loanService.findLoanById(pid), pAmt
                    );
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
