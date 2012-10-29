public class MatrixChecker{
	public boolean isSymmetrical(int[] src){
		for (int i=0 ; i<src.length/2 ; i++){
			if(src[i]!=src[src.length-1-i]){
				return false;
			}
		}
		return true;
	}
	
	public boolean isSymmetrical(int[][] src){
		if(src.length!=src[0].length){
			return false;
		}
		else{
			for(int i=0 ; i<src.length ; i++){
				for(int j=0 ; j<i ; j++){
					if(src[i][j]!=src[j][i]){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public boolean isTriangular(int[][] src){
		for(int j=0 ; j<src[0].length ; j++){
			for(int i=j+1 ; i<src.length ; i++){
				if(src[i][j]!=0){
					return false;
				}
			}
		}
		return true;
	}
}
					
