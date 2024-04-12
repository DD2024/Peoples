fun main(args: Array<String>) {

    var likes = 21;
    var remainderOf10 = likes % 10;
    var remainderOf100 = likes % 100;
    var peoplesEnding = if(remainderOf10 ===1 && remainderOf100 !== 11) " человеку"
    else " людям";

    println("Понравилось " + likes + peoplesEnding);



}