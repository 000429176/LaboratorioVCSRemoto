object preinforme10L_OmarNova {
  
  //Array con las utilidades operacionales de Kellogg's entre los años 2008 a 2017
  
  def Utilidad(): Array[Int] = {
		  var Utilidad = Array(27834, 23789, 30189, 30967, 32501, 32701, 31665, 17155, 4614, 834)
  	  return Utilidad
	}                                       
	
  //Función que cálcula el promedio de los últimos dos años, en la variable prom1; y los dos primeros años, en la variable prom2. Después realiza la resta del prom1 menos prom2, siendo la variable dif.
  
  def difMediaUltPri(Utility : Array[Int]): Int = {
  	val cant = Utility.length
  	val prom1 = (Utility(cant-1) + Utility(cant-2))/2
  	val prom2 = (Utility(0) + Utility(1))/2
  	val dif = prom1 - prom2
  	return dif
  } 
  
  // Función que cálcula la diferencia entre el año de mayor utilidad con el de menor utilidad. Se cálcula la mayor utilidad y menor utilidad utilizando un for y un condicional if, que evalúa cada valor hasta finalmente dejar el mayor y el menor. Finalmente se resta el mayor menos el menor, siendo la variable dif2.    
  
  def difMayorMenor(Utility : Array[Int]): Int = {
  	val cant = Utility.length
  	var mayor = Utility(0)
  	var menor = Utility(0)
  	for (i <- 0 to cant-1) {
  			if (mayor < Utility(i)) {
  					mayor = Utility(i)
  			}
  			if (menor > Utility(i)) {
  					menor = Utility(i)
  			}
  	}
  	val dif2 = mayor - menor
  	return dif2
  }                                             
  
  

  
}