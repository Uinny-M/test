package clinic.mappers;

import org.springframework.stereotype.Component;

@Component
public interface AbstractMapper<T, DTO>{
    T mapDtoToEntity(DTO dto);
    DTO mapEntityToDto(T entity);
}
