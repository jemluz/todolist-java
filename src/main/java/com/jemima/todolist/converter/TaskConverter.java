package com.jemima.todolist.converter;

import com.jemima.todolist.dto.TaskDTO;
import com.jemima.todolist.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {
    public TaskEntity toTaskEntity(TaskDTO taskDTO) {
        TaskEntity taskEntity = new TaskEntity();

        taskEntity.setDescription(taskDTO.getDescription());
        taskEntity.setComplete(taskDTO.getIsComplete());

        return taskEntity;
    }
}
