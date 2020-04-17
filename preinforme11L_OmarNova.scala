object prueba extends App {
  import math.pow
  // Array con los valores mmeteorológicos, almacenados en la variable clima
  def clima():Array[Array[Array[Int]]] = {
    val arr = Array.ofDim[Int](3,3,3)
    arr(0)(0)(0) = 33
    arr(0)(0)(1) = 35
    arr(0)(0)(2) = 40
    arr(0)(1)(0) = 8
    arr(0)(1)(1) = 8
    arr(0)(1)(2) = 9
    arr(0)(2)(0) = 10
    arr(0)(2)(1) = 10
    arr(0)(2)(2) = 10
    arr(1)(0)(0) = 30
    arr(1)(0)(1) = 28
    arr(1)(0)(2) = 27
    arr(1)(1)(0) = 7
    arr(1)(1)(1) = 8
    arr(1)(1)(2) = 7
    arr(1)(2)(0) = 10
    arr(1)(2)(1) = 10
    arr(1)(2)(2) = 10
    arr(2)(0)(0) = 10
    arr(2)(0)(1) = 9
    arr(2)(0)(2) = 8
    arr(2)(1)(0) = 6
    arr(2)(1)(1) = 6
    arr(2)(1)(2) = 6
    arr(2)(2)(0) = 10
    arr(2)(2)(1) = 10
    arr(2)(2)(2) = 10
    return arr
  }
  
  /*
   	Función promTemp, para calcular el promedio de la temperatura. 
		Se hace uso de la variable s para almacenar el acumulado que se obtiene a partir del ciclo for.
		Después se calcula el promedio utilizando la variable s y dividiéndola en la cantidad de numeros sumados 
   */
  
  
 def promTemp(Clima:Array[Array[Array[Int]]], fila:Int): Int = {
   var s = 0
   for (i <- 0 to 2) {
     s = s + (Clima(fila)(0)(i))
   }
   val prom = s/3
   return prom
 }

 /*
  La función humedadRelativa calula la humedad relativa de cada ciudad
	las variables va y vs representan el vapor de agua y el vapor de agua saturado respectivamente
	Se utiliza un ciclo for para calcular el acumulado de vapor de agua y vapor de agua saturado
	Despues se divide estos valores entre la cantidad de numeros sumados
	Por último se aplica la fórmula de humedad para obtener el resultado
	  
  */
 
 def humedadRelativa(Clima:Array[Array[Array[Int]]], fila:Int): Float = {
   var va = 0
   var vs = 0
   for (x <- 0 to 2) {
     va = va + Clima(fila)(1)(x)
     vs = vs + Clima(fila)(2)(x)
   }
   val va2 = ((va:Float)/3):Float
   val vs2 = ((vs:Float)/3):Float
   
   val humedad = (va2/vs2)*100
   return humedad
 }
 
 /*
  La función puntoRocio calcula el punto de rocío en cada ciudad
	primero se utilizan las dos funciones anteriores para calular la temperatura y la humedad relativa
	Por último, se calcula el punto de rocío mediante la fórmula. 
   
  */
 
 
 
 def puntoRocío(Clima:Array[Array[Array[Int]]], fila:Int): Double = {
   val temp = promTemp(Clima, fila)
   val humedad = humedadRelativa(Clima,fila)
   val a = (humedad/100):Float
   val b = ((1:Float)/(8:Float))
   val Pr = (math.pow(a,b)*(110+temp))-110
   return Pr
 }

 
 
 
  val Clima = clima()
  println("La temperatura promedio de Barrancabermeja es: " + promTemp(clima, 0))
  println("La temperatura promedio de Bucaramanga es: " + promTemp(clima, 1))
  println("La temperatura promedio de Bogotá es: " + promTemp(clima, 2))
  
  println("El promedio de la humedad relativa de Barrancabermeja es: " + humedadRelativa(clima, 0) + "%")
  println("El promedio de la humedad relativa de Bucaramanga es: " + humedadRelativa(clima, 1) + "%")
  println("El promedio de la humedad relativa de Bogotá es: " + humedadRelativa(clima, 2) + "%") 
  
  println("El promedio del punto de rocío de Barrancabermeja es: " + puntoRocío(clima, 0))
  println("El promedio del punto de rocío de Bucaramanga es: "+ puntoRocío(clima, 1))
  println("El promedio del punto de rocío de Bogotá es: " + puntoRocío(clima, 2))
  
  
}