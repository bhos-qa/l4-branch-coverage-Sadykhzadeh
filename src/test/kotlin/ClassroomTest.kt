package org.example

import Classroom
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ClassroomTest {
  private var classroom: Classroom? = Classroom(intArrayOf(100, 0, 50, 50, 100, 60, 73, 85, 58, 49))

  @Test
  @DisplayName("Test maximumResult()")
  fun testMaximumResult() {
    assertEquals(100, classroom?.maximumResult())
  }

  @Test
@DisplayName("Test findModeOfResults()")
  fun testFindModeOfResults() {
    assertEquals(100, classroom?.findModeOfResults())
  }

  @Test
  @DisplayName("Test minimumResult()")
  fun testMinimumResult() {
    assertEquals(0, classroom?.minimumResult())
  }

  @Test
  @DisplayName("Test numberOfStudents()")
  fun testNumberOfStudents() {
    assertEquals(10, classroom?.numberOfStudents())
  }

}
