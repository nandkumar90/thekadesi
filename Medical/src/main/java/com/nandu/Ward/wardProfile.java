package com.nandu.Ward;

import java.util.ArrayList;
import java.util.List;

public class wardProfile {
	public enum ward_type {
		class1, class2, class3
	};

	private List<String> ward_amenities = new ArrayList<String>();
	private String ward_id;
	boolean isVacant = false;
	private int floor_id;

}
