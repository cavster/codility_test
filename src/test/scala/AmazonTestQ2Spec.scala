import AmazonTestQ2.solution

class AmazonTestQ2Spec  extends UnitSpec {

  "TestQuestionTwo should " - {
    "return INSERT if it only takes one extra letter to the make the new value when the value is the same  " in {
      solution("nice","niece") shouldBe "INSERT e"
    }
    "return INSERT if it only takes one extra letter to the make the new value when it is a different value" in {
      solution("nice","niecx") shouldBe "INSERT x"
    }

    "return REMOVE when you just have to remove a value  " in {
      solution("crow","cow")  shouldBe "REMOVE r"
    }

    "return MOVE if you can just move one value to solve it " in {
      solution("beans","banes")  shouldBe "MOVE e"
    }

    "return IMPOSSIBLE if it takes more then one letter" in {
      solution("listen","silent")  shouldBe "IMPOSSIBLE"
    }

    "return IMPOSSIBLE if it cant be done in one it too big too small ext " in {

      solution("o","odd")  shouldBe "IMPOSSIBLE"
      solution("odd","o")  shouldBe "IMPOSSIBLE"
    }

    "return NOTHING if they are already equal " in {
      solution("","")  shouldBe "NOTHING"
      solution("o","o")  shouldBe "NOTHING"
    }

  }
}