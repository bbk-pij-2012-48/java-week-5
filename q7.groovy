boolean finished = false;
int employeeCount = 0;
String tempName = "";
String holdId = "";
int tempId = 0;
GrowingArray employees = new GrowingArray(1);
println "To terminate, leave name blank or enter 0 for id";

print "Enter employee name: ";
tempName = System.console().readLine();
print "Enter employee id: ";
tempId = Integer.parseInt(System.console().readLine());
if(tempName.length()==0||tempId==0){
	finished = true;
}

while(!finished){
	employees.setId(employeeCount, tempId);
	employees.setName(employeeCount, tempName);
	employeeCount++;
	
	if(employees.ArrayLength()==employeeCount){
		employees.grow();	
	}
	
	print "Enter employee name: ";
	tempName = System.console().readLine();
	print "Enter employee id: ";
	holdId = System.console().readLine();
	if(holdId.length()==0){
		tempId = 0;
	}
	else{
		tempId = Integer.parseInt(holdId);
	}
	
	if(tempName.length()==0||tempId==0){
		finished = true;
	}
}

int[] id = employees.getId();
String[] name = employees.getName();

for(int i=0 ; i<employeeCount ; i++ ){			// Print staff with even id, or name starting S
	if(id[i]%2==0||name[i].charAt(0)=='S'){
		println name[i] + "  " + id[i];
	}
}
