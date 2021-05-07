package clinic.mappers;

import clinic.dto.PrescriptionDTO;
import clinic.entities.Prescription;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-05-07T08:20:27+0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 13.0.2 (AdoptOpenJDK)"
)
@Component
public class PrescriptionMapperImpl implements PrescriptionMapper {

    @Override
    public List<Prescription> mapDtoToEntity(List<PrescriptionDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<Prescription> list = new ArrayList<Prescription>( dto.size() );
        for ( PrescriptionDTO prescriptionDTO : dto ) {
            list.add( mapDtoToEntity( prescriptionDTO ) );
        }

        return list;
    }

    @Override
    public List<PrescriptionDTO> mapEntityToDto(List<Prescription> entity) {
        if ( entity == null ) {
            return null;
        }

        List<PrescriptionDTO> list = new ArrayList<PrescriptionDTO>( entity.size() );
        for ( Prescription prescription : entity ) {
            list.add( mapEntityToDto( prescription ) );
        }

        return list;
    }

    @Override
    public PrescriptionDTO mapEntityToDto(Prescription entity) {
        if ( entity == null ) {
            return null;
        }

        PrescriptionDTO prescriptionDTO = new PrescriptionDTO();

        return prescriptionDTO;
    }

    @Override
    public Prescription mapDtoToEntity(PrescriptionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Prescription prescription = new Prescription();

        return prescription;
    }
}
