package com.caglacakir.starter;

import com.caglacakir.dto.DtoEmployee;
import com.caglacakir.service.IEmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {ExceptionManagementStarter.class}) //Uygulamayı çalıştıran sınıfı verıyoruz
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach
	public void beforeEach() { //Test metodundan önce çalışır
		System.out.println("Before each çalıştı...");

	}

	@Test // Test metodu
	public void testFindEmployeeById() {

		DtoEmployee employee = employeeService.findEmployeeById(4L);
		assertNotNull(employee);
		//assertEquals(4, employee.getId());
		//assertEquals(4, 6); // 4 gönderdim 6 geldi. hata verır
		//assertNotNull(5);
		//if(employee != null) {
			//System.out.println("İsim : "+ employee.getName());
		}
	@AfterEach // Test metodundan sonra çalışır
	public void afterEach() {
		 	System.out.println("After each çalıştı..");
		}

	}
//}
