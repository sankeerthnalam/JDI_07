package com.flipkart.dao;

import java.util.ArrayList;

import com.flipkart.bean.Course;

public interface CatalogDAOInterface {
	
	/**
	 * to see the list of courses in the catalog 
	 * @return an Arraylist containing list of courses in the catalog
	 */
	public ArrayList<Course> viewCoursesCatalog();

	
	
	/**
	 * method used to see the course details
	 * @return the course having its identifier as courseId
	 * @param courseId unique course identifier 
	 */
	public Course viewCourseDetails(int courseId);
	
	/**
     * To check whether a course is offered or not
     *
     * @param courseId unique course identifier
     * @return whether a course is offered or not
     */
    boolean checkCourseOffered(int courseId);
    
    /**
     * To fetch the courses offered from the course catalog DB
     *
     * @return offered courses from the catalog
     */
    ArrayList<Course> viewCoursesOffered();
}
