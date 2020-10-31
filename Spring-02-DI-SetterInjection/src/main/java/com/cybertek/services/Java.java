package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    private OfficeHours officeHours;

    /*public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    */

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20+officeHours.getHours()));
    }
}
