package br.com.systechfeeder.systechcollector.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sensor_data")
public class SensorDataEntity extends BaseEntity {
    @Column(name = "mac", nullable = false)
    private String mac;

    @Column(name = "temperature")
    private BigDecimal temperature;

    @Column(name = "humidity")
    private BigDecimal humidity;

    @Column(name = "feeder_weight")
    private BigDecimal feederWeight;

    @Column(name = "animal_weight")
    private BigDecimal animalWeight;

    @Column(name = "height")
    private Integer height;

    @Column(name = "battery_voltage")
    private BigDecimal batteryVoltage;

    @Column(name = "inclination_x")
    private BigDecimal inclinationX;

    @Column(name = "inclination_y")
    private BigDecimal inclinationY;

    @Column(name = "inclination_z")
    private BigDecimal inclinationZ;

    @Column(name = "local_timestamp")
    private Timestamp localTimestamp;

    @Column(name = "moment")
    private String moment;

    @Column(name = "error")
    private String error;

    @Column(name = "opened_cover")
    private Boolean openedCover;

    @Column(name = "elapsed_time")
    private Long elapsedTime;


    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    public BigDecimal getFeederWeight() {
        return feederWeight;
    }

    public void setFeederWeight(BigDecimal feederWeight) {
        this.feederWeight = feederWeight;
    }

    public BigDecimal getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(BigDecimal animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public BigDecimal getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(BigDecimal batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    public BigDecimal getInclinationX() {
        return inclinationX;
    }

    public void setInclinationX(BigDecimal inclinationX) {
        this.inclinationX = inclinationX;
    }

    public BigDecimal getInclinationY() {
        return inclinationY;
    }

    public void setInclinationY(BigDecimal inclinationY) {
        this.inclinationY = inclinationY;
    }

    public BigDecimal getInclinationZ() {
        return inclinationZ;
    }

    public void setInclinationZ(BigDecimal inclinationZ) {
        this.inclinationZ = inclinationZ;
    }

    public Timestamp getLocalTimestamp() {
        return localTimestamp;
    }

    public void setLocalTimestamp(Timestamp localTimestamp) {
        this.localTimestamp = localTimestamp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public Boolean getOpenedCover() {
        return openedCover;
    }

    public void setOpenedCover(Boolean openedCover) {
        this.openedCover = openedCover;
    }

    public Long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SensorDataEntity that = (SensorDataEntity) o;
        return Objects.equals(mac, that.mac) && Objects.equals(temperature, that.temperature) && Objects.equals(humidity, that.humidity) && Objects.equals(feederWeight, that.feederWeight) && Objects.equals(animalWeight, that.animalWeight) && Objects.equals(height, that.height) && Objects.equals(batteryVoltage, that.batteryVoltage) && Objects.equals(inclinationX, that.inclinationX) && Objects.equals(inclinationY, that.inclinationY) && Objects.equals(inclinationZ, that.inclinationZ) && Objects.equals(localTimestamp, that.localTimestamp) && Objects.equals(moment, that.moment) && Objects.equals(error, that.error) && Objects.equals(openedCover, that.openedCover) && Objects.equals(elapsedTime, that.elapsedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mac, temperature, humidity, feederWeight, animalWeight, height, batteryVoltage, inclinationX, inclinationY, inclinationZ, localTimestamp, moment, error, openedCover, elapsedTime);
    }

    @Override
    public String toString() {
        return "SensorDataEntity{" +
                "mac='" + mac + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", feederWeight=" + feederWeight +
                ", animalWeight=" + animalWeight +
                ", height=" + height +
                ", batteryVoltage=" + batteryVoltage +
                ", inclinationX=" + inclinationX +
                ", inclinationY=" + inclinationY +
                ", inclinationZ=" + inclinationZ +
                ", localTimestamp=" + localTimestamp +
                ", moment='" + moment + '\'' +
                ", error='" + error + '\'' +
                ", openedCover=" + openedCover +
                ", elapsedTime=" + elapsedTime +
                '}';
    }
}
