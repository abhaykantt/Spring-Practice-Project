package in.ashokit.component;

import org.springframework.stereotype.Component;

import in.ashokit.bo.Employee;

@Component
public class Component1 {
    public void complete(String s,Integer i) {
    	System.out.println(s+"\t"+i);
    }
    
    public void completeWithObject(String operation,Employee employee) {
    	if (operation.equalsIgnoreCase("print")) {
			System.out.println("Employee Name  Abhay :"+employee.getName());
		}
    	if (operation.equalsIgnoreCase("del")) {
			System.out.println("Employee Deleted");
		}
    }
}
