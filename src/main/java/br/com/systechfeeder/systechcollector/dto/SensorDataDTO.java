package br.com.systechfeeder.systechcollector.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SensorDataDTO {
    @JsonProperty("temp")
    private float temperature;
    @JsonProperty("umid")
    private float humidity;
    @JsonProperty("g_alim")
    private float feederWeight;
    @JsonProperty("g_anim")
    private float animalWeight;
    @JsonProperty("alt")
    private float height;
    @JsonProperty("volt")
    private float batteryVoltage;
    @JsonProperty("x")
    private float inclinationX;
    @JsonProperty("y")
    private float inclinationY;
    @JsonProperty("z")
    private float inclinationZ;
    @JsonProperty("er")
    private String error;
    @JsonProperty("mac")
    private String mac;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getFeederWeight() {
        return feederWeight;
    }

    public void setFeederWeight(float feederWeight) {
        this.feederWeight = feederWeight;
    }

    public float getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(float animalWeight) {
        this.animalWeight = animalWeight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(float batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    public float getInclinationX() {
        return inclinationX;
    }

    public void setInclinationX(float inclinationX) {
        this.inclinationX = inclinationX;
    }

    public float getInclinationY() {
        return inclinationY;
    }

    public void setInclinationY(float inclinationY) {
        this.inclinationY = inclinationY;
    }

    public float getInclinationZ() {
        return inclinationZ;
    }

    public void setInclinationZ(float inclinationZ) {
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
