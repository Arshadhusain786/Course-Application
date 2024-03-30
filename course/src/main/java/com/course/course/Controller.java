package com.course.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller
{
    @Autowired // autowired helps you to use the bean of IOC container

    service ser;// creating one object without new keyword


    @GetMapping("/get_info")
    Courses getCourse(@RequestParam("q") int id)
    {
       return ser.get_info(id); // interacting or calling method get_info of service layer
    }
    @PostMapping("/add")
    String addcourse(@RequestBody() Courses course)
    {
        ser.add_course(course);

        return "course added successfully";
    }
    @DeleteMapping("/delete/{q}")
    String deleteCourse( @PathVariable("q") int id)
    {
        ser.remove_course(id);

        return "course deleted successfully";
    }

}
