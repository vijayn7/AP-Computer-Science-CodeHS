public class ClothingTester
{
    public static void main(String[] args)
    {
        Sweatshirt hoodie = new Sweatshirt("large", "white", true);
        TShirt tee = new TShirt("Small", "blue", "cotton");
        Jeans levi = new Jeans("medium");
        Clothing hat = new Clothing("small", "red");
        System.out.println(hoodie.hasHood());
        System.out.println(tee.getColor());
        System.out.println(levi.getSize());
        System.out.println(tee.getFabric());
    }
}