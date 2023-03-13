class GrupoPokemon {
    var grupo=ArrayList<Pokemon>()
    var nombreGrupo:String=""
    var cantidadCreada:Int=0

    constructor(c:Int, n:String){
        cantidadCreados++
        cantidadCreada=c
        nombreGrupo = n
    }

    companion object {
        var cantidadCreados: Int = 0
    }

    fun creandose():Boolean{
        return (!(grupo.size == cantidadCreada))
    }

    fun crearGrupo(cantidadGrupo:Int,p: Pokemon){
        do {
            while (grupo.size!=cantidadCreada){
                aniadirPokemon(p)
                cantidadCreada++
            }
            nombreGrupo="Grupo ${grupo.size+1}"
        }while (cantidadGrupo!=grupo.size)
    }

    fun aniadirPokemon(p:Pokemon){
            grupo.add(p)


    }

    fun precioMedio():Int{
        var valor = 0
        for (i in 0 until grupo.size){
            valor += grupo.get(i).precio
        }
        return (valor/grupo.size)
    }

    override fun toString(): String {
        return "GrupoPokemon(grupo=$grupo, nombreGrupo='$nombreGrupo', cantidadCreada=$cantidadCreada)"
    }

}