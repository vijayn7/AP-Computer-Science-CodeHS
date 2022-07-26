public class Pie {

    private String type;
    private int slices;
    
    public Pie (String type, int slices) {
        this.type = type;
        this.slices = slices;
    }
    
    public int getSlices (){
        return slices;
    }
    
    public void eatSlice(){
        slices --;
    }
    
    public String getType(){
        return type;
    }
}