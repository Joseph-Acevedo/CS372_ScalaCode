package sorting

import scala.util.Random;
/*
 * An object is similar to a singelton in that only a single instance
 * exists, however it differs in that it doesn't have to be instantiated,
 * it always exists
 */
object Sorting {
  def main(args: Array[String]) {
    var arr : Array[Float] = Array.fill(5)(Random.nextFloat);
    println("Sorting: [" + arr.mkString(",") + "]");
    println("[" + MergeSort(arr).mkString(", ") + "]");
  }
  
  /**
   * Sorts a list into ascending order using merge sort
   * l: An array of any type, so long as the type can be compared
   */
  def MergeSort(l: Array[Float]) : Array[Float] = {
    // Deal with base cases
    if (l.size <= 1) 
      return l;
    else if (l.size <= 2) {
      if (l(0) > l(1))
        return Array(l(1), l(0));
      else 
        return l;
    }
    
    // slice returns a sub-array from [start,end)
    var sortedLeft  : Array[Float] = MergeSort(l.slice(  0, (l.size / 2) ));
    var sortedRight : Array[Float] = MergeSort(l.slice( (l.size / 2), l.size ));
    
    return Merge(sortedLeft, sortedRight);
  }
  
  /**
   * Merges two sorted arrays into a single sorted array (ascending).
   */
  def Merge(left: Array[Float], right: Array[Float]) : Array[Float] = {
    var lIdx : Int = 0;
    var rIdx : Int = 0;
    var zippedArr = new Array[Float](left.size + right.size);
    
    while (lIdx < left.size && rIdx < right.size) {
      if (left(lIdx) <= right(rIdx)) {
        // Add the next element from the left array
        zippedArr(lIdx + rIdx) = left(lIdx);
        lIdx += 1;
      } else {
        // Add the next element from the right array
        zippedArr(lIdx + rIdx) = right(rIdx);
        rIdx += 1;
      }
    }
    
    // One of the arrays have been 'emptied'
    if (lIdx == left.size) {
      // add remainder from right, removing empty entries before appending
      return zippedArr.slice(0, lIdx+rIdx) ++ right.slice(rIdx, right.size);
    } else {
      // add remainder from left, removing empty entries before appending
      return zippedArr.slice(0, lIdx+rIdx) ++ left.slice(lIdx, left.size);
    }
  }
}