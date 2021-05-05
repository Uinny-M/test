package clinic.mappers;

import clinic.dto.CaseDTO;
import clinic.entities.Case;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-05T23:09:35+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 13.0.2 (AdoptOpenJDK)"
)
@Component
public class CaseMapperImpl implements CaseMapper {

    @Override
    public List<Case> mapDtoToEntity(List<CaseDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<Case> list = new ArrayList<Case>( dto.size() );
        for ( CaseDTO caseDTO : dto ) {
            list.add( mapDtoToEntity( caseDTO ) );
        }

        return list;
    }

    @Override
    public List<CaseDTO> mapEntityToDto(List<Case> entity) {
        if ( entity == null ) {
            return null;
        }

        List<CaseDTO> list = new ArrayList<CaseDTO>( entity.size() );
        for ( Case case1 : entity ) {
            list.add( mapEntityToDto( case1 ) );
        }

        return list;
    }

    @Override
    public CaseDTO mapEntityToDto(Case entity) {
        if ( entity == null ) {
            return null;
        }

        CaseDTO caseDTO = new CaseDTO();

        caseDTO.setStartDate( entity.getStartDate() );
        caseDTO.setEndDate( entity.getEndDate() );
        caseDTO.setId( entity.getId() );
        caseDTO.setPatient( entity.getPatient() );
        caseDTO.setDiagnosis( entity.getDiagnosis() );
        caseDTO.setDoctor( entity.getDoctor() );
        caseDTO.setOpenCase( entity.isOpenCase() );

        return caseDTO;
    }

    @Override
    public Case mapDtoToEntity(CaseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Case case1 = new Case();

        case1.setId( dto.getId() );
        case1.setPatient( dto.getPatient() );
        case1.setDiagnosis( dto.getDiagnosis() );
        case1.setDoctor( dto.getDoctor() );
        case1.setStartDate( dto.getStartDate() );
        case1.setEndDate( dto.getEndDate() );
        case1.setOpenCase( dto.isOpenCase() );

        return case1;
    }
}
