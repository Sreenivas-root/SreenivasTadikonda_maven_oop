package com.code;

import java.util.Comparator;
public class SortByName implements Comparator<Sweets> {
	public int compare(Sweets o1, Sweets o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
