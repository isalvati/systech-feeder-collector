package br.com.systechfeeder.systechcollector.repositories;

import br.com.systechfeeder.systechcollector.entities.LocalGatewayEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocalGatewayRepository extends JpaRepository<LocalGatewayEntity, Long> {
    Optional<LocalGatewayEntity> findByMac(String mac);
}
