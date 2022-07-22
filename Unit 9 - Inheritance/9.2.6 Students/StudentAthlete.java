public class StudentAthlete extends Student
{
    private String sport;
    private boolean eligible;
    
   // Add the constructor here
   public StudentAthlete(String name, int classYear, String sport, boolean eligible) {
       super(name, classYear);
       this.sport = sport;
       this.eligible = eligible;
   }
   
   
   public String getSport(){
       return sport;
   }
   
   public boolean isEligible(){
       return eligible;
   }
    
    @Override
    public String toString(){
        return super.getName() + ", class of " + super.getClassYear() +
            ", plays " + sport;
    }
}