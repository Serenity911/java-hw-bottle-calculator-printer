public class Printer {
    private int sheets;
    private int toner;
    private int totalPagesToBePrinted;

    public Printer() {
        this.sheets = 100;
        this.toner = 1000;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        this.totalNumberPagesToPrint(numberOfPages, numberOfCopies);
        if (isPaperEnough() && isTonerEnough()) {
            reduceTonerByPagesPrinted();
            reduceSheetsByPagesPrinted();
            this.totalPagesToBePrinted = 0;
        }
    }

    public void totalNumberPagesToPrint(int numberOfPages, int numberOfCopies) {
        this.totalPagesToBePrinted = numberOfPages * numberOfCopies;
    }

    public boolean isPaperEnough() {
        return this.sheets >= this.totalPagesToBePrinted;
    }

    public boolean isTonerEnough() {
        return this.toner >= this.totalPagesToBePrinted;
    }

    public int getToner() {
        return this.toner;
    }

    public void reduceTonerByOne() {
        this.toner -= 1;
    }

    public void reduceTonerByPagesPrinted() {
        this.toner -= this.totalPagesToBePrinted;
    }

    public void reduceSheetsByPagesPrinted() {
        this.sheets -= this.totalPagesToBePrinted;
    }

}
