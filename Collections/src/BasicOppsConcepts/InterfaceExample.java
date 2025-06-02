package BasicOppsConcepts;

// Base interface
interface Device {
    void powerOn();
}

// Intermediate interface extending Device
interface SmartDevice extends Device {
    void connectToWiFi();
}

// Sub-interface extending SmartDevice
interface SmartPhone extends SmartDevice {
    void makeCall(String number);
}

// Class implementing the most derived interface
class AndroidPhone implements SmartPhone {

    @Override
    public void powerOn() {
        System.out.println("Android phone is powering on...");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Android phone connected to WiFi.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " from Android phone.");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new AndroidPhone();
        myPhone.powerOn();
        myPhone.connectToWiFi();
        myPhone.makeCall("9876543210");
    }
}
