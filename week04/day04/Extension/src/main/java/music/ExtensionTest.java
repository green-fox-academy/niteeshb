package main.java.music;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(27, extension.add(24, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(9, extension.add(5, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(10, extension.maxOfThree(5, 10, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(15, extension.maxOfThree(15, 4, 7));
  }

  @Test
  void testMedian_four() {
    assertEquals(6, extension.median(Arrays.asList(10,5,5,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(5, extension.median(Arrays.asList(1,6,4,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}