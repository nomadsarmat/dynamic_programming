private static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

private static int fcashe(int n){
		if(!cache.containsKey(n)){//Проверяем, находили ли мы данное значение
			cache.put(n, f(n)); //Если нет, то находим и записываем в таблицу
		}
		return cache.get(n);
}
