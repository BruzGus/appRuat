package factoryDevices;

public class FactoryDevice {

    public static IDevice make(String type){
        IDevice device;

        switch (type.toLowerCase()){
            case "android":
                device = new Android();
                break;
            case "windows":
                device = new WindowsPhone();
                break;
            default:
                device = new Android();
                break;
        }
        return device;
    }
}
