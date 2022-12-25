package cz.cvut.fit.adametim.bi_tjv.semester_project.business;

import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa.ManagerRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Manager;
import org.springframework.stereotype.Service;

@Service
public final class ManagerService extends AbstractCrudService<Manager, Long> {

    public ManagerService(ManagerRepository repository) {
        super(repository);
    }
}
