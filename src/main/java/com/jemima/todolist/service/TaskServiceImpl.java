package com.jemima.todolist.service;

import com.jemima.todolist.dto.TaskDTO;
import com.jemima.todolist.entity.TaskEntity;
import com.jemima.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void save(TaskEntity taskEntity) {
        taskRepository.save(taskEntity);
    }
}
