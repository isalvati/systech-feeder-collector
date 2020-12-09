package br.com.systechfeeder.systechcollector.dto;

public class SensorDataDTO {
    private float temp;
    private float umid;
    private float g_alim;
    private float g_anim;
    private float alt;
    private float volt;
    private float x;
    private float y;
    private float z;
    private String er;
    private String mac;


    // Getter Methods

    public float getTemp() {
        return temp;
    }

    public float getUmid() {
        return umid;
    }

    public float getG_alim() {
        return g_alim;
    }

    public float getG_anim() {
        return g_anim;
    }

    public float getAlt() {
        return alt;
    }

    public float getVolt() {
        return volt;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public String getEr() {
        return er;
    }

    public String getMac() {
        return mac;
    }

    // Setter Methods

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setUmid(float umid) {
        this.umid = umid;
    }

    public void setG_alim(float g_alim) {
        this.g_alim = g_alim;
    }

    public void setG_anim(float g_anim) {
        this.g_anim = g_anim;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }

    public void setVolt(float volt) {
        this.volt = volt;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setEr(String er) {
        this.er = er;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "SensorDataDTO{" +
                "temp=" + temp +
                ", umid=" + umid +
                ", g_alim=" + g_alim +
                ", g_anim=" + g_anim +
                ", alt=" + alt +
                ", volt=" + volt +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", er='" + er + '\'' +
                ", mac='" + mac + '\'' +
                '}';
    }
}
