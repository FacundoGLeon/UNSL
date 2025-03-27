#include <Servo.h>
int servoPin = 9;
float servoPos;
Servo myServo;
int xPin = A1;
int yPin = A2;
float xVal;
float yVal;
int dt = 500;
int vol = 10;

void setup() {
  // put your setup code here, to run once:
  myServo.attach(servoPin);
  Serial.begin(9600);
  pinMode(xPin,INPUT);
  pinMode(yPin,INPUT);
  pinMode(vol,OUTPUT);
  digitalWrite(vol,HIGH);

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
  servoPos = xVal*170/1023;
  myServo.write(servoPos);
  
}
