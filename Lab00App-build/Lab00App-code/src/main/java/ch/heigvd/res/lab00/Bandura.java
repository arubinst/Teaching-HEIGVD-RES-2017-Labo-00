/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Lemdjo
 */
 
 
 /*
 
   @Test
  public void aBanduraShouldMakeBandura() {
    IInstrument bandura = new Bandura();
    String sound = bandura.play();
    Assert.assertEquals("bandura", sound);
  }
 
 */

public class Bandura implements IInstrument {

   private String color = "brown";

   private int soundVolume = 10;

  

   public Bandura() {}

   public String play() {

      return "bandura";

   }

   public int getSoundVolume() {

      return soundVolume;

   }


   public String getColor() {

      return color;

   }

}