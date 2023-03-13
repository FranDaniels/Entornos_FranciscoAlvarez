class PokemonCielo(s: String, nextInt: Int, nextInt1: Int, nextInt2: Int, nextInt3: Int) :Pokemon() {
    var alturaVuelo:Int=0
    var horasVuelo:Int=0

    override fun mediaCalidad(): Int {
        var media=0
        try {
            media=alturaVuelo%precio
        }catch (e:Exception){
            return 0
        }
        return media
    }

    override fun toString(): String {
        return "PokemonCielo(alturaVuelo=$alturaVuelo, horasVuelo=$horasVuelo)"
    }
}