package cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa;

import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Object;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends CrudRepository<Object, Long> {
}
