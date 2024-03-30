package com.course.course;

import java.util.HashMap;
import java.util.Map;
@org.springframework.stereotype.Repository

public class Repository
{
    Map<Integer,Courses> db = new HashMap<>();// database

    public Courses getinfo(int id)
    {
        return db.get(id);
    }
    public void addcourse(Courses course)
    {
        db.put(course.getId(),course);
    }
    public void removecourse(int id)
    {
        db.remove(id);

    }
}
