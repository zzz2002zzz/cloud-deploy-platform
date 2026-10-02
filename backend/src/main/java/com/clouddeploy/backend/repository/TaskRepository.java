package com.clouddeploy.backend.repository;

import com.clouddeploy.backend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}