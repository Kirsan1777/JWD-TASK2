package by.nikita.epam.task.entity;

public class Laptop extends ElectricalAppliance {

    private double weight;
    private int memory;
    private int videoCard;
    private double screen;


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return  memory+ " " + videoCard + " " + screen + " " + getWeight();
    }
}
