package HomeWork23;

import java.util.Comparator;

public class CommodityNameComparator_14_2 implements Comparator<Commodity_14_2>{

	@Override
	public int compare(Commodity_14_2 o1, Commodity_14_2 o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
