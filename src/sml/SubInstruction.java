package sml;

/**
 * Created by digibrose on 30/01/2016.
 */
public class SubInstruction extends Instruction {
    private int result;
    private int op1;
    private int op2;

    public SubInstruction(String l, String op) {
        super(l, op);
    }

    public SubInstruction(String label, String result, String op1, String op2) {
        this(label, "sub");
        this.result = Integer.parseInt(result);
        this.op1 = Integer.parseInt(op1);
        this.op2 = Integer.parseInt(op2);
    }

    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 - value2);
    }

    @Override
    public String toString() {
        return super.toString() + " " + op1 + " - " + op2 + " to " + result;
    }

}
