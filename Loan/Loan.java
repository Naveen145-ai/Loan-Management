public class Loan {
    private int loanId;
    private int userId;
    private double amount;
    private String status;
    private double remainingAmount;

    public Loan(int loanId, int userId, double amount) {
        this.loanId = loanId;
        this.userId = userId;
        this.amount = amount;
        this.remainingAmount = amount;
        this.status = "PENDING";
    }

    public int getLoanId() {
        return loanId;
    }

    public int getUserId() {
        return userId;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void payAmount(double amt) {
        remainingAmount -= amt;
    }
}
