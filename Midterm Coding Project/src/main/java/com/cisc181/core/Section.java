package com.cisc181.core;

import java.util.UUID;
public class Section {
    private UUID SectionID;
    private UUID CourseID;
    private UUID SemesterID;
    private int RoomID;
    
    public Section(UUID CourseId, UUID SemesterId, int RoomId) {
        SectionID = UUID.randomUUID();
        CourseID = CourseId;
        SemesterID = SemesterId;
        RoomID = RoomId;
    }
    
    public UUID getSectionID() {
        return SectionID;
    }
    
    public UUID getCourseID() {
        return CourseID;
    }
    
    public UUID getSemesterID() {
        return SemesterID;
    }
    
    public int getRoomID() {
        return RoomID;
    }
    
}
