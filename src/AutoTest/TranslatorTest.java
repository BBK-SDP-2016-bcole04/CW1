package AutoTest;

import org.junit.Before;
import org.junit.Test;
import sml.*;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Created by digibrose on 14/03/2016.
 */
public class TranslatorTest {

    Translator T;
    ArrayList<Instruction> I;

    @Before
    public void setup(){
        T = new Translator("Test.inp");
        I = new ArrayList<Instruction>();
    }

    @Test
    public void testGetInstruction() throws Exception {
       T.readAndTranslate(new Labels(), I);
        assertThat(I.get(0), instanceOf(LinInstruction.class));
    }

    @Test
    public void testGetInstruction2() throws Exception {
        T.readAndTranslate(new Labels(), I);
        assertThat(I.get(1), instanceOf(MulInstruction.class));
    }

    @Test
    public void testGetInstruction3() throws Exception {
        T.readAndTranslate(new Labels(), I);
        assertThat(I.get(2), instanceOf(SubInstruction.class));
    }
}