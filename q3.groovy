Matrix tester = new Matrix(2,3);
tester.prettyPrint();

tester.setElement(0,0,1);
tester.setElement(0,1,2);
tester.setElement(0,2,3);
tester.prettyPrint();

tester.setRow(1,"10,9,8");
tester.prettyPrint();

tester.setColumn(2,"20,30");
tester.prettyPrint();

println tester.toString();

tester.setMatrix("1,2;3,4;5,6");
tester.prettyPrint();
