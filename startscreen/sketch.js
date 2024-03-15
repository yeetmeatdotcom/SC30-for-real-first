// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let button = []; // Array to hold button properties [x, y, width, height, clicked]
let buttonColor;

function setup() {
  createCanvas(windowWidth, windowHeight);
  let buttonWidth = 100; // Define the width of the button
  let buttonHeight = 50; // Define the height of the button
  button = [windowWidth / 2, windowHeight / 2, buttonWidth, buttonHeight, false]; // Initialize button properties
  buttonColor = color('red'); // Define the button color
}

function draw() {
  background(220);
  
  // Draw button
  if (!button[4]) {
    fill(buttonColor); // Use the button color
    rectMode(CENTER); // Set rect mode to center
    rect(button[0], button[1], button[2], button[3]); // Draw the button as a rectangle
  } else {
    // Draw a different scene after the button is clicked
    background(255);
    textSize(24);
    fill(0);
    text("You pressed a button wow!", windowWidth / 2, windowHeight / 2);
  }
}

function mousePressed() {
  // Check if the mouse is inside the button area
  let buttonHalfWidth = button[2] / 2;
  let buttonHalfHeight = button[3] / 2;
  if (!button[4] && mouseX > button[0] - buttonHalfWidth && mouseX < button[0] + buttonHalfWidth && mouseY > button[1] - buttonHalfHeight && mouseY < button[1] + buttonHalfHeight) {
    button[4] = true; // Set button clicked to true
  }
}
