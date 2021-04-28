package clinic.service.api;


import java.util.List;

public interface AbstractService <T, DTO>{
    DTO findById(Number id);

    List<DTO> findAll();

    DTO save(DTO dto);

    DTO update(DTO dto);

    DTO createOrUpdate(DTO dto);

    void delete(DTO dto); //todo изменить на софт

    void deleteById(Number entityId);

    DTO mapToDTO(T entity);

    List<DTO> mapToDTO(List<T> entities);

    T mapToEntity(DTO dto);

    List<T> mapToEntity(List<DTO> dtoList);
}
