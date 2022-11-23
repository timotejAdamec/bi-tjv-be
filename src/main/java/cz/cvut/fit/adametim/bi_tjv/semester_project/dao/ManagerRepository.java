package cz.cvut.fit.adametim.bi_tjv.semester_project.dao;

import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
