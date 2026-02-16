import java.util.ArrayList;

public class LoanService {
    private ArrayList<Loan> loans = new ArrayList<>();

    public void applyLoan(Loan loan) {
        loans.add(loan);
        System.out.println("Loan Applied Successfully!");
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public Loan findLoanById(int loanId) {
        for (Loan l : loans) {
            if (l.getLoanId() == loanId) {
                return l;
            }
        }
        return null;
    }
}

