package listEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Test1 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		IntStream.range(0, 10).forEach(i -> list.add("V:"+i));
		
		Collections.shuffle(list);
		
		System.out.println(list.subList(0, 6));
		
		
	}

}

