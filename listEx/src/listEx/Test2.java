package listEx;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<ExamResult> list = new ArrayList<>();

		list.add(new ExamResult("A", 45, 40, 40));
		list.add(new ExamResult("B", 50, 40, 40));
		list.add(new ExamResult("C", 46, 40, 40));
		list.add(new ExamResult("D", 70, 40, 40));
		list.add(new ExamResult("E", 85, 40, 40));
		list.add(new ExamResult("F", 75, 40, 40));

//		Collections.sort(list);
		
		ExamResult target = new ExamResult("TARGET",49,40,40); 
		
		Collections.sort(list, new Comparator<ExamResult>() {

			@Override
			public int compare(ExamResult o1, ExamResult o2) {
				System.out.println(o1);
				System.out.println(o2);
				System.out.println("------------------------------------------------");
				return 0;
			}
		});

		System.out.println(list);
	}
}
