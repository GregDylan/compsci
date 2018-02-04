
public class LetterBoxes {
	
	public LetterBoxes()
	{
	}

	public void printBox(char letter, int size)
	{
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(letter);
			}
			System.out.println("");
		}


	}

}
