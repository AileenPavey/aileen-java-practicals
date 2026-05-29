// Interface 1
interface WiFi {
    void connectWiFi();
}

// Interface 2
interface Bluetooth {
    void connectBluetooth();
}

// Interface 3
interface VoiceControl {
    void voiceCommand();
}

// Class implementing all interfaces
class SmartDevice implements WiFi, Bluetooth, VoiceControl {

    public void connectWiFi() {
        System.out.println("WiFi Connected");
    }

    public void connectBluetooth() {
        System.out.println("Bluetooth Connected");
    }

    public void voiceCommand() {
        System.out.println("Voice Command Activated");
    }
}

// Main class
class a12 {
    public static void main(String[] args) {

        // Runtime Polymorphism using interface references

        WiFi w = new SmartDevice();
        w.connectWiFi();

        Bluetooth b = new SmartDevice();
        b.connectBluetooth();

        VoiceControl v = new SmartDevice();
        v.voiceCommand();
    }
}