package by.nikita.epam.task.main;

import by.nikita.epam.task.entity.ElectricalAppliance;
import by.nikita.epam.task.factory.PlantFactory;
import by.nikita.epam.task.reader.ConsoleReader;


public class Main {
    public static void main(String[] args){
        PlantFactory factory = new PlantFactory();
        ConsoleReader in = new ConsoleReader();
        ElectricalAppliance product;
        String kod;
        System.out.println("What do you want to order");
        System.out.println("Input product: ");
        product = factory.createProduct(kod = in.inputString());
        System.out.println(product);
        product.sendProduct();
    }
}
