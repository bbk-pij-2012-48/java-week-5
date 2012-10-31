public class GrowingArray{
	
	private int[] id;
	private String[] name;
	
	public GrowingArray(int size){
		id = new int[size];
		name = new String[size];
	}
	
	public void grow(){
		int[] id2 = new int[id.length*2];
		String[] name2 = new String[name.length*2];
		System.arraycopy(id, 0, id2, 0, id.length);
		System.arraycopy(name, 0, name2, 0, name.length);
	}
	
	public void setId(int elt, int value){
		id[elt] = value;
	}
	
	public void setName(int elt, String value){
		name[elt] = value;
	}
	
	public int[] getId(){
		return id;
	}
	
	public String[] getName(){
		return name;
	}
}
