import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class attendanceTest {
	Queue<String> SampleAtendQ = new LinkedList<String>();
	@Test
	public void testIsQueueEmpty() {
		int TotEmp;
		attendance a = new attendance();
		assertEquals(a.isQueueEmpty(),true);
		TotEmp = a.getNumberOfEmp();
		a.queueUsingLinkedList(TotEmp);
		assertEquals(a.isQueueEmpty(),false);
	}

	@Test
	public void testIsQueueFull() {
		int TotEmp;
		attendance a = new attendance();
		assertEquals(a.isQueueFull(SampleAtendQ, 0),true);
		TotEmp = a.getNumberOfEmp();
		System.out.println(TotEmp);
		for(int i=0;i<TotEmp-1;i++){
			SampleAtendQ.add("AnySampleElement");
			assertEquals(a.isQueueFull(SampleAtendQ,TotEmp),false);
		}
		assertEquals(a.isQueueFull(SampleAtendQ,TotEmp-1),true);
		
	}

	@Test
	public void testReturnQueueSize() {
		int i=0, TotEmp;
		attendance a = new attendance();
		TotEmp = a.getNumberOfEmp();
		
		for(i=0;i<TotEmp-1;i++){
			SampleAtendQ.add("AnySampleElement");
			assertEquals(a.returnQueueSize(SampleAtendQ),i+1);
		}
	}

}
