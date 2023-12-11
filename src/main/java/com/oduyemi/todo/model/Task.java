package com.oduyemi.todo.model;

import java.time.LocalDate;

public class Task {

    private Long id;
    private String description;
    private LocalDate dueDate;
    private boolean completed;

    public Task() {
        
    }

    public Task(Long id, String description, LocalDate dueDate, boolean completed) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
