package BehavioralPatterns.aVisitorPattern;

import StructuralPatterns.aAdapterPattern.Computer;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
