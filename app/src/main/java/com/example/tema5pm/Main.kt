package com.example.tema5pm

import java.lang.Exception
import java.lang.StringBuilder
import kotlin.math.sqrt

fun main() {
////    1. Escribe una función que tome una cadena como parámetro e imprima su longitud.
//    var cadena = "Soy una cadena"
//    println(cadena.length)
//
////    2. Comparación de Cadenas: Crea dos cadenas y utiliza el método equals para determinar si
////    son iguales.
//    var cadena2 = "soy una cadena"
//    println(cadena.equals(cadena2))
//
////    3. Utiliza el método compareTo para comparar dos cadenas y muestra el resultado.
//    println(cadena.compareTo(cadena2))
//
////    4. Toma una cadena y conviértela completamente a mayúsculas.
//    cadena2 = cadena2.uppercase()
//
////    5. Haz lo mismo, pero esta vez conviértela completamente a minúsculas.
//    cadena2 = cadena2.lowercase()
//
////    6. Toma una cadena con espacios al principio y al final. Utiliza trim para eliminar esos espacios.
//    var cadena_espacios = " Soy   una cadena  con   espacios "
//    println(cadena_espacios.trim())
//
////    7. Dada una cadena larga, extrae una subcadena de la posición 5 a la 10.
//    var cadena_larga = "Soy una cadena larga, pero larga larga"
//    println(cadena_larga.slice(5..10))
//
////    8. Reemplaza todas las ocurrencias de un cierto carácter en una cadena con otro carácter.
//    println(cadena_larga.replace("a", "i"))
//
////    9. Divide una cadena en un array de subcadenas utilizando un carácter específico como separador.
//    var array_cadena = cadena.split(" ")
//    println(array_cadena)
//
////    10. Crea dos cadenas y únelas usando el operador +
//    var cadenahola = "hola"
//    var cadenaque = "que tal"
//    var cadena_final = cadenahola + cadenaque
//    var nueva_cadena = array_cadena.joinToString(" ")
//    println(nueva_cadena)
//
////    11. Crea una cadena de formato que incluya marcadores de posición y luego rellenarlos con
////    valores.
//    var formato = "EN 4k"
//    var cadena_formato = "Soy una cadena con formato: %s".format(formato)
//
////    12. Utiliza substring para extraer una parte de una cadena, especificando los índices de
////    inicio y final.
//    println(cadena_larga.substring(2, 4))
//
//    //    Operaciones con Nullable:
////    13. Define dos variables a y b con valores nulos e intenta
////    realizar operaciones matemáticas (suma, resta,multiplicación) con ellas.
////    Maneja adecuadamente los casos de valores nulos.
//    var a = null
//    var b = null
//
//    var suma = a + b
//
//
//    //    Operador Elvis:
////    14. Utiliza el operador elvis (?:) para asignar un valor predeterminado a una variable
////    si esta es nula.
//    var elvis = null ?: "presley"
//    println(elvis)
//
//
//    //    Seguridad con Smart Cast:
////    15. Crea una función que tome un parámetro de tipo Any y comprueba si es de tipo String.
////    Si es así, imprime su longitud. Utiliza smart cast para trabajar de manera segura con el tipo.
//    fun cast(any: Any) {
//        if (any is String) {
//            println(any.length)
//        } else {
//            println("No es un string")
//        }
//    }
//
//    //    Manejo de Excepciones:
////    16. Escribe una función que divida dos números ingresados por el usuario. Implementa el manejo
////    de excepciones para el caso en que el divisor sea cero o si se ingresa un valor no numérico.
//    fun dividir(a: Int, b: Int) {
//        if (b == 0) {
//            throw Exception("NO SE PUEDE DIVIDIR ENTRE 0")
//        } else {
//            println(a / b)
//        }
//    }
//
//    //    Operador de Lectura Segura (readLine):
////    17. Utiliza readLine() para leer una entrada del usuario. Asegúrate de manejar el caso en que
////    el usuario ingrese algo que no pueda convertirse a un tipo específico.
//    try {
//        println("Ingresa un numero")
//        var numeroTexto: String? = readLine()
//        var numero = numeroTexto?.toInt()
//        println(numero)
//    }catch (e:Exception){
//        println("NO HAS INGRESADO UN NUMERO")
//    }
//

//    //    Operadores Matemáticos:
////    18. Crea una función que acepte dos números y realice operaciones matemáticas básicas
////    (suma, resta, multiplicación, división). Maneja casos especiales, como la división por cero.
//    fun dividir(a: Int, b: Int) {
//        if (b == 0) {
//            throw Exception("NO SE PUEDE DIVIDIR ENTRE 0")
//        } else {
//            println(a / b)
//        }
//    }

//    //    Casting Seguro e Inseguro:
////    19. Declara una variable de tipo Any y realiza un casting seguro e inseguro a otros tipos.
////    Maneja los casos donde el casting inseguro podría generar una excepción.
//    fun cast(any: Any) {
//        if (any is String) {
//            println(any.length)
//        } else {
//            throw Exception("NO ES UN STRING")
//        }
//    }

//    //    Uso de try, catch y finally:
////    20. Escribe un bloque try que contenga código propenso a errores. En el bloque catch, maneja
////    las excepciones y, en el bloque finally, imprime un mensaje independientemente de si se lanzó
////    una excepción o no.
//    try {
//        println("Ingresa un numero")
//        var numeroTexto: String? = readLine()
//        var numero = numeroTexto?.toInt()
//        println(numero)
//    }catch (e:Exception){
//        println("NO HAS INGRESADO UN NUMERO")
//    }finally {
//        println("mensaje independientemente")
//    }

//    //    21. Infix Functions:
////    Crea una clase Point con propiedades x e y. Implementa una función infix que calcule la
////    distancia entre dos puntos.
//    class Point(val x: Int, val y: Int)
//
//    infix fun Point.distancia(p: Point): Double {
//        var x = this.x - p.x
//        var y = this.y -p.y
//
//        return sqrt((x*x).toDouble() + (y*y).toDouble())
//    }
//
//    var p1 = Point(2,2)
//    var p2 = Point(1,1)
//    var distancia = p1 distancia p2
//    println(distancia)


////    22. Lazy y Lateinit:
////    Define una variable lazy que almacene la suma de dos números. La suma debe calcularse solo
////    cuando se accede a la variable. Luego, usa lateinit para inicializar una variable de tipo
////    String antes de asignarle un valor.
//    val suma by lazy {
//        30 + 39
//    }
//    println("Suma -> "+suma)
//
//    lateinit var string:String
//    string = "hola"
//    print(string)


////    23. With:
////    Utiliza la función with para configurar un objeto StringBuilder. Agrega tres líneas de texto
////    al objeto y luego imprime el resultado.
//    var b : StringBuilder = StringBuilder()
//
//    with(b){
//        append("hola ")
//        append("que ")
//        append("tal")
//    }
//    println(b)


////    24. Apply:
////    Crea una clase Person con propiedades como name, age, y address. Utiliza la función apply para
////    construir una instancia de Person con valores específicos.
//    class Person(var name:String, var age:Int, var address:String)
//    var persona = Person("Miguel",21,"csmn73")
//
//    println(persona.name)
//
//    persona.apply {
//        name = "juju"
//        age = 99
//        address = "calle amor"
//    }
//
//    println(persona.name)


////    25. Run:
////    Define una función calculateArea que toma la longitud y el ancho de un rectángulo y devuelve
////    su área. Luego, utiliza run para imprimir el área de un rectángulo específico.
//
//    class Rectangulo(var long:Double, var ancho:Double)
//    var r = Rectangulo(5.0,3.0)
//    r.run {
//        println(long*ancho)
//    }




//    26. Let:
//    Declara una cadena nullable y utiliza la función let para
//            imprimir su longitud solo si no es nula.


//    27. Also:
//    Crea una lista de números y utiliza la función also para
//    imprimir un mensaje antes y después de aplicar una
//    operación a cada elemento de la lista.


}