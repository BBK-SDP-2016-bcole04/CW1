package sml;

/**
 * Created by digibrose on 30/01/2016.
 */
public class BnzInstruction extends Instruction {
    private int reg;
    private String lab;


    public BnzInstruction(String l, String op) {
        super(l, op);
    }

    public BnzInstruction(String label, int reg, String lab) {
        this(label, "bnz");
        this.reg = reg;
        this.lab = lab;
    }

    @Override
    public void execute(Machine m) {
        if (m.getRegisters().getRegister(reg) > 0) {
            m.setPc(m.getLabels().indexOf(lab));
        }
    }

    @Override
    public String toString() {
        return super.toString() + " If " + reg + " has a value next line is " + lab;}
}
