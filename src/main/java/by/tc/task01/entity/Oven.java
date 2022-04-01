package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{
    private int powerConsumption;
    private double capacity;
    private double weight;
    private double depth;
    private double height;
    private double width;

    private Oven(OvenBuilder ovenBuilder) {
        this.powerConsumption = ovenBuilder.powerConsumption;
        this.capacity = ovenBuilder.capacity;
        this.weight = ovenBuilder.weight;
        this.depth = ovenBuilder.depth;
        this.height = ovenBuilder.height;
        this.width = ovenBuilder.width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (!(comparedObject instanceof Oven)) {
            return false;
        }
        Oven comparedOven = (Oven) comparedObject;

        if ((super.equals(comparedOven)) &&
                this.powerConsumption == comparedOven.powerConsumption &&
                this.capacity == comparedOven.capacity &&
                this.weight == comparedOven.weight &&
                this.depth == comparedOven.depth &&
                this.height == comparedOven.height &&
                this.width == comparedOven.width) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(this.powerConsumption, this.capacity,
                this.weight, this.depth, this.height, this.width);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                super.toString() +
                "powerConsumption=" + this.powerConsumption +
                ", capacity=" + this.capacity +
                ", weight=" + this.weight +
                ", depth=" + this.depth +
                ", height=" + this.height +
                ", width=" + this.width;
    }

    public static class OvenBuilder extends Appliance.ApplianceBuilder {
        private int powerConsumption;
        private double capacity;
        private double weight;
        private double depth;
        private double height;
        private double width;

        public OvenBuilder() {
        }

        @Override
        public OvenBuilder withAvailableQuantity(int availableQuantity) {
            super.withAvailableQuantity(availableQuantity);
            return this;
        }

        @Override
        public OvenBuilder withPrice(double price) {
            super.withPrice(price);
            return this;
        }

        @Override
        public OvenBuilder withMarkingOfGoods(int markingOfGoods) {
            super.withMarkingOfGoods(markingOfGoods);
            return this;
        }

        public OvenBuilder withPowerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public OvenBuilder withCapacity(double capacity) {
            this.capacity = capacity;
            return this;
        }

        public OvenBuilder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public OvenBuilder withDepth(double depth) {
            this.depth = depth;
            return this;
        }

        public OvenBuilder withHeight(double height) {
            this.height = height;
            return this;
        }

        public OvenBuilder withWidth(double width) {
            this.width = width;
            return this;
        }

        @Override
        public Oven build() {
            return new Oven(this);
        }
    }
}
