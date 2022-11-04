package in.ashokit.component;

import static org.hamcrest.CoreMatchers.any;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import in.ashokit.bo.Employee;

@SpringBootTest
public class Component1Test {
	@MockBean
	private Component1 component1;
	
	private Employee employee;
	
	@BeforeEach
	public void setup() {
		employee=new Employee("Abhay");
	}

	@Test
	public void testComplete() {
		doNothing().when(component1).complete(anyString(), anyInt());

		component1.complete("test", 1);

		verify(component1, times(1)).complete("test", 1);

	}

	@Test
	public void testCompleteWithObject() {
		doNothing().when(component1).completeWithObject(anyString(), eq(employee));
		component1.completeWithObject("del", employee);
		verify(component1,times(1)).completeWithObject("del", employee);
	}
	
	@Test
	public void testComplete2(){
		doCallRealMethod().when(component1).complete(anyString(), anyInt());
		component1.complete("test", 1);
		verify(component1, times(1)).complete("test", 1);
	
	}
	@Test
	public void testCompleteWithObject2() {
		doCallRealMethod().when(component1).completeWithObject(anyString(), eq(employee));
		component1.completeWithObject("del", employee);
		verify(component1,times(1)).completeWithObject("del", employee);
		component1.completeWithObject("print", employee);
		verify(component1,times(1)).completeWithObject("print", employee);
		
	}

}
