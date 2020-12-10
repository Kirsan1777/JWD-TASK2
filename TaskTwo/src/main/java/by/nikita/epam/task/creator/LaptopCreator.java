package by.nikita.epam.task.creator;

import by.nikita.epam.task.entity.Laptop;

import java.util.Scanner;

public class LaptopCreator extends Laptop {
    public Laptop createLaptop() {
        Laptop laptop = new Laptop();
        Scanner in = new Scanner(System.in);
        System.out.println("Weight");
        laptop.setWeight(in.nextDouble());
        System.out.println("Memory");
        laptop.setMemory(in.nextInt());
        System.out.println("Screen");
        laptop.setScreen(in.nextDouble());
        System.out.println("Video card");
        laptop.setVideoCard(in.nextInt());
        System.out.println("add laptop");
        return laptop;
    }
}
