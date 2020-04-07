/*

This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Copyright 2009–2020 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited
 */
import scala.collection.mutable
object SmallestPositiveInteger {
  //todo make this more functional
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12

    val results: mutable.Set[Int] = mutable.Set.empty[Int]

    for (x <- 1 to a.length + 1) {
      val check: Option[Int] = a.find(element => element == x)

      if (check.isDefined) ()
      else results.add(x)
    }
    if(results.isEmpty)1 else results.min
  }
}
