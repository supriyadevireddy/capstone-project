package typesofcollections;

import java.util.Comparator;

public abstract class DescendingOrderComparator implements Comparator<Integer>{
public int Compare(Integer num1, Integer num2) {
	return(num1.compareTo(num2));
}
}
