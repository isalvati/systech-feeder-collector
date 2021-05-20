package br.com.systechfeeder.systechcollector.dto;

import br.com.systechfeeder.systechcollector.util.validation.MACAddress;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

public class SensorDataDTO {
    @JsonProperty("temperaturaComedouro")
    private BigDecimal temperature;
    @JsonProperty("temperaturaAnimal")
    private BigDecimal animalTemperature;
    @JsonProperty("umidadeComedouro")
    private BigDecimal humidity;
    @JsonProperty("pesoComedouro")
    private BigDecimal feederWeight;
    @JsonProperty("pesoAnimal")
    private BigDecimal animalWeight;
    @JsonProperty("alturaAnimal")
    private Integer height;
    @JsonProperty("tensaoBateria")
    private BigDecimal batteryVoltage;
    @JsonProperty("inclinacao_x")
    private BigDecimal inclinationX;
    @JsonProperty("inclinacao_y")
    private BigDecimal inclinationY;
    @JsonProperty("inclinacao_z")
    private BigDecimal inclinationZ;
    @JsonProperty("erro")
    private String error;
    @JsonProperty("mac")
//    @MACAddress
    private String mac;
    @JsonProperty("ts")
    private Long localTimestamp;
    @JsonProperty("tampaAberta")
    private Boolean openedCover;
    @JsonProperty("tempo_decorrido")
    private Long elapsedTime;
    //todo: incluir enum e definir momentos, por hora é o nome do topico
    private String moment;
    @JsonProperty("gateway_mac")
    private String gatewayMac;

    public String getGatewayMac() {
        return gatewayMac;
    }

    public void setGatewayMac(String gatewayMac) {
        this.gatewayMac = gatewayMac;
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

    public BigDecimal getAnimalTemperature() {
        return animalTemperature;
    }

    public void setAnimalTemperature(BigDecimal animalTemperature) {
        this.animalTemperature = animalTemperature;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public Long getLocalTimestamp() {
        return localTimestamp;
    }

    public void setLocalTimestamp(Long localTimestamp) {
        this.localTimestamp = localTimestamp;
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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorDataDTO that = (SensorDataDTO) o;
        return Objects.equals(temperature, that.temperature) && Objects.equals(animalTemperature, that.animalTemperature) && Objects.equals(humidity, that.humidity) && Objects.equals(feederWeight, that.feederWeight) && Objects.equals(animalWeight, that.animalWeight) && Objects.equals(height, that.height) && Objects.equals(batteryVoltage, that.batteryVoltage) && Objects.equals(inclinationX, that.inclinationX) && Objects.equals(inclinationY, that.inclinationY) && Objects.equals(inclinationZ, that.inclinationZ) && Objects.equals(error, that.error) && Objects.equals(mac, that.mac) && Objects.equals(localTimestamp, that.localTimestamp) && Objects.equals(openedCover, that.openedCover) && Objects.equals(elapsedTime, that.elapsedTime) && Objects.equals(gatewayMac, that.gatewayMac) && Objects.equals(moment, that.moment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, animalTemperature, humidity, feederWeight, animalWeight, height, batteryVoltage, inclinationX, inclinationY, inclinationZ, error, mac, localTimestamp, openedCover, elapsedTime, gatewayMac, moment);
    }

    @Override
    public String toString() {
        return "SensorDataDTO{" +
                "temperature=" + temperature +
                ", animalTemperature=" + animalTemperature +
                ", humidity=" + humidity +
                ", feederWeight=" + feederWeight +
                ", animalWeight=" + animalWeight +
                ", height=" + height +
                ", batteryVoltage=" + batteryVoltage +
                ", inclinationX=" + inclinationX +
                ", inclinationY=" + inclinationY +
                ", inclinationZ=" + inclinationZ +
                ", error='" + error + '\'' +
                ", mac='" + mac + '\'' +
                ", localTimestamp=" + localTimestamp +
                ", openedCover=" + openedCover +
                ", elapsedTime=" + elapsedTime +
                ", gatewayMac='" + gatewayMac + '\'' +
                ", moment='" + moment + '\'' +
                '}';
    }
}
