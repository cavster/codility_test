

object AmazonTestQ1 {
//word crop

  def solution(message: String, k: Int): String = {
    // write your code in Scala 2.12
    val sentenceWhole = message.take(k + 1)
    def isLastWordChopped(sentenceWhole:String,k:Int):Boolean ={

      if(sentenceWhole.take(k + 1).reverse.head.toString == " "  || sentenceWhole.length < k)false
      else  true
    }
    def removeLastWord(sentenceWhole:String):String = {
      val sentenceWholeMinusLastWord = sentenceWhole.replaceAll(" [^ ]+$", "")
      sentenceWholeMinusLastWord

    }
    def removeDubSpaces(sentenceWhole:String) = sentenceWhole.trim.replaceAll(" +", " ")
    if(isLastWordChopped(sentenceWhole.trim,k)) removeDubSpaces(removeLastWord(sentenceWhole))
    else removeDubSpaces(sentenceWhole)
  }
}
