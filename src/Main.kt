fun main() {
val lstLibro = mutableListOf<Libro>()

    val libro1 = Libro("Orgullo y prejuicio", "B8754I36", 200, 50000, 50 )
    val libro2= Libro("Don quijote", "B8825k63", 400, 100000, 40 )
    val libro3 = Libro("100 años de soledad", "B895j54", 500, 150000, 20 )

    lstLibro.add(libro1)
    lstLibro.add(libro2)
    lstLibro.add(libro3)

    println(lstLibro)

    do {
        println(
            """
                  MENU DE OPCIONES
                  1. Pedir prestado libro
                  2. Devolver libro
                  3. Mostrar Informacion del libro
                  4. salir
                  Seleccione opcion:
              """.trimIndent()
        )
        var opcion = readln().toInt()

        when (opcion) {
            1 -> {
                println("Ingrese ISBN del libro que desea obtener:")
                val isbn = readln()
                val libro = lstLibro.find { it.isbn == isbn }

                if (libro != null) {
                    if (libro.prestarLibro(isbn, libro.cantidadDisp)) {
                        println("Libro prestado con éxito. Cantidad disponible: ${libro.cantidadDisp}")
                    } else {
                        println("No hay mas libros disponibles.")
                    }
                } else {
                    println("No se encontró un libro con ese ISBN.")
                }
            }

            2 -> {
                println("Ingrese ISBN del libro que desea devolver:")
                val isbn = readln()
                val libro = lstLibro.find { it.isbn == isbn }

                if (libro != null) {
                    val nuevaCantidad = libro.devolverLibro(libro.titulo, libro.isbn, libro.precio)

                    if (nuevaCantidad >= 0) {
                        println("Libro devuelto con éxito. Cantidad a pagar: $nuevaCantidad")
                    } else {
                        println("No se pudo devolver el libro.")
                    }
                } else {
                    println("No se encontró un libro con ese ISBN.")
                }
            }

            3 -> {
                println("Ingrese ISBN del libro que desea ver:")
                val isbn = readln()
                val libro = lstLibro.find { it.isbn == isbn }

                if (libro != null) {
                    println(libro.mostrarInfo(libro.titulo, libro.isbn, libro.numeroDePag, libro.precio))
                } else {
                    println("No se encontró un libro con ese ISBN.")
                }
            }

            4 -> println("Saliendo del programa")

            else -> println("Opción no válida, intente de nuevo")
        }

    } while (opcion != 4)
    }



