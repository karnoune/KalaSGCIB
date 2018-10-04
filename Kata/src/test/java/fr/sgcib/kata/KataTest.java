package fr.sgcib.kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class KataTest {

	@Test
	public void printKataTest(){
		
		Kata kt = new Kata();
		
		//print FooFoo
		String valFoo = kt.doKata(3);
		assertEquals(valFoo,"FooFoo");
		
		//print BarBar
		String valBar = kt.doKata(5);
		assertEquals(valBar,"BarBar");
		
		//print Qix
		String valQix = kt.doKata(7);
		assertEquals(valQix,"Qix");
		
		//13 contains 3 so we print Foo
		String val = kt.doKata(13);
		assertEquals(val,"Foo");
		
		//15 is divisible by 3 and 5 and contains 5 then we print 
		String val1 = kt.doKata(15);
		assertEquals(val1,"FooBarBar");
		
		//33 contains 3 two times and is divisible by 3 so we print FooFooFoo
		String val3 = kt.doKata(33);
		assertEquals(val3,"FooFooFoo");
		
		// 27 is divisible by 3 and 7 so we print FooQix
		String val2 = kt.doKata(27);
		assertEquals(val2,"FooQix");
				
		String val4 = kt.doKata(51);
		assertEquals(val4,"FooBar");
		
		String val5 = kt.doKata(53);
		assertEquals(val5,"BarFoo");
	}
}
