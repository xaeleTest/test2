package scott;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List ttList = new ArrayList<>();
	ttList.add("1334");
	ttList.add("2545");
	
	for (Object object : ttList) {
		System.out.println(object.toString());
	}
}
}
