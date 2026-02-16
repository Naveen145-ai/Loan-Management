public class Manager extends User {
    //overide
    public Manager(int userId, String name) {
        super(userId, name);
    }

    // Polymorphism
    public void approveLoan(Loan loan, boolean approve) {
        if (approve) {
            loan.setStatus("APPROVED");
        } else {
            loan.setStatus("REJECTED");
        }
    }
}

