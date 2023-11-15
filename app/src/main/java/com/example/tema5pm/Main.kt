package com.example.tema5pm

fun main() {
//    1. Escribe una función que tome una cadena como parámetro e imprima su longitud.
    var cadena = "Soy una cadena"
    println(cadena.length)

//    2. Comparación de Cadenas: Crea dos cadenas y utiliza el método equals para determinar si
//    son iguales.
    var cadena2 = "soy una cadena"
    println(cadena.equals(cadena2))

//    3. Utiliza el método compareTo para comparar dos cadenas y muestra el resultado.
    println(cadena.compareTo(cadena2))

//    4. Toma una cadena y conviértela completamente a mayúsculas.
    cadena2 = cadena2.uppercase()

//    5. Haz lo mismo, pero esta vez conviértela completamente a minúsculas.
    cadena2 = cadena2.lowercase()

//    6. Toma una cadena con espacios al principio y al final. Utiliza trim para eliminar esos espacios.
    var cadena_espacios = " Soy   una cadena  con   espacios "
    println(cadena_espacios.trim())

//    7. Dada una cadena larga, extrae una subcadena de la posición 5 a la 10.
    var cadena_larga = "Soy una cadena larga, pero larga larga"
    println(cadena_larga.slice(5..10))

//    8. Reemplaza todas las ocurrencias de un cierto carácter en una cadena con otro carácter.
    println(cadena_larga.replace("a", "i"))

//    9. Divide una cadena en un array de subcadenas utilizando un carácter específico como separador.
    var array_cadena = cadena.split(" ")
    println(array_cadena)

//    10. Crea dos cadenas y únelas usando el operador +
    var cadenahola = "hola"
    var cadenaque = "que tal"
    var cadena_final = cadenahola + cadenaque
    var nueva_cadena = array_cadena.joinToString(" ")
    println(nueva_cadena)

//    11. Crea una cadena de formato que incluya marcadores de posición y luego rellenarlos con
//    valores.
    var formato = "EN 4k"
    var cadena_formato = "Soy una cadena con formato: %s".format(formato)

//    12. Utiliza substring para extraer una parte de una cadena, especificando los índices de
//    inicio y final.
    println(cadena_larga.substring(2,4))

}