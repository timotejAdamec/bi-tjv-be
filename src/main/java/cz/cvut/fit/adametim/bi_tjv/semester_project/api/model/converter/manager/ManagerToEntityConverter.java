package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.converter.manager;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ManagerDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Manager;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public final class ManagerToEntityConverter implements Function<ManagerDto, Manager> {
    @Override
    public Manager apply(ManagerDto managerDto) {
        return new Manager(
                managerDto.managerId(),
                managerDto.name(),
                managerDto.phoneNumber()
        );
    }
}
