import org.scalatest.FunSuite

class MainTest extends FunSuite {

  test("The clear function should return a text without accent marks, spaces and uppercase letters") {
    assert(Main.prepareText("Acaso hubo búhos acá").equals("acasohubobuhosaca"))
  }

  test("The isPalindromeText function should return a true if the text is palindrome and is cleaned") {
    val text = "acasohubobuhosaca"
    assert(Main.isPalindromeText(text, 0, text.length - 1))
  }

  test("The isPalindrome function should return a true if the text is palindrome") {
    var text = "Acaso hubo búhos acá"
    assert(Main.isPalindrome(text))

    text = "A cavar a Caravaca"
    assert(Main.isPalindrome(text))

    text = "A Colima va mi loca"
    assert(Main.isPalindrome(text))

    text = "Ají traga la lagartija"
    assert(Main.isPalindrome(text))

    text = "A la torre, derrótala"
    assert(Main.isPalindrome(text))

    text = "Alí tomó tila"
    assert(Main.isPalindrome(text))

    text = "Allí ves Sevilla"
    assert(Main.isPalindrome(text))

    text = "Allí si María avisa y así va a ir a mi silla"
    assert(Main.isPalindrome(text))

    text = "¡Ojo! corre poco perro cojo"
    assert(Main.isPalindrome(text))
  }


}
