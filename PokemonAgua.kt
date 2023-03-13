class PokemonAgua(s: String, nextInt: Int, nextInt1: Int, s1: String, nextInt2: Int) :Pokemon(){
    var tematica:String=""
    var numeroAmigos:Int=0

    override fun mediaCalidad(): Int {
            var media=0
            try {
                media=precio%valoracion
            }catch (e:Exception){
                return 1
            }
            return media
        }

    override fun toString(): String {
        return "PokemonAgua(tematica='$tematica', numeroAmigos=$numeroAmigos)"
    }
}
