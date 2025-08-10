package day4;

abstract class SmartDevice 
{
    abstract void performFunction();
}

class SmartPhone extends SmartDevice
{
   
    void performFunction() 
    {
        System.out.println("SmartPhone is calling and browsing.");
    }
}

class SmartWatch extends SmartDevice 
{
   
    void performFunction() 
    {
        System.out.println("SmartWatch is tracking fitness and time.");
    }
}

class SmartSpeaker extends SmartDevice
{
  
    void performFunction() 
    {
        System.out.println("SmartSpeaker is playing music and responding to voice commands.");
    }
}

public class Performfunction {
    public static void main(String[] args) 
    {
        SmartDevice[] devices = new SmartDevice[3];
        
        devices[0] = new SmartPhone();
        devices[1] = new SmartWatch();
        devices[2] = new SmartSpeaker();
        
        
        for (SmartDevice device : devices)
        {
            device.performFunction();
        }
    }
}

