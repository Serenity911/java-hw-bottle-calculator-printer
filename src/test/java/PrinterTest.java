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



}
