package by.nikita.epam.task.creator;

import by.nikita.epam.task.entity.Fridge;

import java.util.Scanner;

public class FridgeCreator extends Fridge {
    public Fridge createFridge(){
        Fridge fridge = new FridgeCreator();
        Scanner in = new Scanner(System.in);
        fridge.setWidth(in.nextDouble());
        fridge.setHeight(in.nextDouble());
        fridge.setNumberOfCameras(in.nextInt());
        System.out.println("add fridge");
        return fridge;
    }
}
