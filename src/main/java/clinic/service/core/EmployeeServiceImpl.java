//package clinic.service.core;
//
//import clinic.dao.api.EmployeeDao;
//import clinic.dao.api.PatientDao;
//import clinic.dto.EmployeeDTO;
//import clinic.entities.Employee;
//import clinic.service.api.EmployeeService;
//import lombok.Getter;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmployeeServiceImpl extends AbstractServiceImpl<Employee, EmployeeDTO, EmployeeDao> implements EmployeeService {
//
//
//    @Getter
//    private ModelMapper mapper;
//    private final EmployeeDao employeeDao;
//
//    public EmployeeServiceImpl(EmployeeDao employeeDao) {
//        super(employeeDao);
//        this.employeeDao = employeeDao;
//    }
//
//    @Override
//    public EmployeeDTO mapToDTO(Employee entity) {
//        return getMapper().map(entity, EmployeeDTO.class);
//    }
//
//    @Override
//    public Employee mapToEntity(EmployeeDTO employeeDTO) {
//        return getMapper().map(employeeDTO, Employee.class);
//    }
//}
