package by.nikita.epam.task.factory;

import by.nikita.epam.task.creator.FridgeCreator;
import by.nikita.epam.task.creator.LaptopCreator;
import by.nikita.epam.task.creator.MicrowaveCreator;
import by.nikita.epam.task.entity.ElectricalAppliance;

public class PlantFactory {
    public ElectricalAppliance createProduct(String kod){
        ElectricalAppliance product = null;
        LaptopCreator laptopCreator = new LaptopCreator();
        FridgeCreator fridgeCreator = new FridgeCreator();
        MicrowaveCreator microwaveCreator = new MicrowaveCreator();


        switch (kod){
            case "laptop":
                product = laptopCreator.createLaptop();
                break;
            case "fridge":
                product = fridgeCreator.createFridge();
                break;
            case "microwave":
                product = microwaveCreator.createMicrowave();
                break;
            default:
        }
        return product;
    }
}
