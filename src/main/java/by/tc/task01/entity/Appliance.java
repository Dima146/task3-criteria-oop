package by.tc.task01.entity;

import java.util.Objects;

public class Appliance {
    private int availableQuantity;
    private double price;
    private int markingOfGoods;

    public Appliance() {
    }

    private Appliance(ApplianceBuilder builder) {
        this.availableQuantity = builder.availableQuantity;
        this.price = builder.price;
        this.markingOfGoods = builder.markingOfGoods;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getPrice() {
        return price;
    }

    public int getMarkingOfGoods() {
        return markingOfGoods;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (!(comparedObject instanceof Appliance)) {
            return false;
        }
        Appliance comparedAppliance = (Appliance) comparedObject;

        if (this.availableQuantity == comparedAppliance.availableQuantity &&
                this.price == comparedAppliance.price &&
                this.markingOfGoods == comparedAppliance.markingOfGoods) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.availableQuantity, this.price, this.markingOfGoods);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "availableQuantity=" + this.availableQuantity +
                ", price=" + this.price +
                ", markingOfGoods=" + this.markingOfGoods;
    }

    public static class ApplianceBuilder {
        private int availableQuantity;
        private double price;
        private int markingOfGoods;

        public ApplianceBuilder() {
        }

        public ApplianceBuilder withAvailableQuantity(int availableQuantity) {
            this.availableQuantity = availableQuantity;
            return this;
        }

        public ApplianceBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ApplianceBuilder withMarkingOfGoods(int markingOfGoods) {
            this.markingOfGoods = markingOfGoods;
            return this;
        }

        public Appliance build() {
            return new Appliance(this);
        }
    }
}
