package sml;

/**
 * This class ....
 *
 * @author someone
 */

public class LinInstruction extends Instruction {
    private int register;
    private int value;

    public LinInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public LinInstruction(String label, String register, String value) {
        super(label, "lin");
        this.register = Integer.parseInt(register);
        this.value = Integer.parseInt(value);

    }

    @Override
    public void execute(Machine m) {
        m.getRegisters().setRegister(register, value);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is " + value;
    }
}
