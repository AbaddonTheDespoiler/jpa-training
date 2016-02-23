package be.itflex.service.dto;

/**
 * Created by abaddon on 2/23/16.
 */
public class StudentDto {

    private int studentId;
    private String firstname;
    private String lastname;
    private int yearLevel;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    @Override
    public String toString() {
        return com.google.common.base.Objects.toStringHelper(this)
                .add("studentId", studentId)
                .add("firstname", firstname)
                .add("lastname", lastname)
                .add("yearLevel", yearLevel)
                .toString();
    }
}
