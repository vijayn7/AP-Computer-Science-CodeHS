public class HSStudent extends StudentTest {

    private int serviceHours;

    public HSStudent(String name, int mathScore, int elaScore, int serviceHours){
       super(name, mathScore, elaScore);
       this.serviceHours = serviceHours;
    }

    public int getServiceHours(){
       return serviceHours;
    }

    public void setServiceHours(int serviceHours){
       this.serviceHours = serviceHours;
    }

    // If math score is at least 525, return true
    public boolean passMath(){
        if (super.getMathScore() >= 525) {
            return true;
        }
        return false;
    }

    // If ela score is at least 560, return true
    public boolean passEla(){
       if (super.getElaScore() >= 565) {
            return true;
        }
        return false;
    }

    // If service hours are at least 75, return true
    public boolean completeService(){
        if (serviceHours >= 575) {
            return true;
        }
        return false;
    }

    // If the student has passed math, passed ela, and completed
    // service hours, return true.
    public boolean gradQualify(){
       if (passMath() && passEla() && completeService()) {
           return true;
       }
       return false;
    }

    // If the student has qualified for graduation, print:
    // (name) has qualified for graduation.
    // Otherwise print:
    // (name) has not yet qualified for graduation.
    // Where (name) is the student's name.
    public String toString(){
        if (gradQualify()){
            return super.getName() + " has qualified for graduation.";
        }

        return super.getName() + " has not yet qualified for graduation.";
    }
}