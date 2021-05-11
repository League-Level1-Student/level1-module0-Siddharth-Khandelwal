import java.util.Random;
int scorereal = 0;
int y = 0;
void setup() {
  size(1000, 600);
}
Random rand = new Random();
int i = rand.nextInt(601);
void draw() {
  background(420, 21, 69);
  fill(0);
  rect( mouseX, 500, 50, 75);

  fill(69, 21, 420);
  ellipse(i, y, 16, 36);
  stroke(21, 69, 420);
  y+=5;
  
  if(y > height){
   checkCatch(i); 
    y = 0;
    i = rand.nextInt(601);
  
}

int score = i;
if (score == mouseX){
scorereal+=1;
println(scorereal);
}

}
    void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            scorereal++;
         else if (scorereal > 0) 
            scorereal--;
        println("Your score is now: " + scorereal);
    }
