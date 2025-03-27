#include <Stepper.h>
#include <Servo.h>
int stepsPerRevolution = 1000;
int motSpeed = 11;
Stepper myStepper(stepsPerRevolution,4,6,5,7);
Servo myServo;
int servoPin = 9;
float servoPos;

int dt = 500;
int xPin = A1;
int yPin = A2;
int xVal;
int yVal;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  myStepper.setSpeed(motSpeed);
  myServo.attach(servoPin);
  pinMode(xPin,INPUT);
  pinMode(yPin,INPUT);
  

}

void loop() {
  // put your main code here, to run repeatedly:
  xVal = analogRead(xPin);
  yVal = analogRead(yPin);
  Serial.print("valor x: ");
  Serial.print(xVal);
  Serial.print("  -  valor y: ");
  Serial.print(yVal);
  Serial.print("  -  Servo Pos: ");
  Serial.println(servoPos);

  if(yVal <= 200){
    myStepper.step(stepsPerRevolution);
  }
  if(yVal >= 830){
    myStepper.step(-stepsPerRevolution);
  }
  if(yVal < 530 && yVal > 500){
    myStepper.step(0);
  }
  servoPos = xVal*(170./1023.);
  myServo.write(servoPos);
  
  
  //myStepper.step(stepsPerRevolution);
  //delay(dt);

}
