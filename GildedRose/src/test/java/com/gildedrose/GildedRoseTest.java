package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
  static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
  static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
  static final String AGEDBRIE = "Aged Brie";
  static final String CONJURED = "Conjured";


  /*-------------------------------------------------------------
                        SULFURAS TEST
  -------------------------------------------------------------*/
  @Test
  @DisplayName("Test SULFURAS 1")
  void testSulfuras1(){
    Item item1 = new Item(SULFURAS, 0, 1);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,0);
    assertEquals(app.items[0].quality,1);
  }
  @Test
  @DisplayName("Test SULFURAS 2")
  void testSulfuras2(){
    Item item1 = new Item(SULFURAS, -1, 1);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-1);
    assertEquals(app.items[0].quality,1);
  }
  @Test
  @DisplayName("Test SULFURAS 3")
  void testSulfuras3(){
    Item item1 = new Item(SULFURAS, 3, 12);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,3);
    assertEquals(app.items[0].quality,12);
  }
  @Test
  @DisplayName("Test SULFURAS 4")
  void testSulfuras4(){
    Item item1 = new Item(SULFURAS, -15, 3);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-15);
    assertEquals(app.items[0].quality,3);
  }


  /*-------------------------------------------------------------
                        RANDOM NAME TEST
   -------------------------------------------------------------*/
  @Test
  @DisplayName("Test RANDOM NAME 1 ")
  void testRandomName1(){
    Item item1 = new Item("random", 0, 0);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-1);
    assertEquals(app.items[0].quality,0);
  }
  @Test
  @DisplayName("Test RANDOM NAME 2 ")
  void testRandomName2(){
    Item item1 = new Item("test1324", 0, 2);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-1);
    assertEquals(app.items[0].quality,0);
  }
  @Test
  @DisplayName("Test RANDOM NAME 3 ")
  void testRandomName3(){
    Item item1 = new Item("tp", 7, 12);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,6);
    assertEquals(app.items[0].quality,11);
  }
  @Test
  @DisplayName("Test RANDOM NAME 4")
  void testRandomName4(){
    Item item1 = new Item("loulou", -5, 10);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-6);
    assertEquals(app.items[0].quality,8);
  }
  @Test
  @DisplayName("Test RANDOM NAME 5 ")
  void testRandomName5(){
    Item item1 = new Item("rober", -5, -10);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-6);
    assertEquals(app.items[0].quality,-10);
  }
  @Test
  @DisplayName("Test RANDOM NAME 6 ")
  void testRandomName6(){
    Item item1 = new Item("michel", 5, -10);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,4);
    assertEquals(app.items[0].quality,-10);
  }


  /*-------------------------------------------------------------
                        BACKSTAGE TEST
   -------------------------------------------------------------*/
  @Test
  @DisplayName("Test BACKSTAGE 1")
  void testBackstage1(){
    Item item1 = new Item(BACKSTAGE, 0, 49);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-1);
    assertEquals(app.items[0].quality,0);
  }
  @Test
  @DisplayName("Test BACKSTAGE 2")
  void testBackstage2(){
    Item item1 = new Item(BACKSTAGE, 0, 46);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-1);
    assertEquals(app.items[0].quality,0);
  }
  @Test
  @DisplayName("Test BACKSTAGE 3")
  void testBackstage3(){
    Item item1 = new Item(BACKSTAGE, 11, 49);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,10);
    assertEquals(app.items[0].quality,50);
  }
  @Test
  @DisplayName("Test BACKSTAGE 4")
  void testBackstage4(){
    Item item1 = new Item(BACKSTAGE, 3, 35);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,2);
    assertEquals(app.items[0].quality,38);
  }

  @Test
  @DisplayName("Test BACKSTAGE 5")
  void testBackstage5(){
    Item item1 = new Item(BACKSTAGE, 7, 15);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,6);
    assertEquals(app.items[0].quality,17);
  }
  @Test
  @DisplayName("Test BACKSTAGE 6")
  void testBackstage6(){
    Item item1 = new Item(BACKSTAGE, 12, 49);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,11);
    assertEquals(app.items[0].quality,50);
  }
  @Test
  @DisplayName("Test BACKSTAGE 7")
  void testBackstage7(){
    Item item1 = new Item(BACKSTAGE, 13, 25);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,12);
    assertEquals(app.items[0].quality,26);
  }
  @Test
  @DisplayName("Test BACKSTAGE 8")
  void testBackstage8(){
    Item item1 = new Item(BACKSTAGE, 5, 49);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,4);
    assertEquals(app.items[0].quality,50);
  }
  @Test
  @DisplayName("Test BACKSTAGE 9")
  void testBackstage9(){
    Item item1 = new Item(BACKSTAGE, 1, 60);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,0);
    assertEquals(app.items[0].quality,60);
  }
  @Test
  @DisplayName("Test BACKSTAGE 10")
  void testBackstage10(){
    Item item1 = new Item(BACKSTAGE, 3, 60);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,2);
    assertEquals(app.items[0].quality,60);
  }


  /*-------------------------------------------------------------
                        AGEDBRIE TEST
   -------------------------------------------------------------*/
  @Test
  @DisplayName("Test AGEDBRIE 1")
  void testAgedBrie1(){
    Item item1 = new Item(AGEDBRIE, 0, 12);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-1);
    assertEquals(app.items[0].quality,14);
  }
  @Test
  @DisplayName("Test AGEDBRIE 2")
  void testAgedBrie2(){
    Item item1 = new Item(AGEDBRIE, 0, 60);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,-1);
    assertEquals(app.items[0].quality,60);
  }
  @Test
  @DisplayName("Test AGEDBRIE 3")
  void testAgedBrie3(){
    Item item1 = new Item(AGEDBRIE, 3, 12);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,2);
    assertEquals(app.items[0].quality,13);
  }
  @Test
  @DisplayName("Test AGEDBRIE 4")
  void testAgedBrie4(){
    Item item1 = new Item(AGEDBRIE, 7, 3);
    GildedRose app = new GildedRose(new Item[] {item1});
    app.updateQuality();
    assertEquals(app.items[0].sellIn,6);
    assertEquals(app.items[0].quality,4);
  }

}
