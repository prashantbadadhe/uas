package com.uas.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Course.
 */
@Entity
@Table(name = "course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "course_code", nullable = false)
    private String courseCode;

    @Column(name = "course_name")
    private String courseName;

    @ManyToMany(mappedBy = "courses")
    @JsonIgnore
    private Set<Student> studentIds = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Course courseCode(String courseCode) {
        this.courseCode = courseCode;
        return this;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Course courseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Student> getStudentIds() {
        return studentIds;
    }

    public Course studentIds(Set<Student> students) {
        this.studentIds = students;
        return this;
    }

    public Course addStudentId(Student student) {
        this.studentIds.add(student);
        student.getCourses().add(this);
        return this;
    }

    public Course removeStudentId(Student student) {
        this.studentIds.remove(student);
        student.getCourses().remove(this);
        return this;
    }

    public void setStudentIds(Set<Student> students) {
        this.studentIds = students;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Course)) {
            return false;
        }
        return id != null && id.equals(((Course) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Course{" +
            "id=" + getId() +
            ", courseCode='" + getCourseCode() + "'" +
            ", courseName='" + getCourseName() + "'" +
            "}";
    }
}
