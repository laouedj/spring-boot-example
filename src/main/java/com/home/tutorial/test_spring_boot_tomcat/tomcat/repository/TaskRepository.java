package com.home.tutorial.test_spring_boot_tomcat.tomcat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.home.tutorial.test_spring_boot_tomcat.tomcat.domain.Task;
@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Integer> {
 List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
 List<Task> findByTaskStatus(@Param("status") String taskStatus);
}
