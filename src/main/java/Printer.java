public class Printer {
    private int sheets;
    private int toner;

    public Printer() {
        this.sheets = 100;
        this.toner = 1000;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        int totalPagesToPrint = numberOfPages * numberOfCopies;
        if (this.sheets >= totalPagesToPrint) {
            this.sheets -= totalPagesToPrint;
        }
    }

    public int getToner() {
        return this.toner;
    }

}
