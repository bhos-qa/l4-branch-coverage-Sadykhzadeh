// use vulnerable function from Classroom.kt

fun main() {
  val classroom = Classroom(intArrayOf(1, 2, 3, 4, 5))
  println("Maximum result: ${classroom.maximumResult()}")
  println("Minimum result: ${classroom.minimumResult()}")
  println("Mode of results: ${classroom.findModeOfResults()}")
  println("Number of students: ${classroom.numberOfStudents()}")
  println("Mean of results: ${classroom.meanOfResults()}")
  classroom.sortAscendingOrder()
  classroom.vulnerableFunction()
}