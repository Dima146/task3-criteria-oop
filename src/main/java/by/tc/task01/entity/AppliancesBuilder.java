package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public final class AppliancesBuilder {
    private Appliance appliance;

    public AppliancesBuilder(){
    }

    public Appliance laptopBuild(Map<String, Object> map, Criteria criteria) {
        if (Laptop.class.getSimpleName().equals(criteria.getGroupSearchName())) {
            appliance = new Laptop.LaptopBuilder()
                    .withAvailableQuantity(parseInt((String) map.get(SearchCriteria.Laptop.AVAILABLE_QUANTITY.toString())))
                    .withPrice(parseDouble((String) map.get(SearchCriteria.Laptop.PRICE.toString())))
                    .withMarkingOfGoods(parseInt((String) map.get(SearchCriteria.Laptop.MARKING_OF_GOODS.toString())))
                    .withBatteryCapacity(parseDouble((String) map.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())))
                    .withOperatingSystem((String) map.get(SearchCriteria.Laptop.OS.toString()))
                    .withMemoryRom(parseInt((String) map.get(SearchCriteria.Laptop.MEMORY_ROM.toString())))
                    .withSystemMemory(parseInt((String) map.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())))
                    .withCpuClockRate(parseDouble((String) map.get(SearchCriteria.Laptop.CPU.toString())))
                    .withDisplayInches(parseDouble((String) map.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString())))
                    .build();
        }
        return appliance;
    }

    public Appliance ovenBuild(Map<String, Object> map, Criteria criteria) {
        if (Laptop.class.getSimpleName().equals(criteria.getGroupSearchName())) {
            appliance = new Oven.OvenBuilder()
                    .withAvailableQuantity(parseInt((String) map.get(SearchCriteria.Oven.AVAILABLE_QUANTITY.toString())))
                    .withPrice(parseDouble((String) map.get(SearchCriteria.Oven.PRICE.toString())))
                    .withMarkingOfGoods(parseInt((String) map.get(SearchCriteria.Oven.MARKING_OF_GOODS.toString())))
                    .withPowerConsumption(parseInt((String) map.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString())))
                    .withCapacity(parseDouble((String) map.get(SearchCriteria.Oven.CAPACITY.toString())))
                    .withWeight(parseDouble((String) map.get(SearchCriteria.Oven.WEIGHT.toString())))
                    .withDepth(parseDouble((String) map.get(SearchCriteria.Oven.DEPTH.toString())))
                    .withHeight(parseDouble((String) map.get(SearchCriteria.Oven.HEIGHT.toString())))
                    .withWidth(parseDouble((String) map.get(SearchCriteria.Oven.WIDTH.toString())))
                    .build();
        }
        return appliance;
    }

    public Appliance refrigeratorBuild(Map<String, Object> map, Criteria criteria) {
        if (Refrigerator.class.getSimpleName().equals(criteria.getGroupSearchName())) {
            appliance = new Refrigerator.RefrigeratorBuilder()
                    .withAvailableQuantity(parseInt((String) map.get(SearchCriteria.Refrigerator.AVAILABLE_QUANTITY.toString())))
                    .withPrice(parseDouble((String) map.get(SearchCriteria.Refrigerator.PRICE.toString())))
                    .withMarkingOfGoods(parseInt((String) map.get(SearchCriteria.Refrigerator.MARKING_OF_GOODS.toString())))
                    .withPowerConsumption(parseInt((String) map.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())))
                    .withFreezerCapacity(parseDouble((String) map.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())))
                    .withOverallCapacity(parseDouble((String) map.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())))
                    .withWeight(parseDouble((String) map.get(SearchCriteria.Refrigerator.WEIGHT.toString())))
                    .withHeight(parseDouble((String) map.get(SearchCriteria.Refrigerator.HEIGHT.toString())))
                    .withWidth(parseDouble((String) map.get(SearchCriteria.Refrigerator.WIDTH.toString())))
                    .build();
        }
        return appliance;
    }

    public Appliance speakersBuild(Map<String, Object> map, Criteria criteria) {
        if (Speakers.class.getSimpleName().equals(criteria.getGroupSearchName())) {
            appliance = new Speakers.SpeakersBuilder()
                    .withAvailableQuantity(parseInt((String) map.get(SearchCriteria.Speakers.AVAILABLE_QUANTITY.toString())))
                    .withPrice(parseDouble((String) map.get(SearchCriteria.Speakers.PRICE.toString())))
                    .withMarkingOfGoods(parseInt((String) map.get(SearchCriteria.Speakers.MARKING_OF_GOODS.toString())))
                    .withPowerConsumption(parseInt((String) map.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())))
                    .withNumberOfSpeakers(parseInt((String) map.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())))
                    .withFrequencyRange(parseDouble((String) map.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())))
                    .withCordLength(parseDouble((String) map.get(SearchCriteria.Speakers.CORD_LENGTH.toString())))
                    .build();
        }
        return appliance;
    }

    public Appliance tabletPCBuild(Map<String, Object> map, Criteria criteria) {
        if (TabletPC.class.getSimpleName().equals(criteria.getGroupSearchName())) {
            appliance = new TabletPC.TabletPCBuilder()
                    .withAvailableQuantity(parseInt((String) map.get(SearchCriteria.TabletPC.AVAILABLE_QUANTITY.toString())))
                    .withPrice(parseDouble((String) map.get(SearchCriteria.TabletPC.PRICE.toString())))
                    .withMarkingOfGoods(parseInt((String) map.get(SearchCriteria.TabletPC.MARKING_OF_GOODS.toString())))
                    .withBatteryCapacity(parseDouble((String) map.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())))
                    .withDisplayInches(parseDouble((String) map.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())))
                    .withMemoryRom(parseInt((String) map.get(SearchCriteria.TabletPC.MEMORY_ROM.toString())))
                    .withFlashMemoryCapacity(parseDouble((String) map.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())))
                    .withColor(((String) map.get(SearchCriteria.TabletPC.COLOR.toString())))
                    .build();
        }
        return appliance;
    }

    public Appliance vacuumCleanerBuild(Map<String, Object> map, Criteria criteria) {
        if (VacuumCleaner.class.getSimpleName().equals(criteria.getGroupSearchName())) {
            appliance = new VacuumCleaner.VacuumCleanerBuilder()
                    .withAvailableQuantity(parseInt((String) map.get(SearchCriteria.VacuumCleaner.AVAILABLE_QUANTITY.toString())))
                    .withPrice(parseDouble((String) map.get(SearchCriteria.VacuumCleaner.PRICE.toString())))
                    .withMarkingOfGoods(parseInt((String) map.get(SearchCriteria.VacuumCleaner.MARKING_OF_GOODS.toString())))
                    .withPowerConsumption(parseInt((String) map.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())))
                    .withFilterType(((String) map.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())))
                    .withBagType(((String) map.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())))
                    .withWandType(((String) map.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())))
                    .withMotorSpeedRegulation(((String) map.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())))
                    .withCleaningWidth(parseDouble((String) map.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())))
                    .build();
        }
        return appliance;
    }
}
