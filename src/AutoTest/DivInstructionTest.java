package AutoTest;

import org.junit.Before;
import org.junit.Test;
import sml.DivInstruction;
import sml.Machine;
import sml.Registers;

import static org.junit.Assert.assertEquals;

/**
 * Created by digibrose on 12/03/2016.
 */
public class DivInstructionTest {

    Machine m;
    Registers r;
    DivInstruction d;

    @Before
    public void setUp() throws Exception {
        m = new Machine();
        r = new Registers();
        m.setRegisters(r);
        r.setRegister(1,4);
        r.setRegister(2,2);
        d = new DivInstruction("f0", "3", "1", "2");
    }

    @Test
    public void testExecute1() throws Exception {
        d.execute(m);
        assertEquals(2, m.getRegisters().getRegister(3));
    }

    @Test
    public void testToString1() throws Exception {
        assertEquals("f0: div reg 1 /reg 2 to 3", d.toString());
    }
}