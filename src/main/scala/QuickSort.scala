package com.knoldus

import scala.language.postfixOps
import scala.collection.immutable.List

class QuickSort {
  def sort(b: List[Int]): List[Int] = {
    if (b.length <= 1)
    {
      list
    }
    else {
      val pivot = b(b.length / 2)
      sort(b filter (pivot >)) ++ (b filter (pivot ==)) ++ //The filter() method is utilized to select all elements of List
        sort(b filter (pivot <))
    }
  }
}
