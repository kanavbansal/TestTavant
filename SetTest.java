import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<String> setA = new HashSet<String>();
		Set<String> setB = new HashSet<String>();
		
		setA.add("A");
		setA.add("B");
		setA.add("C");
		setA.add("");
		System.out.println("Set size : "+setA.size());
		
		setB.add("B");
		setB.add("A");
		setB.add("D");
		setB.add("C");
		
		if(setA.containsAll(setB) && setB.contains(setA)){
			System.out.println("Same");
		}else{
			System.out.println("Different");
		}
		
		
		
		/*

		String mlbEvent = "321212";
		String tickPartEvent = "1456";
		String eventType = "Parking";
		
		Set<String> eventsSet = new HashSet<String>();
		
		if(eventsSet.contains(mlbEvent+"-"+tickPartEvent+"-"+eventType)){
			System.out.println("Already present");
		}else{
			System.out.println("New entry");
			eventsSet.add(mlbEvent+"-"+tickPartEvent+"-"+eventType);
		}
		
		System.out.println(eventsSet);
		
		if(eventsSet.contains(mlbEvent+"-"+tickPartEvent+"-"+eventType)){
			System.out.println("Already present");
		}else{
			System.out.println("New entry");
			eventsSet.add(mlbEvent+"-"+tickPartEvent+"-"+eventType);
		}
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("Kanav");
		set.add(null);
		set.add("bansal");
		set.add(null);
		set.add("bansal");
		
		System.out.println("set : "+set);
		
		for(String val : set){
			System.out.println(val);
		}
		Set<String> deleteSet = new HashSet<String>();
		deleteSet.add("bansal");
		if(set.contains("bansal")){
			set.remove(deleteSet);	
		}
		if(set.size() == 0){
			System.out.println("hii");
		}
		System.out.println(set);
		
		Float price = 2.0f;
		System.out.println(price.toString().indexOf("."));
		if(price.toString().indexOf("-") != -1){
			System.out.println("price is negative");
		}
		
		Set<Long> setLong=  new HashSet<Long>();
		setLong.add(Long.valueOf("11"));
		setLong.add(Long.valueOf("22"));
		setLong.add(Long.valueOf("33"));
		setLong.add(Long.valueOf("44"));
		
		System.out.println("setLong : "+setLong);
		
		
		Set<EmployeeK> employeeSet = new HashSet<EmployeeK>();
		EmployeeK e1 = new EmployeeK();
		e1.setId(1L);
		e1.setName("Kanav");
		EmployeeK e2 = new EmployeeK();
		e2.setId(2L);
		e2.setName("Sumit");
		
		employeeSet.add(e1);
		employeeSet.add(e2);
		System.out.println("employee Set : "+employeeSet);

		e1.setName("Bansal");
		
		for(EmployeeK emp : employeeSet){
			if(emp.getId() == 1){
				employeeSet.remove(emp);
			}
		}

	*/}

}


class EmployeeK{
	private Long id;
	private String name;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
