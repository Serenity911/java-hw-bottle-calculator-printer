public class Printer {
    private int sheets;

    public Printer() {
        this.sheets = 100;
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

}
