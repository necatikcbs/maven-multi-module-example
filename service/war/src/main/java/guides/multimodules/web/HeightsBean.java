
package guides.multimodules.web;

public class HeightsBean implements java.io.Serializable {
    private String heightCm = null;
    private String heightFeet = null;
    private String heightInches = null;
    private int cm = 0;
    private int feet = 0;
    private int inches = 0;

    public HeightsBean() {
    }

    public String getHeightCm() {
        return heightCm;
    }

    public String getHeightFeet() {
        return heightFeet;
    }

    public String getHeightInches() {
        return heightInches;
    }

    public void setHeightCm(String heightcm) {
        this.heightCm = heightcm;
    }

    public void setHeightFeet(String heightfeet) {
        this.cm = Integer.valueOf(heightCm);
        
        this.feet = guides.multimodules.lib.Converter.getFeet(cm);

        String result = String.valueOf(feet);
        this.heightFeet = result;
    }

    public void setHeightInches(String heightinches) {
        this.cm = Integer.valueOf(heightCm);
        
        this.inches = guides.multimodules.lib.Converter.getInches(cm);
        
        String result = String.valueOf(inches);
        this.heightInches = result;
    }

}
