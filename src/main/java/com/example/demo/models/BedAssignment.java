package com.example.demo.models;

import com.example.demo.enums.AssignmentStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "bed_assignment")
public class BedAssignment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String whenAssigned;
    private String whenReleased;
    private String assignedBy;
    private String comments;
    @Enumerated(EnumType.STRING)
    private AssignmentStatus assignmentstatus;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course bed;

    public BedAssignment(){}

    public BedAssignment( String whenAssigned, String whenReleased, String assignedBy, String comments, AssignmentStatus assignmentstatus){
        this.whenAssigned= LocalDateTime.now().toString();
        this.whenReleased= LocalDateTime.now().toString();
        this.assignedBy= assignedBy;
        this.comments= comments;
        this.assignmentstatus= assignmentstatus;
    }

    public BedAssignment(Long id, String whenAssigned, String whenReleased, String assignedBy, String comments, AssignmentStatus assignmentstatus){
        this.whenAssigned= LocalDateTime.now().toString();
        this.whenReleased= LocalDateTime.now().toString();
        this.assignedBy= assignedBy;
        this.comments= comments;
        this.assignmentstatus= assignmentstatus;
    }

    public String getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String assignedBy) {
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AssignmentStatus getStatus() {
        return assignmentstatus;
    }

    public void setStatus(AssignmentStatus status) {
        this.assignmentstatus = status;
    }

    public void setLastStatusChangedOn(String lastStatusChangedOn) {
        this.lastStatusChangedOn = lastStatusChangedOn;
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
