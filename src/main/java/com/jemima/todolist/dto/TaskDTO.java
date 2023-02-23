package com.jemima.todolist.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {
    private String description;
    private Boolean isComplete;
}
