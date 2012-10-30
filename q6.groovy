boolean finished = false;
boolean hit = false;
int[] target = new int[3];
char response = 'n';
Target gameTarget;

while(!finished){
	hit = false;
	gameTarget = new Target(10);
	gameTarget.init();
	
	while(!hit){
		println "Here they come! Try to bring the plane down!";
		print "Enter an X-coordinate: ";
		target[0] = Integer.parseInt(System.console().readLine());
		print "Enter a Y-coordinate: ";
		target[1] = Integer.parseInt(System.console().readLine());
		print "Enter a Z-coordinate: ";
		target[2] = Integer.parseInt(System.console().readLine());
		
		println gameTarget.fire(target[0],target[1],target[2]);
		if(gameTarget.fire(target[0],target[1],target[2])==Result.HIT){
			hit = true;
			print "Would you like to play again? ";
			response = (char)System.console().readLine();
			if(response=='n'){
				finished = true;
			}
		}
	}
}
