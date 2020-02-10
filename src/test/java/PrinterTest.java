import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    public Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void starts_with_100_sheets() {
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void can_print_one_copy_of_one_page() {
        printer.print(1, 1);
        assertEquals(99, printer.getSheets());
    }

    @Test
    public void can_print_two_copies_of_three_pages() {
        printer.print(3, 2);
        assertEquals(94, printer.getSheets());
    }

    @Test
    public void cannot_print_if_not_enough_sheets() {
        printer.print(101, 1);
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void can_print_if_exactly_number_of_sheets() {
        printer.print(100, 1);
        assertEquals(0, printer.getSheets());
    }

    @Test
    public void starts_with_toner_filled_up() {
        assertEquals(1000, printer.getToner());
    }

    @Test
    public void toner_can_be_reduced_by_1() {
        printer.reduceTonerByOne();
        assertEquals(999, printer.getToner());
    }

//    @Test
//    public void toner_reduces_by_1_every_page_printed() {
//        printer.print(1, 1);
//        assertEquals(999, printer.getToner());
//    }
}
