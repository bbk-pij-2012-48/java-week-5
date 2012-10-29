ArrayCopier newCopier = new ArrayCopier();
int[] src = [1,2,3,4,5];
int[] dst1 = new int[5];
int[] dst2 = new int[4];
int[] dst3 = new int[6];

newCopier.copy(src, dst1);
newCopier.copy(src, dst2);
newCopier.copy(src, dst3);

for(int i=0 ; i<5 ; i++){
	print dst1[i];
}
println"";

for(int i=0 ; i<4 ; i++){
	print dst2[i];
}
println"";

for(int i=0 ; i<6 ; i++){
	print dst3[i];
}
println"";

