package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public final class PrintApplianceInfo {

	private PrintApplianceInfo() {
	}
	public static void print(List<Appliance> appliances) {
		if (!appliances.isEmpty()) {
			for (Appliance appliance : appliances) {
				System.out.println(appliance.toString() + "\n");
			}
		} else System.out.print("Appliance is not found ");
		}
	}

