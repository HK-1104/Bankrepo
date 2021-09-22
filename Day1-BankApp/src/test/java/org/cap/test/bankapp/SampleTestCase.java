package org.cap.test.bankapp;

import static org.junit.Assert.*;

import org.cap.dto.Account;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SampleTestCase {

	@Category(ReportCategory.class)
	@Test
	public void test() {
		Account account=new Account();
		assertNotNull(account);
		
	}

}
