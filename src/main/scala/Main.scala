import java.text.Normalizer
import java.text.Normalizer.Form


object Main extends App {

  @scala.annotation.tailrec
  def isPalindromeText(text: String, topIndex: Int, bottomIndex: Int): Boolean = {
    if(text.length == 0) false
    else if (text.length - 1 == topIndex) true
    else if (text.charAt(topIndex).equals(text.charAt(bottomIndex))) isPalindromeText(text, topIndex + 1, bottomIndex - 1)
    else false
  }

  def prepareText(text: String): String = {
    import java.text.Normalizer.normalize
    normalize(text, Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}\\p{IsM}\\p{IsLm}\\p{IsSk}]+", "")
      .replaceAll("\\s", "").replaceAll("[^a-zA-Z]", "").toLowerCase
  }


  def isPalindrome(textToEvaluate : String) : Boolean = {
    val textToEvaluateCleaned = prepareText(textToEvaluate)
    isPalindromeText(textToEvaluateCleaned,0, textToEvaluateCleaned.length -1 )
  }

}