fun main(){

    val x_uno: Double = 4.0
    val y_uno: Double = 3.0
    val x_dos: Double = -3.0
    val y_dos: Double = -2.0


    val resta_y = y_dos-y_uno
    val resta_x = x_dos-x_uno
    val pendiente: Double = resta_y/resta_x

    println("El punto P1 es: $x_uno y $y_uno")
    println("El punto P2 es: $x_dos y $y_dos")
    println("La pendiente de la recta dada es $pendiente")

}