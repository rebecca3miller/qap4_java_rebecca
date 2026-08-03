public class Drug {
    private int drugId;
    private String drugName;
    private double drugCost;
    private String doseage;

    public Drug(int drugId, String drugName, double drugCost, String doseage) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.drugCost = drugCost;
        this.doseage = doseage;
    }

    // Getters and setters
    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getDrugCost() {
        return drugCost;
    }

    public void setDrugCost(double drugCost) {
        this.drugCost = drugCost;
    }

    public String getDoseage() {
        return doseage;
    }

    public void setDoseage(String doseage) {
        this.doseage = doseage;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "drugId=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", drugCost=" + drugCost +
                ", doseage='" + doseage + '\'' +
                '}';
    }
}