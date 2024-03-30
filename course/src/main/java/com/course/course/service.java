package com.course.course;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class service
{
    @Autowired // autowired helps to create one object of layers(controller,service,repository)
    Repository repo; // creating one object for all database ..
    // no need to use new keyword
public Courses get_info(int id)
{
    return repo.getinfo(id); // calling or interacting method getinfo of repository layer
}
public void add_course(Courses course)
{
    repo.addcourse(course); // calling or interacting method addcourse of repository layer
}
public void remove_course(int id)
{
    repo.removecourse(id);
}
}
