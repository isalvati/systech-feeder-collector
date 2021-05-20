package br.com.systechfeeder.systechcollector.service;

import br.com.systechfeeder.systechcollector.dto.SensorDataDTO;
import br.com.systechfeeder.systechcollector.entities.LocalGatewayEntity;
import br.com.systechfeeder.systechcollector.entities.SensorDataEntity;
import br.com.systechfeeder.systechcollector.exception.SystechException;
import br.com.systechfeeder.systechcollector.repositories.LocalGatewayRepository;
import br.com.systechfeeder.systechcollector.util.SystechService;
import org.apache.commons.lang3.StringUtils;
import org.jboss.logging.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.Set;

@Service
public class SensorDataService extends SystechService<SensorDataEntity> {

    private static final Logger LOGGER = Logger.getLogger(SensorDataService.class);

    private final LocalGatewayRepository localGatewayRepository;

    @Autowired
    public SensorDataService(LocalGatewayRepository localGatewayRepository) {
        this.localGatewayRepository = localGatewayRepository;
    }

    public void saveSensorData(SensorDataDTO sensorDataDTO) {
        try {
            //todo: melhorar essa validação, isolar
            validate(sensorDataDTO);
            SensorDataEntity entity = new ModelMapper().map(sensorDataDTO, SensorDataEntity.class);
            if (!StringUtils.isBlank(sensorDataDTO.getGatewayMac())) {
                Optional<LocalGatewayEntity> localGatewayEntity = localGatewayRepository.findByMac(sensorDataDTO.getGatewayMac());
                if (localGatewayEntity.isPresent()) {
                    entity.setLocalGateway(localGatewayEntity.get());
                } else {
                    LOGGER.info("New local gateway: [" + sensorDataDTO.getGatewayMac());
                    LocalGatewayEntity newLocalGateway = new LocalGatewayEntity();
                    newLocalGateway.setMac(sensorDataDTO.getGatewayMac());
                    localGatewayRepository.save(newLocalGateway);
                    entity.setLocalGateway(newLocalGateway);
                }
            }
            if (sensorDataDTO.getLocalTimestamp() != null) {
                entity.setLocalTimestamp(new Timestamp(sensorDataDTO.getLocalTimestamp() * 1000));
            }
            save(entity);
            LOGGER.debug("Dados de sensor salvo");
        } catch (SystechException e) {
            LOGGER.error("Erro ao salvar dados de sensor: " + e.getMessage());
        }
    }

    private void validate(SensorDataDTO sensorDataDTO) throws SystechException {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<SensorDataDTO>> violations = validator.validate(sensorDataDTO);
        if (!violations.isEmpty()) {
            LOGGER.error(violations.toString());
            throw new SystechException("Invalid field: " + violations.iterator().next().getPropertyPath().toString());
        }
    }

}
