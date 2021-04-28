package clinic.service.core;

import clinic.dao.api.AbstractDao;
import clinic.service.api.AbstractService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public abstract class AbstractServiceImpl<T, DTO, Dao extends AbstractDao> implements AbstractService<T,DTO> {

    @Getter
    @Setter
    private Dao dao;

    @Override
    public DTO findById(Number id) {
        return mapToDTO((T) dao.findById(id));
    }

    @Override
    public List<DTO> findAll() {
        return mapToDTO(dao.findAll());
    }

    @Override
    public DTO save(DTO dto) {
        return mapToDTO((T) dao.save(mapToEntity(dto)));
    }

    @Override
    public DTO update(DTO dto) {
        return mapToDTO((T) dao.update(mapToEntity(dto)));
    }

    public DTO createOrUpdate(DTO dto) {
        if (findAll().contains(dto)) {
            update(dto);
        }
        else save(dto);
        return dto;
    }

    @Override
    public void delete(DTO dto) {
        dao.delete(mapToEntity(dto));
    }

    @Override
    public void deleteById(Number entityId) {
        dao.deleteById(entityId);
    }

    @Override
    public abstract DTO mapToDTO(T entity);

    @Override
    public List<DTO> mapToDTO(List<T> entities) {
        return entities.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public abstract T mapToEntity(DTO dto);

    @Override
    public List<T> mapToEntity(List<DTO> dtos) {
        return dtos.stream().map(this::mapToEntity).collect(Collectors.toList());
    }
}
