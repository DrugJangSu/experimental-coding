public class SmartPhone {
    private String modelName;
    private int battery;


    public SmartPhone(String modelName, int battery) {
        this.modelName = modelName;
        setBattery(battery);
    }

    public String getModelName() {
        return modelName;
    }


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        if (battery < 0) {
            this.battery = 0;
        } else if (battery > 100) {
            this.battery = 100;
        } else {
            this.battery = battery;
        }
    }

    public void printPhoneInfo() {
        System.out.println(" [ " + modelName + " ] 현재 배터리 잔량 : " + battery + "%");
    }

}
