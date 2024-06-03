walker joe;

void setup(){
  size(1500,700);
  joe = new walker(0,0);
}

void draw(){
  background(255); // Clear the background on every frame
  joe.display();
}

void keyPressed(){
  if (keyCode == UP) {
    joe.move(0);
  } else if (keyCode == RIGHT) {
    joe.move(1);
  } else if (keyCode == DOWN) {
    joe.move(2);
  } else if (keyCode == LEFT) {
    joe.move(3);
  }
}