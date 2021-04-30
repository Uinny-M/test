package clinic.service.core;

import clinic.dao.api.AbstractDao;
import clinic.dao.api.PatientDao;
import clinic.dto.PatientDTO;
import clinic.entities.Patient;
import clinic.service.api.AbstractService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public abstract class AbstractServiceImpl<T, DTO, Dao extends AbstractDao> implements AbstractService<T,DTO> {

    @Getter
    @Setter
    private Dao dao;

    @Override
    @Transactional(readOnly = true)
    public DTO getOneById(Number id) {
        return mapToDTO((T) dao.findById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<DTO> getAll() {
        return mapToDTO(dao.findAll());
    }

    @Override
    @Transactional
    public DTO create(DTO dto) {
        return mapToDTO((T) dao.save(mapToEntity(dto)));
    }

    @Override
    @Transactional
    public DTO update(DTO dto) {
        return mapToDTO((T) dao.update(mapToEntity(dto)));
    }

    @Transactional
    public DTO createOrUpdate(DTO dto) {
        if (getAll().contains(dto)) {
            update(dto);
        }
        else create(dto);
        return dto;
    }

    @Override
    @Transactional
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
