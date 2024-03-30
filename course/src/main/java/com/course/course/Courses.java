package com.course.course;

public class Courses
{
private int id;
private String title;
private String description;
private int validity;


    public Courses() {
        super();
    }

    public Courses(int id, String title, String description, int validity) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.validity = validity;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getValidity() {
        return validity;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }


}
