private static int f(int n){
if(n<2) return 1; //Может, нам и вычислять ничего не нужно?

int[] fs = int[n]; //Создаём массив для значений
fs[0]=fs[1]=1; //Задаём начальные состояния

for(int i=2; i<n; i++){
	if(i%2==0){ //Проверяем чётность
		fs[i]=fs[i/2]+fs[i/2-1];
	}else{
		fs[i]=fs[(i-1)/2]+fs[(i-1)/2-1]
	}
}

return fs[n-1];
}
