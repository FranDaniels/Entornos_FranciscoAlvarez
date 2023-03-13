class Entrenador {
    var equipo=ArrayList<GrupoPokemon>()
    var cantidadGrupo:Int=0

    constructor(cantidadGrupo:Int){
        this.cantidadGrupo=cantidadGrupo
    }

    /*fun crearEquipo(){
        do {
            while (equipo.size!=cantidadGrupo){
                aniadirGrupo()
            }
        }while (cantidadGrupo!=equipo.size)
    }*/

    fun creandose():Boolean{
        return !(equipo.size == cantidadGrupo)
    }

    fun aniadirGrupo(g:GrupoPokemon){
        equipo.add(g)
    }

    override fun toString(): String {
        return "Entrenador(equipo=$equipo, cantidadGrupo=$cantidadGrupo)"
    }
}