package com.jemima.todolist.controller;

import com.jemima.todolist.converter.TaskConverter;
import com.jemima.todolist.dto.TaskDTO;
import com.jemima.todolist.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {
    private TaskService taskService;
    private TaskConverter taskConverter;

    @PostMapping
    public ResponseEntity<String> save(TaskDTO taskDTO) {
        taskService.save(taskConverter.toTaskEntity(taskDTO));
        return new ResponseEntity<>("Task created", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<String> getAll() {
        return null;
    }
}
