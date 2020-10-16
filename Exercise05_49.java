import java.util.*;

public class Exercise05_49 {

  public static void main(String [] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = keyboard.nextLine();
    int vowel = 0;
    int consonant = 0;

    for(int count = 0; count < s.length(); count++) {

      switch(s.charAt(count)) {
        case 'A':
            vowel++; break;
        case 'a':
            vowel++; break;
        case 'E':
            vowel++; break;
        case 'e':
            vowel++; break;
        case 'I':
            vowel++; break;
        case 'i':
            vowel++; break;
        case 'O':
            vowel++; break;
        case 'o':
            vowel++; break;
        case 'U':
            vowel++; break;
        case 'u':
            vowel++; break;
        case ' ':
            break;
        default:
          consonant++;
        }
}

    System.out.println("The nummber of vowel is " +vowel);
    System.out.println("The number of consonants is " +consonant);


  }

}
