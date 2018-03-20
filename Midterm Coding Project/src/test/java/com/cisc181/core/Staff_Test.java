package com.cisc181.core;
import com.cisc181.eNums.eTitle;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import org.junit.BeforeClass;
import org.junit.Test;




public class Staff_Test {

	@BeforeClass
	public static void setup() {
	
	}
	
	
	@Test
	public void testAverage() {
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        try {
            staffs.add(new Staff("Alex", "", "Sam",
                    new GregorianCalendar(1980, 2, 3).getTime(), 
                    "Washington", "(333)-232-3456", "Alex@gmail.com", "", 0, 1000.0, 
                    new GregorianCalendar(2001, 9, 5).getTime(), eTitle.MR));
            staffs.add(new Staff("frank", "", "jhon",
                    new GregorianCalendar(1978, 6, 10).getTime(), 
                    "Baltiomre", "(888)-666-7776", "frank@gmail.com", "", 0, 1200.0, 
                    new GregorianCalendar(1997, 9, 8).getTime(), eTitle.MR));
            staffs.add(new Staff("Lora", "", "ashly",
                    new GregorianCalendar(1978, 8, 4).getTime(), 
                    "London", "(545)-654-8765", "Lora@gmail.com", "", 0, 900.0, 
                    new GregorianCalendar(1999, 6, 7).getTime(), eTitle.MRS));
            staffs.add(new Staff("jenefir", "", "frank",
                    new GregorianCalendar(1996, 5, 3).getTime(), 
                    "California", "(456)-456-7896", "jenefir@gmail.com", "", 0, 1300.0, 
                    new GregorianCalendar(1988, 1, 9).getTime(), eTitle.MRS));
            staffs.add(new Staff("Oliver", "", "alexander",
                    new GregorianCalendar(1989, 6, 8).getTime(), 
                    "Los angeleos", "(564)-657-5467", "Oliver@gmail.com", "", 0, 900.0, 
                    new GregorianCalendar(2011, 2, 9).getTime(), eTitle.MR));
        }
        catch (PersonException pe) {
            System.err.println(pe.getMessage());
        }
double average = 0;
        for (Staff staff: staffs) {
            average += staff.getSalary();
        }
        average /= staffs.size();
        
        assertEquals(1000.0, average, 0.0001);
}	
	 @Test(expected = PersonException.class)
		public void testExceptionPhone() throws PersonException{
	                Staff staff = new Staff("Lara", "", "ashly",
	                            new GregorianCalendar(1978, 8, 4).getTime(), 
	                            "London", "(545)-654-8765", "Lora@gmail.com", "", 0, 900.0, 
	                            new GregorianCalendar(1999, 6, 7).getTime(), eTitle.MRS);
	                
		}
	        
	        @Test(expected = PersonException.class)
		public void testExceptionDate() throws PersonException{
	                Staff staff = new Staff("Lora", "", "ashly",
	                            new GregorianCalendar(1996, 8, 5).getTime(), 
	                            "London", "(545)-654-8765", "davidson@gmail.com", "", 0, 900.0, 
	                            new GregorianCalendar(1999, 6, 9).getTime(), eTitle.MRS);
	                
	        }}



