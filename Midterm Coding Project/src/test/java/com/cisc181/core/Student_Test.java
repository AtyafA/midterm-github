package com.cisc181.core;

import com.cisc181.eNums.eMajor;
import java.text.ParseException;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;


public class Student_Test {
   
	static ArrayList<Course> courses;
    static ArrayList<Semester> semesters;
    static ArrayList<Section> sections;
    static ArrayList<Student> students;
    static ArrayList<Enrollment> enrollments;
    
	@BeforeClass
	public static void setup() { courses = new ArrayList<Course>();
   
	Course maths = new Course("Mathematics",100, null);
    Course Chemistry = new Course("Chemistry",100, null);
    Course Cisc = new Course("Cisc",100, null);
    
    semesters = new ArrayList<Semester>();
    Semester fall = new Semester(new GregorianCalendar(2017, 8, 1).getTime(), 
                                 new GregorianCalendar(2018, 1, 8).getTime());
    Semester spring = new Semester(new GregorianCalendar(2017, 9, 18).getTime(), 
                                 new GregorianCalendar(2018, 8, 37).getTime());
    
    sections = new ArrayList<Section>();
    
    courses.add(maths);
    courses.add(Chemistry);
    courses.add(Cisc);
    semesters.add(fall);
    semesters.add(spring);
    
    Section mathFall = new Section(maths.getCourseID(), fall.getSemesterID(), 111);
    Section mathSpring = new Section(maths.getCourseID(), spring.getSemesterID(), 112);
    Section chemistryFall = new Section(Chemistry.getCourseID(), fall.getSemesterID(), 211);
    Section chemistrySpring = new Section(Chemistry.getCourseID(), spring.getSemesterID(), 212);
    Section CiscFall = new Section(Cisc.getCourseID(), fall.getSemesterID(), 311);
    Section CiscSpring = new Section(Cisc.getCourseID(), spring.getSemesterID(), 312);
    
    sections.add(mathFall);
    sections.add(mathSpring);
    sections.add(chemistryFall);
    sections.add(chemistrySpring);
    sections.add(CiscFall);
    sections.add(CiscSpring);
    
    students = new ArrayList<Student>();
    enrollments = new ArrayList<Enrollment>();
    
    Student s;
    Enrollment e;
    try {
        s = new Student("Alex", "", "Jhon", new GregorianCalendar(1996, 3, 22).getTime(),
                                eMajor.CHEM, "Delaware", "(222)-333-4444", "Alex@gmail.com");
        students.add(s);
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(98);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(89);
        enrollments.add(e);
        
        e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
        e.setGrade(74);
        enrollments.add(e);
        
        e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
        e.setGrade(70);
        enrollments.add(e);
        
        
        s = new Student("frank", "", "jacob", new GregorianCalendar(1996, 4, 27).getTime(),
                                eMajor.COMPSI, "Delaware", "(555)-555-5555", "frank@gmail.com");
        students.add(s);
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(90);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(100);
        enrollments.add(e);
        
        e = new Enrollment(CiscFall.getSectionID(), s.getStudentID());
        e.setGrade(60);
        enrollments.add(e);
        
        e = new Enrollment(CiscSpring.getSectionID(), s.getStudentID());
        e.setGrade(80);
        enrollments.add(e);
        
        s = new Student("Sara", "", "Harold", new GregorianCalendar(1996, 4, 3).getTime(),
                                eMajor.BUSINESS, "New York", "(444)-444-4444", "Sara@gmail.com");
        students.add(s);
        e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
        e.setGrade(90);
        enrollments.add(e);
        
        e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
        e.setGrade(80);
        enrollments.add(e);
        
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(70);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(76);
        enrollments.add(e);
        
        
        s = new Student("Dived", "", "Edward", new GregorianCalendar(1996, 7, 21).getTime(),
                                eMajor.CHEM, "Delaware", "(666)-666-6666", "daived@gmail.com");
        students.add(s);
        e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
        e.setGrade(97);
        enrollments.add(e);
        
        e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
        e.setGrade(87);
        enrollments.add(e);
        
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(100);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(65);
        enrollments.add(e);
        
        s = new Student("Lora", "", "ashley", new GregorianCalendar(1996, 5, 24).getTime(),
                                eMajor.BUSINESS, "Delaware", "(999)-999-9999", "Lora@gmail.com");
        students.add(s);
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(80);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(100);
        enrollments.add(e);
        
        e = new Enrollment(CiscFall.getSectionID(), s.getStudentID());
        e.setGrade(70);
        enrollments.add(e);
        
        e = new Enrollment(CiscSpring.getSectionID(), s.getStudentID());
        e.setGrade(80);
        enrollments.add(e);
        
        s = new Student("Mary", "", "Oliver", new GregorianCalendar(1997, 5, 24).getTime(),
                                eMajor.NURSING, "New York", "(555)-666-1212", "Mary@gmail.com");
        students.add(s);
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(40);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(70);
        enrollments.add(e);
        
        e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
        e.setGrade(80);
        enrollments.add(e);
        
        e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
        e.setGrade(60);
        enrollments.add(e);
        
        s = new Student("Liza", "", "ALexander", new GregorianCalendar(1996, 8, 25).getTime(),
                                eMajor.NURSING, "New York", "(777)-777-6666", "Liza@gmail.com");
        students.add(s);
        e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
        e.setGrade(90);
        enrollments.add(e);
        
        e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
        e.setGrade(90);
        enrollments.add(e);
        
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(80);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(100);
        enrollments.add(e);
        
        s = new Student("Smith", "", "Hary", new GregorianCalendar(1995, 8, 23).getTime(),
                                eMajor.NURSING, "Delaware", "(767)-444-9898", "smith@gmail.com");
        students.add(s);
        e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
        e.setGrade(80);
        enrollments.add(e);
        
        e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
        e.setGrade(90);
        enrollments.add(e);
        
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(90);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(100);
        enrollments.add(e);
        
        
        s = new Student("Alexa", "", "lary", new GregorianCalendar(1996, 9, 22).getTime(),
                                eMajor.PHYSICS, "Delaware", "(101)-101-1001", "Alexa@gmail.com");
        students.add(s);
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(90);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(85);
        enrollments.add(e);
        
        e = new Enrollment(CiscFall.getSectionID(), s.getStudentID());
        e.setGrade(100);
        enrollments.add(e);
        
        e = new Enrollment(CiscSpring.getSectionID(), s.getStudentID());
        e.setGrade(90);
        enrollments.add(e);
        
        s = new Student("Janet", "", "Jack", new GregorianCalendar(1995, 1, 23).getTime(),
                                eMajor.NURSING, "Delaware", "(111)-111-2121", "Janet@gmail.com");
        students.add(s);
        e = new Enrollment(mathFall.getSectionID(), s.getStudentID());
        e.setGrade(56);
        enrollments.add(e);
        
        e = new Enrollment(mathSpring.getSectionID(), s.getStudentID());
        e.setGrade(87);
        enrollments.add(e);
        
        e = new Enrollment(chemistryFall.getSectionID(), s.getStudentID());
        e.setGrade(98);
        enrollments.add(e);
        
        e = new Enrollment(chemistrySpring.getSectionID(), s.getStudentID());
        e.setGrade(0);
        enrollments.add(e);
    }
    catch (PersonException pe) {
        System.err.println(pe.getMessage());
    }
}

@Test
public void testGPACourse() {
for (Course c : courses) {
            UUID uuid = c.getCourseID();
            double average = 0;
            int count = 0;
            for (Section s : sections) {
                if (s.getCourseID() == uuid) {
                    UUID suuid = s.getSectionID();
                    for (Enrollment e : enrollments) {
                        if (e.getSectionID() == suuid) {
                            average += e.getGrade();
                            count++;
                        }
                    }
                }
            }
            average /= count;
            switch (c.getCourseName()) {
                case "Maths":
                    assertEquals(90.25, average, 0.001);
                    break;
                case "Chemistry":
                    assertEquals(80.125, average, 0.001);
                    break;
                case "Cisc":
                    assertEquals(80.5, average, 0.001);
                    break;
            }
        }
}


	@Test
	public void testGPAstudent() {
        for (Student s : students) {
            double average = 0;
            int count = 0;
            UUID uuid = s.getStudentID();
            for (Enrollment e : enrollments) {
                if (e.getStudentID() == uuid) {
                    average += e.getGrade();
                    count++;
                }
            }
            
            average /= count;
            
            switch (s.getFirstName()) {
                case "Alex":
                    assertEquals(90, average, 0.001);
                    break;
                case "Frank":
                    assertEquals(92, average, 0.001);
                    break;
                case "Sara":
                    assertEquals(86.5, average, 0.001);
                    break;
                case "Davied":
                    assertEquals(84, average, 0.001);
                    break;
                case "Lora":
                    assertEquals(85, average, 0.001);
                    break;
                case "Mary":
                    assertEquals(79, average, 0.001);
                    break;
                    
                case "Liza":
                    assertEquals(96, average, 0.001);
                    break;
                    
                case "Smith":
                    assertEquals(85, average, 0.001);
                    break;
                    
                case "Alexa":
                    assertEquals(88.5, average, 0.001);
                    break;
                case "Janet":
                    assertEquals(81, average, 0.001);
                    break;
            }
        }
	}}
