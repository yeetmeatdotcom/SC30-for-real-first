// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"
// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

// State variable for the button
let buttonPressed = false;

let myButton = {x: 0, y: 0, w: 120, h: 40, color: "red"};

function setup() {
  createCanvas(windowWidth, windowHeight);
  myButton.x = width/2 - myButton.w/2;
  myButton.y = height/2 - myButton.h/2;
}

function drawButton() {
  fill(myButton.color);
  rect(myButton.x, myButton.y, myButton.w, myButton.h);
  fill(255);
  textAlign(CENTER, CENTER);
  textSize(20);
  text("Press Me", myButton.x + myButton.w/2, myButton.y + myButton.h/2);
}

function draw() {
  background(0);

  if (!buttonPressed) {
    drawButton();
  } else {
    fill(0, 200, 0, 150); // Semi-transparent green
    rect(myButton.x, myButton.y, myButton.w, myButton.h);
    fill(255);
    textAlign(CENTER, CENTER);
    textSize(20);
    text("Button Pressed!", width/2, height/2);
  }
}

function mousePressed() {
  if (mouseX > myButton.x && mouseX < myButton.x + myButton.w && mouseY > myButton.y && mouseY < myButton.y + myButton.h) {
    buttonPressed = !buttonPressed;
  }
}