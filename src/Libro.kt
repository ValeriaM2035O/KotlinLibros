class Libro {


    var titulo: String = ""
    var isbn: String = ""
    var numeroDePag: Int = 0
    var precio: Int = 0
    var cantidadDisp: Int=0

    constructor()

    constructor(titulo: String, isbn: String, numeroDePag: Int, precio: Int, cantidadDisp: Int) {

        this.titulo = titulo
        this.isbn = isbn
        this.numeroDePag = numeroDePag
        this.precio = precio
        this.cantidadDisp = cantidadDisp
    }


    fun prestarLibro (isbn: String, cantidadDisp: Int): Boolean{
        return if (cantidadDisp > 0) {
            this.cantidadDisp -= 1
            true
        } else {
            false
        }
    }
     fun devolverLibro (titulo: String, isbn: String, precio: Int): Int{
         cantidadDisp += 1
             return precio
    }
     fun  mostrarInfo (titulo: String, isbn: String, numeroDePag: Int,precio: Int): String{
         return "libro (titulo='$titulo',isbn= '$isbn', numero de paginas = '$numeroDePag', precio= '$precio')"
     }
}