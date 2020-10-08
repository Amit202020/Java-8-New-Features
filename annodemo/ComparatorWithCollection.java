package comp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorWithCollection {

	public static void main(String args[]) {

		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "srinibus", new BigDecimal(100)));
		empList.add(new Emp(2, "nikhil", new BigDecimal(200)));
		empList.add(new Emp(3, "paro", new BigDecimal(50)));
		empList.add(new Emp(4, "navin", new BigDecimal(150)));
		empList.add(new Emp(5, "sunil", new BigDecimal(70)));

		System.out.println("BEFORE SORTING:" + empList);

//		Comparator<Emp> cm = new Comparator<Emp>() {
//			public int compare(Emp e1, Emp e2) {
//				return e1.getMarks().compareTo(e2.getMarks());
//			}
//		};
//
//		Collections.sort(empList, cm);
//		System.out.println("AFTER SORTING:" + empList);
                
        Collections.sort(empList, ( e1, e2) ->   e1.getMarks().compareTo(e2.getMarks()));
		System.out.println("AFTER SORTING:"+empList);

	}
}
