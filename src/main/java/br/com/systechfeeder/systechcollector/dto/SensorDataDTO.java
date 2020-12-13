package br.com.systechfeeder.systechcollector.dto;

import br.com.systechfeeder.systechcollector.util.validation.MACAddress;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class SensorDataDTO {
    @JsonProperty("temp")
    private BigDecimal temperature;
    @JsonProperty("umid")
    private BigDecimal humidity;
    @JsonProperty("g_alim")
    private BigDecimal feederWeight;
    @JsonProperty("g_anim")
    private BigDecimal animalWeight;
    @JsonProperty("alt")
    private Integer height;
    @JsonProperty("volt")
    private BigDecimal batteryVoltage;
    @JsonProperty("x")
    private BigDecimal inclinationX;
    @JsonProperty("y")
    private BigDecimal inclinationY;
    @JsonProperty("z")
    private BigDecimal inclinationZ;
    @JsonProperty("er")
    private String error;
    @JsonProperty("mac")
    @MACAddress
    private String mac;
    @JsonProperty("ts")
    private Long localTimestamp;


    //todo: incluir enum e definir momentos, por hora é o nome do topico
    private String moment;

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
    public String toString() {
        return "SensorJsonDataDTO{" +
                "temperature=" + temperature +
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
                '}';
    }
}
