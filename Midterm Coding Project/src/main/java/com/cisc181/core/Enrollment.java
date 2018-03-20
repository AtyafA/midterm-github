package com.cisc181.core;

import java.util.UUID;
public class Enrollment {
    private UUID EnrollmentID;
    private UUID SectionID;
    private UUID StudentID;
    private double Grade;
    
    private Enrollment() {
        EnrollmentID = UUID.randomUUID();
    }
    
    public Enrollment(UUID SectionId, UUID StudentId) {
        EnrollmentID = UUID.randomUUID();
        SectionID = SectionId;
        StudentID = StudentId;
    }
    
    public UUID getEnrollmentID() {
        return EnrollmentID;
    }
    
    public UUID getStudentID() {
        return StudentID;
    }
    
    public UUID getSectionID() {
        return SectionID;
    }
    
    public double getGrade() {
        return Grade;
    }
    
    public void setGrade(double GRADE) {
        Grade = GRADE;
    }
}