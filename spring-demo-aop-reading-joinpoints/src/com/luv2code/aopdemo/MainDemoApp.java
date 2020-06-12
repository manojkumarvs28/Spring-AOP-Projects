package com.luv2code.aopdemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.ColumnMapRowMapper;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {
	
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		//AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		//accountDAO.addAccount();
		//accountDAO.setName("Manoj");
		//accountDAO.getName();
		//accountDAO.setServiceCode("serviceCode");
		//accountDAO.getServiceCode();
		//context.close();
		
		String s3 = "InterVal_types,,INTERVAL_DAY:interval_dts:true:Null :years-months,TEXTFIELD:varchar:false:'Manoj':50,"
				+ "INTERVALYEAR:interval_ytm:true::days-seconds";
		
		String s2 = "InterVal_types,,INTERVAL_DAY:interval_dts:true:Null :years-months,INTERVALYEAR:interval_ytm:true::days-seconds,"
				+ "TEXTFIELD:varchar:false:'Manoj':50";
		String s1 = "InterVal_types,,INTERVAL_DAY:interval_dts:true:Null :years-months,INTERVALYEAR:interval_ytm:true::days-seconds,"
				+ "TEXTFIELD:varchar:false:'Manoj':50";
		
		
		System.out.println((s1.split(",,")[1]).split(","));
		System.out.println((s3.split(",,")[1]).split(","));
		
//		String[] str1 = {"INTERVAL_DAY:interval_dts:true:Null :years-months",
//                "TEXTFIELD:varchar:false:'Manoj':50",
//                "INTERVALYEAR:interval_ytm:true::days-seconds"
//};
//
//		String[] str2 = {"INTERVAL_DAY:interval_dts:true:Null :years-months",
//		                 "INTERVALYEAR:interval_ytm:true::days-seconds",
//		                "TEXTFIELD:varchar:false:'Manoj':50"                 
//		};
		
		String[] str1 = (s1.split(",,")[1]).split(",");
		String[] str2 = (s3.split(",,")[1]).split(",");
		Arrays.sort(str1);Arrays.sort(str2);
		System.out.println(Arrays.equals(str1, str2));
		
		//System.out.println(Arrays.equals(Arrays.sort(str1), Arrays.sort(str2));
		
		
	}

	private static void compare(Stream<String> stream1, Stream<String> stream2) {
		
	
		
	}

}
