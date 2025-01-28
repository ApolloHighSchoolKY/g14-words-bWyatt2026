import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{
		wordList = new ArrayList<Word>();
	}

	public Words(String s)
	{
		wordList = new ArrayList<Word>();

		setWords(s);
	}

	public void setWords(String s)
	{
		wordList.clear();

		//Create a Scanner for the list of words in the string "s"
		Scanner wordScan = new Scanner(s);

		//Continue to loop while there are more words to read
		while(wordScan.hasNext())
		{
			//Add objects of the type Word to our ArrayList "wordList"
			wordList.add(new Word(wordScan.next()));
		}


	}

	public int countWordsWithXChars(int size)
	{
		int count=0;

		//for every Word in the ArrayList "wordList"
		for(Word wordSize: wordList)
		{
			//if the length of the "theWord" is the same as the parameter "size"
			if(wordSize.getLength()==size)
			{
				count++;
			}
		}
		return count;
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;
		//Remove from an arraylist backwards
		//for each Word in the ArrayList "words" loop
		for(int i=wordList.size()-1; i>0; i--)
		{
			if(wordList.get(i).getNumVowels()>-1)
			{
				vowelCount++;
			}
			//if the Word has "size" characters
			if(wordList.get(i).getLength()==size)
			{
				wordList.remove(i);
			}
		}
		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		//for every Word in the ArrayList "words"
		for(Word wordBig: wordList)
		{
			//if the number of vowels in "theWord" is the same as the parameter "numVowels"
			if(wordBig.getNumVowels()==numVowels)
			{
				count++;
			}
		}
		return count;
	}

	public String toString()
	{
	   return "" + wordList;
	}
}