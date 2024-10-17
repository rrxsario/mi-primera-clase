public class Computer {
    //declaring class variables
    private String cpuId;
    private int ramSlots;    
    private boolean isOn;
    //Constructor
    //initialation of class variables
    public Computer (String cpuId, int ramSlots) {
        this.cpuId = cpuId;
        this.ramSlots = ramSlots;
        //always on false
        isOn = false;
    }
    //get methods
    public String getcpuId() {
        return cpuId;
    } 
    public int getRamSlots() {
        return ramSlots;
    }
    public boolean getPCState() {
        return isOn;    
    }
    public String getPCDetails() {
        return "Procesador: " + cpuId + " | Version DDR " + ramSlots + " modulos de ram instalado Encendido: " + (isOn ? "sí" : "no");
        
    }
    
    //set methods
    public void setCpuId(String newCpuId) {
        cpuId = newCpuId;
    
    }
    public void addRamSlot(int newModule) {
        ramSlots += newModule ;

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
        System.out.println("Procesador: " + cpuId + " | Version DDR " + ramSlots + " modulos de ram instalado Encendido: " + (isOn ? "sí" : "no"));
    
    }
    
    
    
    
    
}