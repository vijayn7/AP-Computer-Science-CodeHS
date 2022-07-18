public class TeamRanks
{
    public static void main(String[] args) {
		String team1 = "Alabama";
		String team2 = "Ohio State";
		String team3 = "Florida State";
		String team4 = "USC";
		String team5 = "Clemson";
		String team6 = "Penn State";
		String team7 = "Oklahoma";
		String team8 = "Maryland";
		String team9 = "Wisconsin";
		String team10 = "Michigan";
		/*
		 * Don't edit above this line.
		 * Enter your code below this comment.
		 */
            
            String temp = team6;
            team6 = team2;
            team2 = temp;
            
		    String tem = team8;
		    team8 = team3;
		    team3 = tem;
		    
		    String te = team10;
		    team10 = team4;
		    team4 = te;
		    
		    String t = team10;
		    team10 = team5;
		    team5 = t;
		    
		    String q = team6;
		    team6 = team10;
		    team10 = q;
		    
		    String w = team9;
		    team9 = team8;
		    team8 = w;
		/*
		 * Don't edit below this line.
		 * Enter your code above this comment.
		 */

		System.out.print("1. ");
		System.out.println(team1);
		System.out.print("2. ");
		System.out.println(team2);
		System.out.print("3. ");
		System.out.println(team3);
		System.out.print("4. ");
		System.out.println(team4);
		System.out.print("5. ");
		System.out.println(team5);
		System.out.print("6. ");
		System.out.println(team6);
		System.out.print("7. ");
		System.out.println(team7);
		System.out.print("8. ");
		System.out.println(team8);
		System.out.print("9. ");
		System.out.println(team9);
		System.out.print("10. ");
		System.out.println(team10);
	}
}