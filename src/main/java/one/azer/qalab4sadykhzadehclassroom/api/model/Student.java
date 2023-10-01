package one.azer.qalab4sadykhzadehclassroom.api.model;

public class Student {

    private int id;
    private String name;
    private String surname;
    private String email;
    private String faculty;
    private String group;
    private int year;
    private double gpa;

    public Student(int id, String name, String surname, String email, String faculty, String group, int year, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.faculty = faculty;
        this.group = group;
        this.year = year;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    public int getYear() {
        return year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public void setSurname(String surname) {
        if (!surname.isEmpty()) {
            this.surname = surname;
        }
    }

    public void setEmail(String email) {
        if (!email.isEmpty()) {
            this.email = email;
        }
    }

    public void setFaculty(String faculty) {
        if (!faculty.isEmpty()) {
            this.faculty = faculty;
        }
    }

    public void setGroup(String group) {
        if (!group.isEmpty()) {
            this.group = group;
        }
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    public void setGpa(double gpa) {
        if (gpa > 0) {
            this.gpa = gpa;
        }
    }


}
