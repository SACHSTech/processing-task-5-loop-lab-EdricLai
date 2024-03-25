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
  float fltSpaceX = fltQuadWidth / 30;
  float fltSpaceY = fltQuadHeight / 30;
  float fltPosX;
  float fltPosY;
  float fltTempCount;
  float fltTempCount2;
  
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
   * initial setup
   */
  public void setup() {
    background(45, 150, 207);
    draw_section_outlines();
    noStroke();
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
    // translates system coords to q1
    translate(fltQuadWidth * 0, fltQuadHeight);

    // draws pattern
    for(fltPosX = fltSpaceX; fltPosX <= fltQuadWidth - fltSpaceX; fltPosX += fltSpaceX){
      for(fltPosY = fltSpaceY; fltPosY <= fltQuadHeight - fltSpaceY; fltPosY += fltSpaceY){
        fill(255);
        rect(fltPosX, fltPosY, fltSquare, fltSquare);
      }
    }
  }

  /**
   * draws quadrant 2
   */
  public void draw_section2(){
    // translates system coords to q2
    translate(-(fltQuadWidth * 0), -(fltQuadHeight));
    translate(fltQuadWidth * 1, fltQuadHeight);

    // initializes variables
    fltTempCount = 0;

    // draws pattern
    for(fltPosX = fltSpaceX; fltPosX <= fltQuadWidth - fltSpaceX; fltPosX += fltSpaceX){
      fltTempCount += 1;
      for(fltPosY = fltSpaceY; fltPosY <= fltQuadHeight - fltSpaceY; fltPosY += fltSpaceY){
        if (fltTempCount % 2 == 0) {
          fill(255);
        }
        else {
          fill(0);
        }
        rect(fltPosX, fltPosY, fltSquare, fltSquare);
      }
    }
  }
  
  /**
   * draws quadrant 3
   */
  public void draw_section3(){
    // translates system coords to q3
    translate(-(fltQuadWidth * 1), -(fltQuadHeight));
    translate(fltQuadWidth * 2, fltQuadHeight);

    // initializes variables
    fltTempCount = 0;

    // draws pattern
    for(fltPosY = fltSpaceY; fltPosY <= fltQuadHeight - fltSpaceY; fltPosY += fltSpaceY){
      fltTempCount += 1;
      for(fltPosX = fltSpaceX; fltPosX <= fltQuadWidth - fltSpaceX; fltPosX += fltSpaceX){
        if (fltTempCount % 2 == 0) {
          fill(255);
        }
        else {
          fill(0);
        }
        rect(fltPosX, fltPosY, fltSquare, fltSquare);
      }
    }
  }

  /**
   * draws quadrant 4
   */
  public void draw_section4(){
    // translates system coords to q4
    translate(-(fltQuadWidth * 2), -(fltQuadHeight));
    translate(fltQuadWidth * 3, fltQuadHeight);

    // initializes variables
    fltTempCount = 0;
    fltTempCount2 = 0;

    // draws pattern
    for(fltPosX = fltSpaceX; fltPosX <= fltQuadWidth - fltSpaceX; fltPosX += fltSpaceX){
      fltTempCount += 1;
      for(fltPosY = fltSpaceY; fltPosY <= fltQuadHeight - fltSpaceY; fltPosY += fltSpaceY){
        fltTempCount2 += 1;
        if (fltTempCount % 2 == 0 || fltTempCount2 % 2 == 0) {
          fill(255);
        }
        else {
          fill(0);
        }
        rect(fltPosX, fltPosY, fltSquare, fltSquare);
      }
    }
  }
  
  /**
   * draws quadrant 5
   */
  public void draw_section5(){
    // translates system coords to q5
    translate(-(fltQuadWidth * 3), -(fltQuadHeight));
    translate(fltQuadWidth * 0, fltQuadHeight);

    // initializes variables
    fltTempCount = -fltSquare;
    
    // draws pattern
    for(fltPosX = fltSpaceX; fltPosX <= fltQuadWidth - fltSpaceX; fltPosX += fltSpaceX){
      fltTempCount -= fltSpaceY;
      for(fltPosY = -fltSpaceY; fltPosY >= fltTempCount; fltPosY -= fltSpaceY){
        fill(255);
        rect(fltPosX, fltPosY, fltSquare, fltSquare);
      }
    }
  }
  
  /**
   * draws quadrant 6
   */
  public void draw_section6(){
    // translates system coords to q6
    translate(-(fltQuadWidth * 0), -(fltQuadHeight));
    translate(fltQuadWidth * 2, fltQuadHeight);

    // initializes variables
    fltTempCount = -fltSquare;
    
    // draws pattern
    for(fltPosX = -fltSpaceX; fltPosX >= -fltQuadWidth + fltSpaceX; fltPosX -= fltSpaceX){
      fltTempCount -= fltSpaceY;
      for(fltPosY = -fltSpaceY; fltPosY >= fltTempCount; fltPosY -= fltSpaceY){
        fill(255);
        rect(fltPosX, fltPosY, fltSquare, fltSquare);
      }
    }
  }

  /**
   * draws quadrant 7
  */
  public void draw_section7(){

  }

  /**
   * draws quadrant 8
  */
  public void draw_section8(){

  }
}