public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input){
        myArray = input;
    }

    public boolean equals(Object[][] other){
        if(myArray.length == other.length) {
            for (int i = 0; i < other.length; i++) {
                if (myArray[i].length != other[i].length) {
                    return false;
                }
                for (int j = 0; j < other[i].length; j++) {
                    if (!myArray[i][j].equals(other[i][j])) {
                        return false;
                    }
                    
                }
            }
            return true;
        }
        return false;
    }

}