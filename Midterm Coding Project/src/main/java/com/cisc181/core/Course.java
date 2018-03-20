package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
    private UUID CourseID;
    private String CourseName;
    private int GradePoints;
    private eMajor Major;
    
    public Course(String Coursename, int Gradepoints, eMajor Major) {
        CourseID = UUID.randomUUID();
        CourseName = Coursename;
        GradePoints = Gradepoints;
        this. Major = Major; 
        
    }
    


	public UUID getCourseID() {
        return CourseID;
    }
    
    public String getCourseName() {
        return CourseName;
    }
    
    public void setCourseName(String Coursename) {
        CourseName = Coursename;
    }
    
    public int getGradePoints() {
        return GradePoints;
    }
    
    public void setGradePoints(int Gradepoints) {
        GradePoints = Gradepoints;
    }

	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor major) {
		Major = major;
	} 
}
