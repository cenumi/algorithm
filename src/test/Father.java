package test;

public class Father {
    public int fatherInt;
    public String fatherString;

    public Father() {
    }

    public Father(int fatherInt, String fatherString) {
        this.fatherInt = fatherInt;
        this.fatherString = fatherString;
    }

    public int setBase(){
        return fatherInt;
    }

    public int getFatherInt() {
        return fatherInt;
    }

    public void setFatherInt(int fatherInt) {
        this.fatherInt = fatherInt;
    }

    public String getFatherString() {
        return fatherString;
    }

    public void setFatherString(String fatherString) {
        this.fatherString = fatherString;
    }
}
