package cz.cvut.fit.adametim.bi_tjv.semester_project.business;

import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.ObjectRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Object;
import org.springframework.stereotype.Service;

@Service
public final class ObjectService extends AbstractCrudService<Object, Long> {

    public ObjectService(ObjectRepository repository) {
        super(repository);
    }
}
