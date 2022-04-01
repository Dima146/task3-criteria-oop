package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance {
    private int powerConsumption;
    private int numberOfSpeakers;
    private double frequencyRange;
    private double cordLength;

    private Speakers(SpeakersBuilder speakersBuilder) {
        this.powerConsumption = speakersBuilder.powerConsumption;
        this.numberOfSpeakers = speakersBuilder.numberOfSpeakers;
        this.frequencyRange = speakersBuilder.frequencyRange;
        this.cordLength = speakersBuilder.cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public double getFrequencyRange() {
        return frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (!(comparedObject instanceof Speakers)) {
            return false;
        }
        Speakers comparedSpeakers = (Speakers) comparedObject;

        if ((super.equals(comparedSpeakers)) &&
                this.powerConsumption == comparedSpeakers.powerConsumption &&
                this.numberOfSpeakers == comparedSpeakers.numberOfSpeakers &&
                this.frequencyRange == comparedSpeakers.frequencyRange &&
                this.cordLength == comparedSpeakers.cordLength) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(this.powerConsumption, this.numberOfSpeakers,
                this.frequencyRange, this.cordLength);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                super.toString() +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength;
    }

    public static class SpeakersBuilder extends Appliance.ApplianceBuilder {
        private int powerConsumption;
        private int numberOfSpeakers;
        private double frequencyRange;
        private double cordLength;

        public SpeakersBuilder() {
        }

        @Override
        public SpeakersBuilder withAvailableQuantity(int availableQuantity) {
            super.withAvailableQuantity(availableQuantity);
            return this;
        }

        @Override
        public SpeakersBuilder withPrice(double price) {
            super.withPrice(price);
            return this;
        }

        @Override
        public SpeakersBuilder withMarkingOfGoods(int markingOfGoods) {
            super.withMarkingOfGoods(markingOfGoods);
            return this;
        }

        public SpeakersBuilder withPowerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public SpeakersBuilder withNumberOfSpeakers(int numberOfSpeakers) {
            this.numberOfSpeakers = numberOfSpeakers;
            return this;
        }

        public SpeakersBuilder withFrequencyRange(double frequencyRange) {
            this.frequencyRange = frequencyRange;
            return this;
        }

        public SpeakersBuilder withCordLength(double cordLength) {
            this.cordLength = cordLength;
            return this;
        }

        @Override
        public Speakers build() {
            return new Speakers(this);
        }
    }
}

