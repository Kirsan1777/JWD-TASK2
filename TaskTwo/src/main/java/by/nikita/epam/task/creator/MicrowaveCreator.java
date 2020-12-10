package by.nikita.epam.task.creator;

import by.nikita.epam.task.entity.Microwave;
import by.nikita.epam.task.reader.ConsoleReader;

public class MicrowaveCreator extends Microwave {
    public Microwave createMicrowave(){
        Microwave microwave = new MicrowaveCreator();
        ConsoleReader in = new ConsoleReader();
        microwave.setHeight(in.inputDouble());
        microwave.setWidth(in.inputDouble());
        microwave.setManufacture(in.inputString());
        microwave.setVoltage(in.inputDouble());
        System.out.println("add microwave");
        return microwave;
    }
}
