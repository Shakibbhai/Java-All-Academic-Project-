package comprator_java;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


public class comparemain {
	public static void main(String []args) {
		List<Student> s1=new ArrayList<Student>();
		s1.add(new Student("shakib",29,2));
		s1.add(new Student("rakin",21,2));
		s1.add(new Student("shakad",23,1));
		
		Comparator<Student> a=Comparator.comparing(Student::getRoll).thenComparing(Student::getAge);
		Collections.sort(s1,a);
		for(Student s2:s1) {
			System.out.println("name:"+s2.getName()+" "+"age:"+s2.getAge()+" "+"roll:"+s2.getRoll());
		}
		Comparator<Student> b=Comparator.comparing(Student::getName);
		Collections.sort(s1,b);
		for(Student s3:s1) {
			System.out.println("name:"+s3.getName()+" "+"age:"+s3.getAge()+" "+"roll:"+s3.getRoll());
		}
		
		
	}

}
