package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance {
    private double batteryCapacity;
    private double displayInches;
    private int memoryRom;
    private double flashMemoryCapacity;
    private String color;

    private TabletPC(TabletPCBuilder tabletPCBuilder) {
        this.batteryCapacity = tabletPCBuilder.batteryCapacity;
        this.displayInches = tabletPCBuilder.displayInches;
        this.memoryRom = tabletPCBuilder.memoryRom;
        this.flashMemoryCapacity = tabletPCBuilder.flashMemoryCapacity;
        this.color = tabletPCBuilder.color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (!(comparedObject instanceof TabletPC)) {
            return false;
        }
        TabletPC comparedTabletPC = (TabletPC) comparedObject;

        if ((super.equals(comparedTabletPC)) &&
                this.batteryCapacity == comparedTabletPC.batteryCapacity &&
                this.displayInches == comparedTabletPC.displayInches &&
                this.memoryRom == comparedTabletPC.memoryRom &&
                this.flashMemoryCapacity == comparedTabletPC.flashMemoryCapacity &&
                this.color == comparedTabletPC.color) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(this.batteryCapacity, this.displayInches,
                this.memoryRom, this.flashMemoryCapacity, this.color);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                super.toString() +
                "batteryCapacity=" + this.batteryCapacity +
                ", displayInches=" + this.displayInches +
                ", memoryRom=" + this.memoryRom +
                ", flashMemoryCapacity=" + this.flashMemoryCapacity +
                ", color='" + this.color;
    }

    public static class TabletPCBuilder extends Appliance.ApplianceBuilder {
        private double batteryCapacity;
        private double displayInches;
        private int memoryRom;
        private double flashMemoryCapacity;
        private String color;

        public TabletPCBuilder() {
        }

        @Override
        public TabletPCBuilder withAvailableQuantity(int availableQuantity) {
            super.withAvailableQuantity(availableQuantity);
            return this;
        }

        @Override
        public TabletPCBuilder withPrice(double price) {
            super.withPrice(price);
            return this;
        }

        @Override
        public TabletPCBuilder withMarkingOfGoods(int markingOfGoods) {
            super.withMarkingOfGoods(markingOfGoods);
            return this;
        }

        public TabletPCBuilder withBatteryCapacity(double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public TabletPCBuilder withDisplayInches(double displayInches) {
            this.displayInches = displayInches;
            return this;
        }

        public TabletPCBuilder withMemoryRom(int memoryRom) {
            this.memoryRom = memoryRom;
            return this;
        }

        public TabletPCBuilder withFlashMemoryCapacity(double flashMemoryCapacity) {
            this.flashMemoryCapacity = flashMemoryCapacity;
            return this;
        }

        public TabletPCBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        @Override
        public TabletPC build() {
            return new TabletPC(this);
        }
    }
}






