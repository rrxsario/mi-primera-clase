public class Computer {
    //declaring class variables
    private String cpuId;
    private int ramVersion;    
    private boolean isOn;
    //Constructor
    //initialation of class variables
    Computer (String cpuId, int ramVersion) {
        this.cpuId = cpuId;
        this.ramVersion = ramVersion;
        //always on false
        isOn = false;
    }
    //get methods
    public String getcpuId() {
        return cpuId;
    } 
    public int getRamVersion() {
        return ramVersion;
    }
    public boolean getPCState() {
        return isOn;    
    }
    public String getPCDetails() {
        return "Procesador: " + cpuId + " | Version DDR " + ramVersion + " | Encendido: " + isOn;
        
    }
    
    //set methods
    public void setCpuId(String newCpuId) {
        cpuId = newCpuId;
    
    }
    public void setRamVersion(int newRamVersion) {
        ramVersion = newRamVersion;

    }
    //switch isOn value from false to true and backwards
    public void switchPc() {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
    }
    
    //print methods
    public void printCpuDetails() {
        System.out.println("Procesador: " + cpuId + " | Version DDR " + ramVersion + " | Encendido: " + isOn);
    
    }
    
    
    
    
    
}