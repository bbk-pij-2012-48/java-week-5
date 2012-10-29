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
		if(row<matrix.length){ 				   // valid row reference
			String[] valueArray = value.split("\\,");
			if(valueArray.length==matrix[0].length){   // valid value string
				for(int i=0 ; i<matrix[0].length ; i++){
					matrix[row][i] = Integer.parseInt(valueArray[i]);
				}
			}
		}
	}			
}
