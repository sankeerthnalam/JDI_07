package com.flipkart.service;

import com.flipkart.bean.Course;
import com.flipkart.bean.Student;

/**
 * Student business interface
 */
public interface StudentInterface {
	
	void viewCourseCatalog();
	
	void chooseCourse(Student student, int courseId);
	
	void dropCourse(Student student,int courseId);
	
	void  viewRegisteredCourse(Student student);
	
	void viewGrades(Student student);
	
	int calculateFees(Student student);

	void makePayment(Student student, int paymentMethod, int fees);
}