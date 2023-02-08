package com.alt.MockitoProject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
/**import for mockito-core 1.9.5*/
//import org.mockito.runners.MockitoJUnitRunner;

/**import for mockito-core 5.1.1*/
import org.mockito.junit.MockitoJUnitRunner;

import com.alt.repositories.Repository01;
import com.alt.services.Service01;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {
	
	@InjectMocks
	private Service01 service01;
	
	@Mock
	private Repository01 repository01;
	
	@Test
	public void testService01() {
		when(repository01.getMyNumber()).thenReturn(4);
		assertEquals(24, service01.methodToBeTested());
	}

}
