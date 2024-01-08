package com.example.demo.dto;

import java.util.Date;

public class Task{
    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    private int task_id;
    private String task_name;
    private String description;
    private String due_date;
    private String status;
    public String getTask_name() {
        return task_name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_name='" + task_name + '\'' +
                ", description='" + description + '\'' +
                ", due_date=" + due_date +
                ", status='" + status + '\'' +
                '}';
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
