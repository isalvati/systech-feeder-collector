package br.com.systechfeeder.systechcollector.service;

import br.com.systechfeeder.systechcollector.dto.SensorDataDTO;
import br.com.systechfeeder.systechcollector.entities.SensorDataEntity;
import br.com.systechfeeder.systechcollector.exception.SystechException;
import br.com.systechfeeder.systechcollector.util.SystechService;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.jboss.logging.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.sql.Timestamp;
import java.util.Set;

@Service
public class SensorDataService extends SystechService<SensorDataEntity> {

    private static final Logger LOGGER = Logger.getLogger(SensorDataService.class);

//    private final SensorDataRepository sensorDataRepository;
//
//    @Autowired
//    public SensorDataService(SensorDataRepository sensorDataRepository) {
//        this.sensorDataRepository = sensorDataRepository;
//    }

    public void saveSensorData(SensorDataDTO sensorDataDTO){
        try {
            //todo: melhorar essa validação, isolar
            validate(sensorDataDTO);
            SensorDataEntity entity = new ModelMapper().map(sensorDataDTO, SensorDataEntity.class);
            if(sensorDataDTO.getLocalTimestamp() != null) {
                entity.setLocalTimestamp(new Timestamp(sensorDataDTO.getLocalTimestamp()));
            } else {
                entity.setLocalTimestamp(new Timestamp(System.currentTimeMillis()));
            }
            save(entity);
            LOGGER.error("Dados de sensor salvo");
        } catch (SystechException e) {
            LOGGER.error("Erro ao salvar dados de sensor: " + e.getMessage());
        }
    }

    private void validate(SensorDataDTO sensorDataDTO) throws SystechException {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<SensorDataDTO>> violations = validator.validate(sensorDataDTO);
        if(!violations.isEmpty()) {
            LOGGER.error(violations.toString());
            throw new SystechException("Invalid field: " + violations.iterator().next().getPropertyPath().toString());
        }
    }

}
