package br.com.systechfeeder.systechcollector.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "local_gateway")
public class LocalGatewayEntity extends BaseEntity {

    @Column(name = "mac", nullable = false)
    private String mac;

    @Column(name = "farm_key", nullable = false)
    private String farmKey;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getFarmKey() {
        return farmKey;
    }

    public void setFarmKey(String farmKey) {
        this.farmKey = farmKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalGatewayEntity that = (LocalGatewayEntity) o;
        return Objects.equals(mac, that.mac) && Objects.equals(farmKey, that.farmKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mac, farmKey);
    }

    @Override
    public String toString() {
        return "LocalGatewayEntity{" +
                "mac='" + mac + '\'' +
                ", farmKey='" + farmKey + '\'' +
                '}';
    }
}
