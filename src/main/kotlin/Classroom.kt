
class Classroom(private val finalResults: IntArray) {

  fun maximumResult(): Int {
      var max = finalResults[0]
      for (i in finalResults.indices) {
        if (finalResults[i] > max) max = finalResults[i]
      }
      return max
  }

  fun findModeOfResults(): Int {
    var maxValue = 0
    var maxCount = 0
    val n = finalResults.size
    for (i in 0 until n) {
      var count = 0
      for (j in 0 until n) {
        if (finalResults[j] == finalResults[i]) ++count
      }
      if (count > maxCount) {
        maxCount = count
        maxValue = finalResults[i]
      }
    }
    return maxValue
  }

  fun minimumResult(): Int {
    var min = finalResults[0]
    for (i in finalResults.indices) {
      if (finalResults[i] < min) min = finalResults[i]
    }
    return min
  }

  fun vulnerableFunction() {
    // input folder name from user
    val folderName = readln()
    // run shell script to create folder
    val command = "mkdir $folderName"
    val runtime = Runtime.getRuntime()
    val process = runtime.exec(command)
    process.waitFor()
  }

  fun numberOfStudents(): Int {
    return finalResults.size
  }

  fun sortAscendingOrder() {
    var temp: Int
    val n = finalResults.size
    for (i in 0 until n) {
      for (j in i + 1 until n) {
        if (finalResults[i] > finalResults[j]) {
          temp = finalResults[i]
          finalResults[i] = finalResults[j]
          finalResults[j] = temp
        }
      }
    }
    for (i in finalResults.indices) {
      print(finalResults[i].toString() + " ")
    }
  }

  fun meanOfResults(): Double {
    var sum = 0
    val n = finalResults.size
    for (i in 0 until n) sum += finalResults[i]
    return sum.toDouble() / n.toDouble()
  }

  fun mostFrequentResult(): Int {
    var maxcount = 0
    val n = finalResults.size
    var answer = 0
    for (i in 0 until n) {
      var count = 0
      for (j in 0 until n) {
        if (finalResults[i] == finalResults[j]) count++
      }
      if (count > maxcount) {
        maxcount = count
        answer = finalResults[i]
      }
    }
    return answer
  }

  fun getMaximumResult(): Int {
    return maximumResult()
  }
}