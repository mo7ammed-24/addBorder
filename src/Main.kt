fun main() {
    print(addBorder(mutableListOf("abc","ded")))
}

fun addBorder(picture: MutableList<String>): MutableList<String> {


    var leftBorder=""
    for(i in 0..(picture[0].length)+1)
        leftBorder=leftBorder.plus("*")

    var pictureWithBoarder=mutableListOf<String>()
    pictureWithBoarder.add(leftBorder)
    for(i in 0 until picture.size){
        var firstStar="*"
        firstStar=firstStar.plus(picture[i])
        firstStar=firstStar.plus("*")

        pictureWithBoarder.add(firstStar)
    }

    pictureWithBoarder.add(leftBorder)

    return pictureWithBoarder

}
