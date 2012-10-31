boolean finished = false;
int employeeCount = 0;
String tempName = "";
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
	tempId = Integer.parseInt(System.console().readLine());
	
	if(tempName.length()==0||tempId==0){
		finished = true;
	}
}
