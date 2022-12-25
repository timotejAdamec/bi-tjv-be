package cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa;

import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Manager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ManagerRepository extends CrudRepository<Manager, Long> {

    @Query(value = "SELECT DISTINCT p.currentManager, p.managersHistory FROM Project p " +
            "WHERE p.currentManager = :manager OR :manager IN p.managersHistory")
    Collection<Manager> getColleagues(Manager manager);
}
