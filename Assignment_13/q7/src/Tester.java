package Q7;

import java.util.LinkedHashMap;
import java.util.Map;

public class Tester {

	public static void main(String[] args) {
		Map<Integer, Student> map = new LinkedHashMap<Integer, Student>();
		Student s1 = new Student(11,"Amar",99);
		Student s2 = new Student(12,"Amar",99);
		Student s3 = new Student(13,"Amar",99);
		Student s4 = new Student(14,"Amar",99);
		Student s5 = new Student(15,"Amar",99);
		map.put(11, s1);
		map.put(12, s2);
		map.put(13, s3);
		map.put(14, s4);
		map.put(15, s5);
		int rol = 12;
		Student ref = map.get(rol);
		System.out.println(ref);
		
	}

}
