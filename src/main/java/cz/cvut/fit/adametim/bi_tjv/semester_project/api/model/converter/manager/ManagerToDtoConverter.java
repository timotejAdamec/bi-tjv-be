package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.converter.manager;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ManagerDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Manager;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public final class ManagerToDtoConverter implements Function<Manager, ManagerDto> {
    @Override
    public ManagerDto apply(Manager manager) {
        return new ManagerDto(
                manager.getManagerId(),
                manager.getName(),
                manager.getPhoneNumber()
        );
    }
}
