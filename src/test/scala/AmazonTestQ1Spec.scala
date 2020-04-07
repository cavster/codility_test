import AmazonTestQ1.solution
class AmazonTestQ1Spec extends UnitSpec {



  "TestQuestionOne should "  - {
    "Codility We test coders should be Codility We" in {


      solution("Codility We test coders",14) shouldBe "Codility We"

    }



    "return the whole thing if k is bigger" in {


      solution("Why not",100) shouldBe "Why not"


    }

    "remove spaces at the end in" in {


      solution("Why not       ",100) shouldBe "Why not"


    }

    "return spaces that are greater then one space  " in {


      solution("Why  not",100) shouldBe "Why not"


    }

    "The quick brown fox jumps over the lazy dog " in {

      solution("The quick brown fox jumps over the lazy dog",39) shouldBe "The quick brown fox jumps over the lazy"
    }
  }
}
