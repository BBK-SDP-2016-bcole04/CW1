package AutoTest;

import org.junit.Before;
import org.junit.Test;
import sml.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by digibrose on 12/03/2016.
 */
public class BnzInstructionTest {

    Machine m;
    Registers r;
    Labels l;
    AddInstruction a;
    BnzInstruction b;
    ArrayList<Instruction> prog;

    @Before
    public void setUp() throws Exception {
        m = new Machine();
        r = new Registers();
        m.setRegisters(r);
        r.setRegister(1,1);
        prog = new ArrayList<Instruction>();
        l = new Labels();
        l.addLabel("f0");
        l.addLabel("f1");
        m.setLabels(l);
        b = new BnzInstruction("f2", "1", "f1");
    }

    @Test
    public void testExecute1() throws Exception {
        b.execute(m);
        assertEquals(1, m.getPc());
    }

    @Test
    public void testToString1() throws Exception {
        assertEquals("f2: bnz If 1 has a value next line is f1", b.toString());
    }
}