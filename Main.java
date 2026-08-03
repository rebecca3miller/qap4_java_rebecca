public class Main {

    public static void main(String[] args) {
        Drug drug1 = new Drug (1, "Tylenol", 5.99, "500mg");
        Drug drug2 = new Drug (2, "Advil", 6.99, "200mg");

        FileHandler.saveDrugToFile(drug1);
        FileHandler.saveDrugToFile(drug2);

        FileHandler.readDrugsFromFile();
    }
    
}
