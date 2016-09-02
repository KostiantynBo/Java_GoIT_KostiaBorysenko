package module03.Task033;

import java.util.Date;

public class Course {

    private int hoursDuration;
    private String teacherName;
    private Date startDate;
    private String name;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }
    public Course(int hoursDuration, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
