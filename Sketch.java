/**
 * Description: draws patterns using nested loops
 * @author: EdricLai
*/

import processing.core.PApplet;

public class Sketch extends PApplet { 
  /*
   * called once
   * global variables
   */
  int intWidth = 1200;
  int intHeight = 600;
  float fltQuadWidth = intHeight / 2;
  float fltQuadHeight = intHeight / 2;
  float fltSquare = fltQuadHeight / 60;
  float fltPosX;
  float fltPosY;
  float fltSpaceX;
  float fltSpaceY;

  /**
   * called once
   * initial settings
   */
  public void settings() {
    // screen size
    size(intWidth, intHeight);
  }

  /** 
   * called once
   * initial setup values
   */
  public void setup() {
    background(45, 150, 207);
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }

  /**
   * draw the outlines for all sections
   */
  public void draw_section_outlines(){
    // display attributes
    stroke(0);
    noFill();
    // draws bottom row boxes
    rect(fltQuadWidth * 0, fltQuadHeight, fltQuadWidth, fltQuadHeight);
    rect(fltQuadWidth * 1, fltQuadHeight, fltQuadWidth, fltQuadHeight);
    rect(fltQuadWidth * 2, fltQuadHeight, fltQuadWidth, fltQuadHeight);
    rect(fltQuadWidth * 3, fltQuadHeight, fltQuadWidth, fltQuadHeight);
    // draws top row boxes
    rect(fltQuadWidth * 0, 0, fltQuadWidth, fltQuadHeight);
    rect(fltQuadWidth * 1, 0, fltQuadWidth, fltQuadHeight);
    rect(fltQuadWidth * 2, 0, fltQuadWidth, fltQuadHeight);
    rect(fltQuadWidth * 3, 0, fltQuadWidth, fltQuadHeight);
  }

  /**
   * draws quadrant 1
   */
  public void draw_section1(){
    // translates system coords at q1
    translate(0, fltQuadHeight);
    // initializes variables
    fltSpaceX = fltQuadWidth / 30;
    fltSpaceY = fltQuadHeight / 30;
    // draws pattern
    for(fltPosX = fltSpaceX; fltPosX <= fltQuadWidth - fltSpaceX; fltPosX += fltSpaceX){
      for(fltPosY = fltSpaceY; fltPosY <= fltQuadHeight - fltSpaceY; fltPosY += fltSpaceY){
        fill(255);
        noStroke();
        rect(fltPosX, fltPosY, fltSquare, fltSquare);
      }
    }
  }
  
  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){

  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){

  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

  }

  public void draw_section6(){

  }

  public void draw_section7(){

  }

  public void draw_section8(){

  }
}