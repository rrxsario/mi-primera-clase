public class Computer {
    private String cpuId;
    private int ramVersion;    
    private boolean isOn;
    
    Computer (String cpuId, int ramVersion) {
        this.cpuId = cpuId;
        this.ramVersion = ramVersion;
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
    //set methods
    public void setCpuId(String newCpuId) {
        cpuId = newCpuId;
    
    }
    public void setRamVersion(int newRamVersion) {
        ramVersion = newRamVersion;

    }
    public void switchPc() {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
    
    }
    
    
    
    
    
}