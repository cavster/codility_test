object AmazonTestQ2 {

  //todo shit code need to clean
    def solution(s: String, t: String): String = {
      if(s == t ) "NOTHING"


      else if ((s.length != t.length -1) && (s.length != t.length + 1 ) && (s.length != t.length  ) )"IMPOSSIBLE"
      else {
        val sAsSet =  s.toSeq.diff(t)
        val tAsSet =  t.toSeq.diff(s)

       if(sAsSet.toList.length == 1)"REMOVE " + sAsSet.head
       else if(tAsSet.toList.length == 1)"INSERT " + tAsSet.head

         else if (sAsSet.isEmpty && tAsSet.isEmpty && canDoInOneMove(s,t).isDefined)  s"MOVE ${canDoInOneMove(s,t).get}"
       else  "IMPOSSIBLE"
      }
    }



    def canDoInOneMove(s:String,t:String):Option[String] = {
      def canMakeString(s:String,t:String,currantIndex:Int,charToCheck:String):Option[String] = {

        def checkChar(sWithCurrantCheckRemoved:String,index:Int,charToCheck:String):Option[String] = {

          if (sWithCurrantCheckRemoved.patch(index, charToCheck, 0) == t) Some(charToCheck)
          else None
        }
        val sWithCurrantCheckRemoved:String =  s.zipWithIndex.filter(_._2 != currantIndex).map(_._1).mkString

        sWithCurrantCheckRemoved.zipWithIndex.flatMap(swi=> checkChar(sWithCurrantCheckRemoved,swi._2, charToCheck)).headOption
      }
      //hmmm need to remove the char first

      s.zipWithIndex.flatMap(char => canMakeString(s,t,char._2,char._1.toString) ).headOption
    }
}
