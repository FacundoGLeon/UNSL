#include <Wire.h>
#include <LCD.h>
#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27, 2, 1, 0, 4, 5, 6, 7); // DIREC, E, RW, RS, D4, D5, D6, D7
float firstN;
float secondN;
float result;
String operatorN;


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  lcd.setBacklightPin(3,POSITIVE);
  lcd.setBacklight(HIGH);
  lcd.begin(16, 2);

}
void loop() {
  // put your main code here, to run repeatedly:
lcd.setCursor(0, 0);
  lcd.print("Ingresa 1er Num");
  while (Serial.available() == 0) {

  }
  firstN = Serial.parseFloat();
  fflush(stdin);
  lcd.clear();

  lcd.setCursor(0, 0);
  lcd.print("Ingresa 2do Num");
  while (Serial.available() == 0) {

  }
  secondN = Serial.parseFloat();
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Que Operacion?");
  lcd.setCursor(0, 1);
  lcd.print("+ - * /");
  while (Serial.available() == 0) {

  }
  operatorN = Serial.readString();
  lcd.clear();

  if (operatorN == "+" ) {
    result = firstN + secondN;
  }
  if (operatorN == "-") {
    result = firstN - secondN;
  }
  if (operatorN == "*") {
    result = firstN * secondN;
  }
  if (operatorN == "/") {
    result = firstN / secondN;
  }

  lcd.setCursor(0, 0);
  lcd.print("Tu operacion es:");
  lcd.setCursor(0, 1);
  lcd.print(firstN);
  lcd.print(operatorN);
  lcd.print(secondN);
  lcd.print("=");
  lcd.print(result);
  delay(10000);
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Gracias");
  delay(2000);
  lcd.clear();
}
