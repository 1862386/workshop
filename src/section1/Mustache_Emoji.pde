PImage mustache;
  PImage friend;
void setup() {
  friend = loadImage("Sunglasses_Emoji.png");
size(800, 600);
friend.resize(width,height);
mustache = loadImage ("Mustache.jpg");
}
void draw() {
background (friend); 
image (mustache, 400, 300);
}