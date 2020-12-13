package br.com.systechfeeder.systechcollector.repositories;

import br.com.systechfeeder.systechcollector.entities.SensorDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDataRepository extends JpaRepository<SensorDataEntity, Long> {
}
