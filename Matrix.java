public class Matrix{
	
	private int[][] matrix;
	
	public Matrix(int row, int column){
		matrix = new int[row][column];
		
		for(int i=0 ; i<row ; i++){
			for(int j=0 ; j<column ; j++){
				matrix[i][j] = 1;
			}
		}
	}
	
	public void setElement(int row, int column, int newValue){
		if(row<matrix.length && column<matrix[0].length){
			matrix[row][column] = newValue;
		}
	}
	
	public void prettyPrint(){
		System.out.println("");
		for(int i=0 ; i<matrix.length ; i++){
			for(int j=0 ; j<matrix[0].length ; j++){
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public void setRow(int row, String value){
		if(row<matrix.length){ 				// valid row reference
			int commaCount = 0;
			for(int i=0 ; i<value.length() ; i++){
				if(value.charAt(i)==',')
					commaCount++;
			}
			if(commaCount==matrix[0].length-1){	// valid value string
				String[] valueArray = value.split("\\,");
			}
			//continue here
		}
	}
			
}
