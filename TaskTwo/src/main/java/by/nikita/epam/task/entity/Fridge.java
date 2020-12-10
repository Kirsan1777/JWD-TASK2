package by.nikita.epam.task.entity;

public class Fridge extends ElectricalAppliance {
    private double height;
    private double width;
    private int numberOfCameras;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(int numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    @Override
    public String toString() {
        return "height = " + height +
                ", width = " + width +
                ", numberOfCameras = " + numberOfCameras;
    }
}
