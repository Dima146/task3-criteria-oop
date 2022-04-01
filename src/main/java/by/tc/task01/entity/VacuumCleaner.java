package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private String motorSpeedRegulation;
    private double cleaningWidth;

    private VacuumCleaner(VacuumCleanerBuilder vacuumCleanerBuilder) {
        this.powerConsumption = vacuumCleanerBuilder.powerConsumption;
        this.filterType = vacuumCleanerBuilder.filterType;
        this.bagType = vacuumCleanerBuilder.bagType;
        this.wandType = vacuumCleanerBuilder.wandType;
        this.motorSpeedRegulation = vacuumCleanerBuilder.motorSpeedRegulation;
        this.cleaningWidth = vacuumCleanerBuilder.cleaningWidth;

    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public String getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (!(comparedObject instanceof VacuumCleaner)) {
            return false;
        }
        VacuumCleaner comparedVacuumCleaner = (VacuumCleaner) comparedObject;

        if ((super.equals(comparedVacuumCleaner)) &&
                this.powerConsumption == comparedVacuumCleaner.powerConsumption &&
                this.filterType == comparedVacuumCleaner.filterType &&
                this.bagType == comparedVacuumCleaner.bagType &&
                this.wandType == comparedVacuumCleaner.wandType &&
                this.motorSpeedRegulation == comparedVacuumCleaner.motorSpeedRegulation &&
                this.cleaningWidth == comparedVacuumCleaner.cleaningWidth) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(this.powerConsumption, this.filterType,
                this.bagType, this.wandType, this.motorSpeedRegulation, this.cleaningWidth);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                super.toString() +
                "powerConsumption=" + this.powerConsumption +
                ", filterType='" + this.filterType + '\'' +
                ", bagType='" + this.bagType + '\'' +
                ", wandType='" + this.wandType + '\'' +
                ", motorSpeedRegulation='" + this.motorSpeedRegulation + '\'' +
                ", cleaningWidth=" + this.cleaningWidth;
    }

    public static class VacuumCleanerBuilder extends Appliance.ApplianceBuilder {
        private int powerConsumption;
        private String filterType;
        private String bagType;
        private String wandType;
        private String motorSpeedRegulation;
        private double cleaningWidth;

        public VacuumCleanerBuilder() {
        }

        @Override
        public VacuumCleanerBuilder withAvailableQuantity(int availableQuantity) {
            super.withAvailableQuantity(availableQuantity);
            return this;
        }

        @Override
        public VacuumCleanerBuilder withPrice(double price) {
            super.withPrice(price);
            return this;
        }

        @Override
        public VacuumCleanerBuilder withMarkingOfGoods(int markingOfGoods) {
            super.withMarkingOfGoods(markingOfGoods);
            return this;
        }

        public VacuumCleanerBuilder withPowerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public VacuumCleanerBuilder withFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }

        public VacuumCleanerBuilder withBagType(String bagType) {
            this.bagType = bagType;
            return this;
        }

        public VacuumCleanerBuilder withWandType(String wandType) {
            this.wandType = wandType;
            return this;
        }

        public VacuumCleanerBuilder withMotorSpeedRegulation(String motorSpeedRegulation) {
            this.motorSpeedRegulation = motorSpeedRegulation;
            return this;
        }

        public VacuumCleanerBuilder withCleaningWidth(double cleaningWidth) {
            this.cleaningWidth = cleaningWidth;
            return this;
        }

        @Override
        public VacuumCleaner build() {
            return new VacuumCleaner(this);
        }
    }
}

