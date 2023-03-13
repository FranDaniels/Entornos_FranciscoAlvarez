import kotlin.random.Random

fun main() {
    val entrenadores = ArrayList<Entrenador>()

    var entrenador1: Entrenador

    var pokemon1= Pokemon()
    var grupoPokemon1: GrupoPokemon


    var ayudaCreacion=1
    var eleccionGrupoCrear:Int
    var n = 0
    while (n<2) {
        entrenador1 = Entrenador(Random.nextInt(1, 5))
        while (entrenador1.creandose()) {
            grupoPokemon1 = GrupoPokemon(Random.nextInt(1, 5), "Grupo_" + ayudaCreacion)
            while (grupoPokemon1.creandose()) {

                eleccionGrupoCrear = Random.nextInt(1, 3)
                when (eleccionGrupoCrear) {
                    1 ->
                        pokemon1 = PokemonAgua(
                            "AGUA" + ayudaCreacion,
                            Random.nextInt(0, 100),
                            Random.nextInt(0, 10),
                            "TEM" + ayudaCreacion,
                            Random.nextInt(1, 8)
                        )

                    2 ->
                        pokemon1 = PokemonCielo(
                            "CIELO" + ayudaCreacion,
                            Random.nextInt(0, 100),
                            Random.nextInt(0, 10),
                            Random.nextInt(1, 15),
                            Random.nextInt(1, 20)
                        )

                    3 ->
                        pokemon1 = PokemonTierra(
                            "TIERRA" + ayudaCreacion,
                            Random.nextInt(0, 100),
                            Random.nextInt(0, 10),
                            "FECHA" + ayudaCreacion,
                            "COSTE" + ayudaCreacion
                        )

                }
                grupoPokemon1.aniadirPokemon(pokemon1)
                ayudaCreacion++
            }
            entrenador1.aniadirGrupo(grupoPokemon1)
        }
        println(entrenador1)
        entrenadores.add(entrenador1)
        n++
    }
}