#include <Servo.h>

int servoPin = 9;
int servoPos;
Servo myServo;
int lightPin = A1;
int lightVal;
int dt = 200;


void setup() {
  // put your setup code here, to run once:
  myServo.attach(servoPin);
  Serial.begin(9600);
  pinMode(lightPin,INPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  lightVal = analogRead(lightPin);
  
  servoPos = (lightVal-200.)*(170./650.);
  myServo.write(servoPos);
  Serial.print(lightVal);
  Serial.print("  -  ");
  Serial.println(servoPos);
  delay(dt);

}
