package cz.cvut.fit.adametim.bi_tjv.semester_project.dao;

import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
