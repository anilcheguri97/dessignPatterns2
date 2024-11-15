package Adapter;

import Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine machine;

    public WeightMachineAdapterImpl(WeightMachine machine) {
        this.machine = machine;
    }

    @Override
    public double getWeightInKgs() {
        return machine.getWeightInpound()*0.45;
    }
}
