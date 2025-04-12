package org.humanresourcers.hrworker.repositories;

import org.humanresourcers.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    // This interface is empty, but it extends JpaRepository<Worker, Long>
    // which provides CRUD operations for the Worker entity.
    // You can add custom query methods here if needed.
}
