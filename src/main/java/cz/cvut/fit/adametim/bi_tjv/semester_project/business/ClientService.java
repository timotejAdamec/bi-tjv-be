package cz.cvut.fit.adametim.bi_tjv.semester_project.business;

import cz.cvut.fit.adametim.bi_tjv.semester_project.dao.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class ClientService {
    private final ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }
}
