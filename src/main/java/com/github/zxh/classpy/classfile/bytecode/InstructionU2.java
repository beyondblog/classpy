package com.github.zxh.classpy.classfile.bytecode;

import com.github.zxh.classpy.classfile.ClassReader;
import com.github.zxh.classpy.classfile.U2;

/**
 *
 * @author zxh
 */
public class InstructionU2 extends Instruction {

    public InstructionU2(Opcode opcode, int pc) {
        super(opcode, pc);
    }

    @Override
    protected void readOperands(ClassReader reader) {
        U2 operand = reader.readU2();
        setDesc(getDesc() + " " + operand.getDesc());
    }
    
}
