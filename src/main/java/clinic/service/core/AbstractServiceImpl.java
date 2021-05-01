package clinic.service.core;

import clinic.dao.api.AbstractDao;
import clinic.mappers.AbstractMapper;
import clinic.service.api.AbstractService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;


public abstract class AbstractServiceImpl<T, DTO, Dao extends AbstractDao, Mapper extends AbstractMapper> implements AbstractService<T,DTO> {

    @Getter
    @Setter
    private Dao dao;

    @Getter
    private final Mapper mapper;

    public AbstractServiceImpl(Dao dao, Mapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }


    @Override
    @Transactional(readOnly = true)
    public T getOneById(Number id) {
        return (T) dao.findById(id);
        //return mapToDTO((T) dao.findById(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> getAll() {
        return dao.findAll();
        //return mapToDTO(dao.findAll());
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
    public DTO mapToDTO(T entity){

    return (DTO) mapper.mapEntityToDto(entity);
    }

    @Override
    public List<DTO> mapToDTO(List<T> entities) {
        return entities.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public T mapToEntity(DTO dto){
       return (T) mapper.mapDtoToEntity(dto);
    }

    @Override
    public List<T> mapToEntity(List<DTO> dtos) {
        return dtos.stream().map(this::mapToEntity).collect(Collectors.toList());
    }
}
