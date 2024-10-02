package Project;

public class Pan {

    private String panNumber;
    private String aadhaarNumber;
    private String bankDetails;
    private String investements;

    public Pan(String panNumber, String aadhaarNumber, String bankDetails, String investements) {
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.bankDetails = bankDetails;
        this.investements = investements;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestements() {
        return investements;
    }

    public void setInvestements(String investements) {
        this.investements = investements;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investements='" + investements + '\'' +
                '}';
    }
}
