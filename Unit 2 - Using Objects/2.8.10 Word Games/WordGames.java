import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        // switch first half
        // and second half
        int wordMidPoint = word.length() / 2;
        String firstHalf = word.substring(0, wordMidPoint);
        String secondHalf = word.substring(wordMidPoint, word.length());
        return secondHalf + firstHalf;
      
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        String firstHalf = word.substring(0, insertIdx);
        String secondHalf = word.substring(insertIdx, word.length());
        return firstHalf + insertText + secondHalf;
       
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        int charIndex = word.indexOf(insertChar);
        String firstHalf = word.substring(0, charIndex);
        String secondHalf = word.substring(charIndex, word.length());
        return firstHalf + insertText + secondHalf;
    }
    
    
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";
        
    }
    
    
}