package AutoTest;

import org.junit.Before;
import org.junit.Test;
import sml.AddInstruction;
import sml.Machine;
import sml.Registers;

import static org.junit.Assert.*;

/**
 * Created by digibrose on 12/03/2016.
 */
public class AddInstructionTest {

    Machine m;
    Registers r;
    AddInstruction a;

    @Before
    public void setUp() throws Exception {
        m = new Machine();
        r = new Registers();
        m.setRegisters(r);
        r.setRegister(1,1);
        r.setRegister(2,1);
        a = new AddInstruction("f0", "3", "1", "2");
    }

    @Test
    public void testExecute1() throws Exception {
        a.execute(m);
        assertEquals(2, m.getRegisters().getRegister(3));
    }

    @Test
    public void testToString1() throws Exception {
        assertEquals("f0: add reg 1 + reg 2 to 3", a.toString());
    }
}