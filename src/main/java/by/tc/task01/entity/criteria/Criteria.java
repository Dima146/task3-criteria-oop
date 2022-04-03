package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<String, Object>getCriteria(){
		return criteria;
	}

	public boolean compareTwoMaps(Map<String,Object> comparedMap) {
		boolean result = false;
		for (Map.Entry<String, Object> criteriaElement : criteria.entrySet()) {
			for (Map.Entry<String, Object> comparedMapElement : comparedMap.entrySet()) {
				result =  ((criteriaElement.getKey().equals(comparedMapElement.getKey()))
						&& criteriaElement.getValue().toString().equalsIgnoreCase(String.valueOf(comparedMapElement.getValue())));

				}
			}
		return result;
	}

}

