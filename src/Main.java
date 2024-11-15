import Adaptee.WeightMachineForBabies;
import Adapter.WeightMachineAdapter;
import Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKgs() +"Kgs");
    }
}