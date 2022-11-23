package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.converter.client;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ClientDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Client;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public final class ClientToDtoConverter implements Function<Client, ClientDto> {
    @Override
    public ClientDto apply(Client client) {
        return null;
    }
}
