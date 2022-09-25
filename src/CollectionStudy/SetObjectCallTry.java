package CollectionStudy;
import java.util.*;
import java.util.stream.Collector;

public class SetObjectCallTry {
	public static void main(String[] args) {
		Set<Student> studentcreate = new HashSet<>();
		studentcreate.add(new Student("hari", 10));
		studentcreate.add(new Student("AgaiSet", 1));
		
		//sort with class
		List<Student> studentcreatelist = new LinkedList<>();
		studentcreatelist.add(new Student("hari", 10));
		studentcreatelist.add(new Student("Agai", 1));
		studentcreatelist.add(new Student("gowri", 8));
		studentcreatelist.add(new Student("naruto", 9));
		
		Collections.sort(studentcreatelist);
		System.out.println(studentcreatelist);
		
		//sort in this script itself
		Collections.sort(studentcreatelist, (obj1,obj2) -> obj1.student.compareTo(obj2.student));
		System.out.println(studentcreatelist);
		
		List<Integer> arrold = Arrays.asList(1,2,3,4,5);
		List<Boolean> arr = new ArrayList<>();
		arrold.stream().filter(n -> (n & 1)== 0).forEach(System.out::println);
		System.out.println(arr);
		System.out.println(studentcreate);
		arrold.stream().sorted((o1, o2) -> o1%o2 ).forEach(System.out::print);
		
		// checking the whether 2 sets are equal or not!!
		System.out.println(arrold.equals(arr));
		
		//map
		Map<String, Integer> arrmap = new TreeMap<>();
		arrmap.put("One", 1);
		arrmap.put("Two", 2);
		arrmap.put("five", 5);
		
		for(Map.Entry<String, Integer> e  : arrmap.entrySet()) {
			System.out.print(e.getValue()+ " ");
		}
		System.out.println();
		
		for(String e : arrmap.keySet())
			System.out.print(arrmap.get(e));
	
		System.out.println();
		
		//MaxHeap
		Queue<Integer> arrprior  = new PriorityQueue<>(Collections.reverseOrder());
		arrprior.offer(2);
		arrprior.offer(12);
		arrprior.offer(32);
		arrprior.offer(24);
		arrprior.offer(25);
		
		System.out.print( arrprior);
		
		//MinHeap
		Queue<Integer> arrpriormin  = new PriorityQueue<>();
		arrpriormin.offer(2);
		arrpriormin.offer(12);
		arrpriormin.offer(32);
		arrpriormin.offer(24);
		arrpriormin.offer(25);
		
		System.out.print( arrpriormin);
		
		//Array functions
		int [] arraray = {2,1};
		Arrays.sort(arraray);
//		Arrays.fill(arraray, 23);
		System.out.println(arraray);
	}

}
