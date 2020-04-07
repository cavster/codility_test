import SmallestPositiveInteger.solution

class SmallestPositiveIntegerSpec  extends UnitSpec{

//  For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//  Given A = [1, 2, 3], the function should return 4.
//
//  Given A = [−1, −3], the function should return 1.
  "TestQuestionOne should "  - {
    "return 1 " in {

      val testOneArray:Array[Int] = Array(1,3,6,4,1,2)
      val testTwoArray:Array[Int] = Array(1,2,3)
      val testThreeArray:Array[Int] = Array(-1 -3)
      solution(testOneArray) shouldBe 5
      solution(testTwoArray) shouldBe 4
      solution(testThreeArray) shouldBe 1
    }
  }
 }
