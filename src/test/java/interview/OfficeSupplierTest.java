package interview;

import org.junit.jupiter.api.Test;

public class OfficeSupplierTest {
    
    @Test
    public void testOfficeShredder() {
        assert OfficeSupplier.shredFirstCharacter("Michael").equals("ichael");
        assert OfficeSupplier.shredFirstCharacter("Pam").equals("am");

        assert OfficeSupplier.shredLastCharacter("Dwight").equals("Dwigh");
        assert OfficeSupplier.shredLastCharacter("Jim").equals("Ji");
    }

    @Test
    public void testOfficeStapler() {
        assert OfficeSupplier.stapleToBeginning("ngela", 'A').equals("Angela");
        assert OfficeSupplier.stapleToBeginning("tanley", 'S').equals("Stanley");

        assert OfficeSupplier.stapleToEnd("Kell", 'y').equals("Kelly");
        assert OfficeSupplier.stapleToEnd("Meredit", 'h').equals("Meredith");
    }
}
