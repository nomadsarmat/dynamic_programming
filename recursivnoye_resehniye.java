private static int f(int n){
        if(n==0 || n==1) return 1; // Проверка на начальное значение

        if(n%2==0){ //Проверка на чётность
                return f(n/2)+f(n/2-1); // Вычисляем по формуле для чётных индексов,
                                       //  ссылаясь на предыдущие значения
        }else{
                return f((n-1)/2)-f((n-1)/2-1);  // Вычисляем по формуле для нечётных
                                                //индексов, ссылаясь на предыдущие значения
        }
}
