package com.code;

import java.util.*;

public class Gift {
LinkedList <Sweets> sweets ;
	
	Gift(LinkedList<Sweets> sweets){
		this.sweets=sweets;
	}
	
	public Integer sumofWeights() {
		Integer sum = 0;
		for(Sweets s:sweets) {
			sum+=s.weight;
		}
		return sum;
	}
	
	public void sortChocolates(String sortKey) {
		if(sortKey.compareTo("name") == 0) {
			Collections.sort(sweets,new SortByName());
		}
		
		else if(sortKey.compareTo("cost") == 0) {
			
			Collections.sort(sweets,new SortByName());
		}
		else {
			Collections.sort(sweets,new SortByWeight());

		}
	}
}
