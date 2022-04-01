package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
    private int powerConsumption;
    private double freezerCapacity;
    private double overallCapacity;
    private double weight;
    private double height;
    private double width;

    private Refrigerator(RefrigeratorBuilder refrigeratorBuilder) {
        this.powerConsumption = refrigeratorBuilder.powerConsumption;
        this.freezerCapacity = refrigeratorBuilder.freezerCapacity;
        this.overallCapacity = refrigeratorBuilder.overallCapacity;
        this.weight = refrigeratorBuilder.weight;
        this.height = refrigeratorBuilder.height;
        this.width = refrigeratorBuilder.width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public double getWeight() {
        return weight;
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
        if (!(comparedObject instanceof Refrigerator)) {
            return false;
        }
        Refrigerator comparedRefrigerator = (Refrigerator) comparedObject;

        if ((super.equals(comparedRefrigerator)) &&
                this.powerConsumption == comparedRefrigerator.powerConsumption &&
                this.freezerCapacity == comparedRefrigerator.freezerCapacity &&
                this.overallCapacity == comparedRefrigerator.overallCapacity &&
                this.weight == comparedRefrigerator.weight &&
                this.height == comparedRefrigerator.height &&
                this.width == comparedRefrigerator.width) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(this.powerConsumption, this.freezerCapacity,
                this.overallCapacity, this.weight, this.height, this.width);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                super.toString() +
                "powerConsumption=" + this.powerConsumption +
                ", freezerCapacity=" + this.freezerCapacity +
                ", overallCapacity=" + this.overallCapacity +
                ", weight=" + this.weight +
                ", height=" + this.height +
                ", width=" + this.width;
    }

    public static class RefrigeratorBuilder extends Appliance.ApplianceBuilder {
        private int powerConsumption;
        private double freezerCapacity;
        private double overallCapacity;
        private double weight;
        private double height;
        private double width;

        public RefrigeratorBuilder() {
        }

        @Override
        public RefrigeratorBuilder withAvailableQuantity(int availableQuantity) {
            super.withAvailableQuantity(availableQuantity);
            return this;
        }

        @Override
        public RefrigeratorBuilder withPrice(double price) {
            super.withPrice(price);
            return this;
        }

        @Override
        public RefrigeratorBuilder withMarkingOfGoods(int markingOfGoods) {
            super.withMarkingOfGoods(markingOfGoods);
            return this;
        }

        public RefrigeratorBuilder withPowerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public RefrigeratorBuilder withFreezerCapacity(double freezerCapacity) {
            this.freezerCapacity = freezerCapacity;
            return this;
        }

        public RefrigeratorBuilder withOverallCapacity(double overallCapacity) {
            this.overallCapacity = overallCapacity;
            return this;
        }

        public RefrigeratorBuilder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public RefrigeratorBuilder withHeight(double height) {
            this.height = height;
            return this;
        }

        public RefrigeratorBuilder withWidth(double width) {
            this.width = width;
            return this;
        }

        @Override
        public Refrigerator build() {
            return new Refrigerator(this);
        }
    }
}
