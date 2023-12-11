package com.oduyemi.todo.service;

import com.oduyemi.todo.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void updateTaskStatus(Long taskId, boolean completed) {
        Task task = getTaskById(taskId);
        if (task != null) {
            task.setCompleted(completed);
        }
    }

    public void deleteTask(Long taskId) {
        Task task = getTaskById(taskId);
        if (task != null) {
            tasks.remove(task);
        }
    }

    private Task getTaskById(Long taskId) {
        return tasks.stream()
                .filter(task -> task.getId().equals(taskId))
                .findFirst()
                .orElse(null);
    }
}
