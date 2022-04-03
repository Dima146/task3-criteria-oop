package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.AppliancesBuilder;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO {
	private AppliancesBuilder appliancesBuilder;
	private static final String DATA_SOURCE = "appliances_db.txt";
	private BufferedReader bufferedReader;
	private FileReader fileReader;

	@Override
	public List<Appliance> find(Criteria criteria) {
		List<Appliance> appliances = new ArrayList<>();
		HashMap<String, Object> appsFromDataSource = receiveAppliancesFromDataSource(criteria);

		if (!(appsFromDataSource.isEmpty() && criteria.compareTwoMaps(appsFromDataSource))) {
			createAppliance(criteria, appsFromDataSource, appliances);
		}
		return appliances;
	}

	private HashMap<String, Object> receiveAppliancesFromDataSource(Criteria criteria) {
		HashMap<String, Object> appsFromFile = new HashMap<>();

		try {
			fileReader = new FileReader(DATA_SOURCE);
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while (bufferedReader.ready()) {
				line = bufferedReader.readLine();
				String applianceName = line.contains(" ") ? line.split(" ")[0] : line;
				if (criteria.getClass().getSimpleName().equals(applianceName)) {
					String[] attributes = line.replaceAll("[^A-Za-z0-9]", " ").split(" ");
					for (int i = 1; i < attributes.length; i += 2) {
						appsFromFile.put(applianceName, attributes[i + 1]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File is not found", e);
		} catch (IOException e) {
			throw new RuntimeException("Invalid File", e);
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				throw new RuntimeException("It is impossible to close Reader");

			}
		}
		return appsFromFile;
	}

	private List<Appliance> createAppliance(Criteria criteria, HashMap<String, Object> appsFromData,
											List<Appliance> appliances) {
		appliancesBuilder = new AppliancesBuilder();

		appliances.add(appliancesBuilder.laptopBuild(appsFromData, criteria));
		appliances.add(appliancesBuilder.ovenBuild(appsFromData, criteria));
		appliances.add(appliancesBuilder.refrigeratorBuild(appsFromData, criteria));
		appliances.add(appliancesBuilder.speakersBuild(appsFromData, criteria));
		appliances.add(appliancesBuilder.tabletPCBuild(appsFromData, criteria));
		appliances.add(appliancesBuilder.vacuumCleanerBuild(appsFromData, criteria));

		return appliances;
	}
}
