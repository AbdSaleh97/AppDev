
int gameScreen = 0;
int ballX , ballY;
int ballSize = 20 ;
int ballColor = color(0);
float gravity = 1;
float ballSpeedVert = 0 ;
float airfriction = 0.0001;
float friction = 0.1 ;
color racketColor = color(0);
float racketWidth = 100 ;
float racketHeight = 10;
int racketBounceRate = 20 ;
float ballSpeedHorizon = 10 ;
int wallSpeed = 5;
int wallInterval = 1000;
float lastAddTime = 200;
int maxGapHeight = 300 ;
int wallWidth =80;
color wallColors = color (0);

ArrayList<int[]>walls = new ArrayList<int[]>();

void gameScreen()
{
  background(255);
  
  drawBall();
  applyGravity();
  keepInScreen();
  drawRacket();
  watchRacketBounce();
  applyHorizontalSpeed();
  wallAdder();
  wallHandler();
}
void wallAdder()
{
if(millis()-lastAddTime>wallInterval)
{
  int randHeight = round(random(minGapHeight , maxGapHeight));
  int randY = round (random(o,height - randHeight));
  int[]randWall = {width , randY , wallWidth , randHeight);
  walls.add(randWall);
  lastAddTime = milis();
}

}

void wallHandler ()
{
  for(int i ; i < walls.size();i++)
  {
  wallRemoved(i);
  wallMover(i);
  wallDrawer(i);
  
  }
}

void wallDrawer(int index)
{
int[]wall = walls .get(index);
int gapWallX = wall[0];
int gapWallY = wall[1];
int gapWallWidth = wall[2];
int gapWallHeight = wall[3];

rectMode(CORNER);
fill(wallColors);
rect(gapWallX,gapWallyWidth,gapWallY);
rect(gapWallX,gapWallY+gapWallHeight,gapWallWidth,height-(gapWallY+gapWallHeight));
}

void applyHorizontalSpeed ()
{
  ballX += ballSpeedHorizon;
  ballSpeedHorizon -= (ballSpeedHorizon * friction );

}


void makeBounceLeft(int surface)
{
ballX = surface + (ballSize/2);
ballSpeedHorizon *= -1 ;
ballSpeedHorizon -= (ballSpeedHorizon * friction );

}



void watchRacketBounce()
{
  float overhead = mouseY - pmouseY;
  if ((ballX+(ballSize/2) > mouseX-(racketWidth/2))&&(ballX-(ballSize/2)<
  mouseX+(racketWidth/2)))
  {
  if(dist(ballX,ballY,ballX,mouseY)<=(ballSize/2)+abs(overhead))
  {
  makeBounceBottom(mouseY);
  
  if (overhead<0)
  {
  ballY+= overhead;
  ballSpeedVert += overhead;
  }
  }
  }
  {
  } 
  
  if((ballX+(ballSize/2)>mouseX-(racketWidth/2))&&(ballX-(ballSize/2)<
  mouseX+(racketWidth/2)))
  {
  if(dist(ballX,ballY,ballX,mouseY)<=(ballSize/2)+abs(overhead))
  {
    ballSpeedHorizon = (ballX - mouseX)/5;
  }
  }
}
void drawRacket ()
{
  fill(racketColor);
  rectMode(CENTER);
  rect(mouseX,mouseY,racketWidth,racketHeight);
}
void applyGravity()
{
  ballSpeedVert += gravity ;
  ballY += ballSpeedVert;
  ballSpeedVert -=(ballSpeedVert * airfriction); 
}
void makeBounceBottom(int surface)
{
  ballY = surface-(ballSize/2);
  ballSpeedVert *= -1;
  ballSpeedVert -= (ballSpeedVert * friction );
}

void makeBounceTop(int surface)
{
  ballY = surface+(ballSize/2);
  ballSpeedVert *=-1;
  ballSpeedVert -= (ballSpeedVert * friction);
}

void keepInScreen()
{
if(ballY+(ballSize/2)>height)
{
  makeBounceBottom(height);
}
if (ballY-(ballSize/2)<0)
{
  makeBounceTop(0);
}
if ( ballX-(ballSize/2)<0)
{
makeBounceLeft(0);
}
if (ballX +(ballSize/2)> width )
{
makeBounceRight(width);
}
}
void drawBall()
{
  fill(ballColor);
  ellipse(ballX,ballY,ballSize,ballSize);
}

void setup()
{
size (500 , 500);

ballX = width/4;
ballY = height/5 ;

}

void draw ()
{
  if(gameScreen == 0 )
  {
  initScreen();
  }
  else if (gameScreen == 1)
  {
  gameScreen();
  }
  else if (gameScreen ==2 )
  {
    gameOverScreen();  
  }
}


void initScreen()
{
  background(0);
  
  textAlign(CENTER);
  
  text("Clicl to Start" , height/2 , width/2);
  
}
