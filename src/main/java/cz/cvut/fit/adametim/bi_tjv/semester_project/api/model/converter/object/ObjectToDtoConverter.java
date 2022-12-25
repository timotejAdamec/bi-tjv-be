package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.converter.object;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ObjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Object;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public final class ObjectToDtoConverter implements Function<Object, ObjectDto> {
    @Override
    public ObjectDto apply(Object object) {
        return new ObjectDto(
                object.getId(),
                object.getProject().getId()
        );
    }
}
