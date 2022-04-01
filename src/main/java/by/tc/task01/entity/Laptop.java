package by.tc.task01.entity;


import java.util.Objects;

public class Laptop extends Appliance {
    private double batteryCapacity;
    private String operatingSystem;
    private int memoryRom;
    private int systemMemory;
    private double cpuClockRate;
    private double displayInches;

    private Laptop(LaptopBuilder laptopBuilder) {
        this.batteryCapacity = laptopBuilder.batteryCapacity;
        this.operatingSystem = laptopBuilder.operatingSystem;
        this.memoryRom = laptopBuilder.memoryRom;
        this.systemMemory = laptopBuilder.systemMemory;
        this.cpuClockRate = laptopBuilder.cpuClockRate;
        this.displayInches = laptopBuilder.displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public double getCpuClockRate() {
        return cpuClockRate;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (!(comparedObject instanceof Laptop)) {
            return false;
        }
        Laptop comparedLaptop = (Laptop) comparedObject;

        if ((super.equals(comparedLaptop)) &&
                this.batteryCapacity == comparedLaptop.batteryCapacity &&
                this.operatingSystem == comparedLaptop.operatingSystem &&
                this.memoryRom == comparedLaptop.memoryRom &&
                this.systemMemory == comparedLaptop.systemMemory &&
                this.cpuClockRate == comparedLaptop.cpuClockRate &&
                this.displayInches == comparedLaptop.displayInches) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(this.batteryCapacity, this.operatingSystem,
                this.memoryRom, this.systemMemory, this.cpuClockRate, this.displayInches);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                super.toString() +
                "batteryCapacity=" + this.batteryCapacity +
                ", operatingSystem='" + this.operatingSystem + '\'' +
                ", memoryRom=" + this.memoryRom +
                ", systemMemory=" + this.systemMemory +
                ", cpuClockRate=" + this.cpuClockRate +
                ", displayInches=" + this.displayInches;
    }

    public static class LaptopBuilder extends Appliance.ApplianceBuilder {
        private double batteryCapacity;
        private String operatingSystem;
        private int memoryRom;
        private int systemMemory;
        private double cpuClockRate;
        private double displayInches;

        public LaptopBuilder() {
        }

        @Override
        public LaptopBuilder withAvailableQuantity(int availableQuantity) {
            super.withAvailableQuantity(availableQuantity);
            return this;
        }

        @Override
        public LaptopBuilder withPrice(double price) {
            super.withPrice(price);
            return this;
        }

        @Override
        public LaptopBuilder withMarkingOfGoods(int markingOfGoods) {
            super.withMarkingOfGoods(markingOfGoods);
            return this;
        }

        public LaptopBuilder withBatteryCapacity(double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public LaptopBuilder withOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public LaptopBuilder withMemoryRom(int memoryRom) {
            this.memoryRom = memoryRom;
            return this;
        }

        public LaptopBuilder withSystemMemory(int systemMemory) {
            this.systemMemory = systemMemory;
            return this;
        }

        public LaptopBuilder withCpuClockRate(double cpuClockRate) {
            this.cpuClockRate = cpuClockRate;
            return this;
        }

        public LaptopBuilder withDisplayInches(double displayInches) {
            this.displayInches = displayInches;
            return this;
        }

        @Override
        public Laptop build() {
            return new Laptop(this);
        }
    }

}



