package cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa;

import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
