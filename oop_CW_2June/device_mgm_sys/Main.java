package oop_CW_2June.device_mgm_sys;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.setBrand("Apple");
        smartPhone.setPrice(200000);
        smartPhone.setOperatingSystem("iOS");
        smartPhone.setCameraResolution(48);
        smartPhone.detailsPrint();
    }
}
