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
  

  
}