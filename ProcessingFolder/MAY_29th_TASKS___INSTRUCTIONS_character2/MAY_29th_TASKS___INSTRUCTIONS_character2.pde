walker joe;
boolean[] keys = new boolean[4]; // Array to hold key states for W, A, S, D

void setup(){
  size(1600,900);
  joe = new walker(0,0);
}

void draw(){
  background(255); // Clear the background on every frame
  joe.display();
  checkMovement();
}

void keyPressed(){
  if (key == 'w' || key == 'W') {
    keys[0] = true;
  } else if (key == 'd' || key == 'D') {
    keys[1] = true;
  } else if (key == 's' || key == 'S') {
    keys[2] = true;
  } else if (key == 'a' || key == 'A') {
    keys[3] = true;
  }
}

void keyReleased(){
  if (key == 'w' || key == 'W') {
    keys[0] = false;
  } else if (key == 'd' || key == 'D') {
    keys[1] = false;
  } else if (key == 's' || key == 'S') {
    keys[2] = false;
  } else if (key == 'a' || key == 'A') {
    keys[3] = false;
  }
}

void checkMovement(){
  if (keys[0]) {
    joe.move(0); // Move up
  }
  if (keys[1]) {
    joe.move(1); // Move right
  }
  if (keys[2]) {
    joe.move(2); // Move down
  }
  if (keys[3]) {
    joe.move(3); // Move left
  }
}