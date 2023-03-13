class PokemonTierra(s: String, nextInt: Int, nextInt1: Int, s1: String, s2: String) :Pokemon(){
    var fechaNac:String=""
    var alias:String=""

    override fun mediaCalidad(): Int {
        var media=0
        try {
            media=valoracion%precio
        }catch (e:Exception){
            return 0
        }
        return media
    }

    override fun toString(): String {
        return "PokemonTierra(fechaNac='$fechaNac', alias='$alias')"
    }
}