package cz.cvut.fit.adametim.bi_tjv.semester_project.dao;

import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Manager;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Query(value = "SELECT p FROM Project p WHERE p.currentManager IS NOT NULL AND :manager IN p.managersHistory")
    Collection<Project> getColleagueProjects(Manager manager);
}
