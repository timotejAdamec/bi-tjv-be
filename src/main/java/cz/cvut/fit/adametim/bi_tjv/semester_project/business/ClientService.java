package cz.cvut.fit.adametim.bi_tjv.semester_project.business;

import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.jpa.ClientRepository;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import org.springframework.stereotype.Service;

@Service
public final class ClientService extends AbstractCrudService<Client, Long> {

    public ClientService(ClientRepository repository) {
        super(repository);
    }
}
