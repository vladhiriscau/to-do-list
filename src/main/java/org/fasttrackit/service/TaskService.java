package org.fasttrackit.service;

import org.fasttrackit.domain.Task;
import org.fasttrackit.persistance.TaskRepository;
import org.fasttrackit.transfer.CreateTaskRequest;
import org.fasttrackit.transfer.UpdateTaskRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TaskService {

    private TaskRepository taskRepository = new TaskRepository();

    public void createTask(CreateTaskRequest request) throws IOException, SQLException {
        System.out.println("Creating task:" + request);
        taskRepository.createTask(request);
        // apply any other bussiness logic in the service layer
    }

    public  void  updateTask(long id, UpdateTaskRequest request) throws IOException, SQLException {
        System.out.println("Updating task" + id + ": "+ request);
        taskRepository.upateTask(id, request);
    }

    public  void  deleteTask(long id) throws IOException, SQLException {
        System.out.println("Deleting task" + id);
        taskRepository.deleteTask(id);
    }

    public List<Task> getTasks() throws IOException, SQLException {
        System.out.println("Retriving all tasks.");
        return taskRepository.getTasks();
    }
}
