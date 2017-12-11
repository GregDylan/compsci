import java.util.Arrays;

public class Average {
	
	public String strO;
	
	public Average() {
		
	}
	
	public Average(String fileS) {
		this.strO = fileS;
		System.out.println(fileS);
	}
	
	public String toString() {
		String[] strArray = strO.split(" ");
		int[] intArray = new int[strArray.length];
		
		for(int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		
		//sort the array
		Arrays.sort(intArray);
		int droppedGrade = intArray[0];
		int highestGrade = intArray[intArray.length - 1];
		
		int total = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			total += intArray[i];
		}
		
		total = total - droppedGrade;
		
		double average = (double) total / (intArray.length - 1);
		
		double averageRounded = (int) ((average + 0.005) * 100) / 100.0;
		
		return "Dropped Grade: " + droppedGrade + "\nAverage: " + averageRounded + " " + "\nHighest Grade: " + highestGrade + "\n";
	}

}
