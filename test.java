Stream powerOfTen = Stream.of(1, 10, 100, 1000);
Integer[] array = powerOfTen.toArray(size -> new Integer[size]);
System.out.println(Arrays.toString(array));

/**
  * This is the best way to convert a stream to an array in Java SE 8
  * Because you can just use the toArray() method of Stream class 
  * With the constructor reference of T[]::new -> array reference
  * an array of specified type and is equal to lambda expression int i -> new T[i]
  */
T[] arrayOfT = streamOfT.toArray(T[]::new); // array reference that takes the value and returns the array of specified type

// remember to use mapToInt()for primitive data types

Stream<String> cities = Stream.of("London", "Paris", "Tokyo");
String[] arrayOfCities = cities.toArray(String[]::new);
System.out.println(Arrays.toString(arrayOfCities));
