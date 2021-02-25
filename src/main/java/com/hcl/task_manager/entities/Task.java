package com.hcl.task_manager.entities;

import javax.persistence.*;
import java.util.Date;

@Table(name = "task")
@Entity 
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String taskName;

//    private Date startDate;
//
//    private Date endDate;

    private String description;

    private String email;

    private String severity;
    
    public Task() {
		
	}
	
	public Task(String taskName,String description,String email,String severity) {
		super();
		this.taskName = taskName;
//		this.startDate = startDate;
//		this.endDate = endDate;
		this.description = description;
		this.email = email;
		this.severity = severity;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

//    public Date getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(Date startDate) {
//        this.startDate = startDate;
//    }

//    public Date getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(Date endDate) {
//        this.endDate = endDate;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
