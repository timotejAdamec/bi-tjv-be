package cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.converter.object;

import cz.cvut.fit.adametim.bi_tjv.semester_project.api.model.ObjectDto;
import cz.cvut.fit.adametim.bi_tjv.semester_project.domain.Object;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public final class ObjectToEntityConverter implements Function<ObjectDto, Object> {
    @Override
    public Object apply(ObjectDto objectDto) {
        return null;
    }
}
