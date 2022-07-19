public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater rater = new Rater("Orange", 2);
        rater.updateReview();
        System.out.println(rater);
        rater.setRating(10);
        rater.updateReview();
        System.out.println(rater);
        System.out.println(rater.getRating());
    }
}