void setup(){
  size(800,600);
  background(#7005FF);
}
void draw(){
  for(int i=0;i<=300;i++);
  int j = (int)random(height);
  int u = (int)random(width);
  fill(#298DC9);
   ellipse(u,j,10,10);
}
getWormX();
 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
