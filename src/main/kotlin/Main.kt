fun main(args: Array<String>) {

    var likes = 211;
    var remainder = likes % 10;
    var peoplesEnding = if(remainder ===1 && likes!==11 && likes % 100 !== 11) " человеку"
    else " людям";
    println("Понравилось " + likes + peoplesEnding);




}