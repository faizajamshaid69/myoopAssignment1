import java.util.Objects;

public class Computer {
    private String  computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPu;
    Computer(String computerNumber,String lcdModel,int ramSize,int hddSize,boolean hasGPu){
        this.setComputerNumber(computerNumber);
        this.setLcdModel(lcdModel);
        this.setRamSize(ramSize);
        this.setHddSize(hddSize);
        this.setHasGPu(hasGPu);
    }


    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getLcdModel() {
        return lcdModel;
    }

    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPu() {
        return hasGPu;
    }

    public void setHasGPu(boolean hasGPu) {
        this.hasGPu = hasGPu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSize == computer.ramSize && hddSize == computer.hddSize && hasGPu == computer.hasGPu && computerNumber.equals(computer.computerNumber) && lcdModel.equals(computer.lcdModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerNumber, lcdModel, ramSize, hddSize, hasGPu);
    }

    public Computer clone(Computer a){
        return new Computer(this.computerNumber,this.lcdModel,this.ramSize,this.hddSize,this.hasGPu);
    }
}