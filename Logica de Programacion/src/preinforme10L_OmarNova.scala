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
  
  // Función para calcular la mediana. Primero se ordena el Array de menor a mayor utilizando el método de ordenamiento burbuja para posteriormente calcular la mediana, siendo el valor que divide en dos partes iguales el Array. 
  
  def mediana(Utility : Array[Int]): Float = {
    val cant = Utility.length
    var orden = 0
    for (x <- 0 to cant-1) {
        for (i <- 0 to cant-2) {
            if (Utility(i) > Utility(i+1)) {
                orden = Utility(i)
                Utility(i)= Utility(i+1)
                Utility(i+1) = orden
            }
        }
    }
    val mitad = cant/2
    if (cant%2==0) {
        var median = ((Utility(mitad)+Utility(mitad-1)):Float)/2
        return median
    } else {
        var median = Utility(mitad+1)
        return median
    }
  }
  
  //Función que cálcula la media mediante un for, sumando todos los valores del Array y posteriormente dividiéndolo entre el número de valores que contiene. Con el cálculo de la mediana de la función anterior, se cálcula la diferencia entre la mediana y la media.
  
  def mediaMediana(Utility : Array[Int]): Unit = {
    val Mediana = mediana(Utility)
    val cant = Utility.length
    var s = 0
    for (i <- 0 to cant-1) {
      s += Utility(i)
    }
    val prom = (s: Float)/cant
    val dif = Mediana - prom
    println("La mediana es " + Mediana + " y el promedio es " + prom + "; la diferencia entre la mediana y la media es " + dif)  
  }
  
  //Función que cálcula el porcentaje que aporta cada año a la utilidad operacional acumulada. Se cálcula la utilidad acumulada mediante un for, sumando cada uno de los valores en cada iteración. Por último, mediante una regla de 3 sencilla, se cálcula el porcentaje que cada año le aporta al acumulado.
  
    def porcentajeAcum(Utility : Array[Int]):Unit = {
    var s = 0
    var porc = (0: Float)
    val cant = Utility.length 
    for (i <- 0 to cant-1) {
      s += Utility(i)  
    }
    var a = 2007
    for (i <- 0 to cant-1) {
      porc = ((Utility(i)*100):Float)/(s:Float)
      a += 1
      println("El porcentaje que aporta el año " + a + " al acumulado es " + porc + "%")
    }
  }
  
  //Función que cálcula el déficit del año 2017 comparado con el año anterior, es decir, 2016. Estos dos años son los últimos, por lo que simplemente se realiza un lenght para obtener el numero de elementos que contiene el Array y posteriormente restar los últimos dos.
  
  def deficitCOP(Utility : Array[Int]):Int = {
    val cant = Utility.length
    val deficit = Utility(cant-2) - Utility(cant-1)
    return deficit
  }
  
  
  
}

  