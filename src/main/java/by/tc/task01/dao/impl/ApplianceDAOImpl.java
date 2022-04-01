package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{
	private List<Appliance> appliancesFromDataSource = new ArrayList<>();
	private static final String DATA_SOURCE = "appliances_db.txt";
	private BufferedReader bufferedReader;

	public List<Appliance> receiveAppsFromDataSource() {
		try {
			bufferedReader = new BufferedReader(new FileReader(DATA_SOURCE));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				appliancesFromDataSource.add(line);
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File is not found ", e);
		} catch (IOException e) {
			throw new RuntimeException("Invalid File ", e);
		}
		return appliancesFromDataSource;
	}

	@Override
	public Appliance find(Criteria criteria) {
		List<Appliance> foundAppliances = new ArrayList<Appliance>();
		List<Appliance> foundGroupAppliances = new ArrayList<Appliance>();

		for(Appliance appliance : appliancesFromDataSource) {
			if(appliance.getClass().getSimpleName().
					equals(criteria.getGroupSearchName())) {
				foundGroupAppliances.add(appliance);
			}
		}
		if(foundGroupAppliances.size() == 0) {
			return (Appliance) foundAppliances;


			Map<String, Object> criteriaMap = criteria.getCriteria();
			if(isNullOrEmptyMap(criteriaMap)) {
				return (Appliance) foundGroupAppliances;
			}


















		return null;
	}
	


}


