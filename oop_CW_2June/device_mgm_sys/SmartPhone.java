package oop_CW_2June.device_mgm_sys;

public class SmartPhone extends Device{
    private String operatingSystem;
    private double cameraResolution;
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public double getCameraResolution() {
        return cameraResolution;
    }
    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public void detailsPrint()
    {
        System.out.println("Phone details are below:");
        System.out.println("Phone Brand is:"+super.getBrand());
        System.out.println("Phone price is:"+super.getPrice());
        System.out.println("Phone OS is:"+getOperatingSystem());
        System.out.println("Camera Resolution is:"+getCameraResolution());
    }

}
