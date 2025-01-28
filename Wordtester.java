public class Wordtester
{
    public static void main(String [] args)
    {
        Word word = new Word("word");

        System.out.println(word);
        System.out.println("\nNum of vowels = " + word.getNumVowels());
        System.out.println("Word length = " + word.getLength());

        word.setWord("newWord");
        System.out.println("\nNum of vowels = " + word.getNumVowels());
        System.out.println("Word length = " + word.getLength());
        
    }
}