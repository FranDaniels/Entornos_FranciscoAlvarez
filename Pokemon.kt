open class Pokemon {
    var nombre:String=""
    var precio:Int=0
    var valoracion:Int=0

    constructor()

    constructor(nombre:String,precio:Int,valoracion:Int){
        this.nombre=nombre
        this.precio=precio
        this.valoracion=valoracion
    }


    open fun mediaCalidad(): Int {
        var media=0
        try {
            media=precio%valoracion
        }catch (e:Exception){
            return 0
        }
        return media
    }

    override fun toString(): String {
        return "Pokemon(nombre='$nombre', precio=$precio, valoracion=$valoracion)"
    }

}