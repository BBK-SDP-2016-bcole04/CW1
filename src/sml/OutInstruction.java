package sml;

/**
 * Created by digibrose on 30/01/2016.
 */
public class OutInstruction extends Instruction {
    private int register;
    private int val;

   /* public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }
*/
    public OutInstruction(String label, String register) {
        super(label, "out");
        this.register = Integer.parseInt(register);

    }

    @Override
    public void execute(Machine m) {
        val = m.getRegisters().getRegister(register);
        System.out.println("The value of register " + register + " is " + val);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is " + val;
    }
}
