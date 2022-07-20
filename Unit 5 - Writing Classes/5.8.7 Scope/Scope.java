public class Scope
{
    private int a;
    private int b;
    private int c;

    public Scope(){
        a = 5;
        b = 10;
        c = 15;
    }

    public void printScope(){
       System.out.println("a = " + getA() + "\nb = " + getB() + "\nc = " + getC() + "\nd = " + getD() + "\ne = " + getE());
    }

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

    public int getD(){
        int d = a + c;
        return d;
    }

	public int getE() {
        int e = b + c;
		return e;
	}
}