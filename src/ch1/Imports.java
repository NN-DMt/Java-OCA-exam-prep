package ch1;

import java.lang.System;
import java.util.Random;
import java.util.regex.*;
import java.sql.*;
import java.util.*;
// import java.*.*;  # this doesn't work as you can only have 1 * wildcard
// import java.util.regex.Pattern.getPattern; # this doesn't work as you can't import methods
// import java.*.Files # this doesn't work as you can use wildard to match class names


// Imports can use the * if it is at the last section
// You can only use * once in an import
// You cannot import single methods only class names
// without the correct import java will not know where to find a class.
// java.lang.system is imported twice
// if there is a conflict of methods in different packages, you need to be explicit
// about which one you want to use
// The exam will often omit imports for conciseness, make sure to check the line numbers
// if the line numbers on the exam are 1. then check if imports are used, because the answer will be
// that it doesn't compile if it has dependencies that are not imported
// if lines start on line 6 for example, assume the imports are omitted



 
public class Imports {
	public static void main(String... args) {		
		Random r = new Random();
		int randInt = r.hashCode();
		System.out.println("R" + randInt);
		// if there are two date methods you need to explicitly reference one
		java.sql.Date date = new java.sql.Date(1000000L);
		
		// else it won't compile
		// The type Date is ambiguous
		//Date date1 = new Date();
		
	}
}
