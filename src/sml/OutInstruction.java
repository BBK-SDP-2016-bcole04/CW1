package sml;

/**
 * Created by digibrose on 30/01/2016.
 */
public class OutInstruction extends Instruction {
    private int register;
    private int val;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;

    }

    @Override
    public void execute(Machine m) {
        val = m.getRegisters().getRegister(register);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is " + val;
    }
}
