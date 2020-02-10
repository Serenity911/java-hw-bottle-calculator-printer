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
    public void printer_starts_with_100_sheets() {
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void printer_can_print_one_copy_of_one_page() {
        printer.print(1, 1);
        assertEquals(99, printer.getSheets());
    }

    @Test
    public void printer_can_print_two_copies_of_three_pages() {
        printer.print(3, 2);
        assertEquals(94, printer.getSheets());
    }

}
