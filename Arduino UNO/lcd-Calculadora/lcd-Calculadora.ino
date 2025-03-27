#include <Wire.h>
#include <LCD.h>
#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27, 2, 1, 0, 4, 5, 6, 7); // DIREC, E, RW, RS, D4, D5, D6, D7 
float Num1;
float Num2;
float result;
String oper;
int dt = 2000; 


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
    lcd.print("Ingresa 1er Nro.:");
    while(Serial.available() == 0){
      
      }
    Num1 = Serial.parseFloat();
    lcd.clear();
    
    lcd.setCursor(0, 0);
    lcd.print("Ingresa 2do Nro.:");
    while(Serial.available() == 0){
      
      }  
    Num2 = Serial.parseFloat();
    lcd.clear();

    lcd.setCursor(0, 0);
    lcd.print("Indica Operacion:");
    lcd.setCursor(0, 1);
    lcd.print("+, -, *, /,");
    while(Serial.available() == 0){
      
      }
    oper = Serial.readString();
    lcd.clear();
    
    if(oper == "+"){
      result = Num1 + Num2;
      }
    if(oper == "-"){
      result = Num1 - Num2;
      }
    if(oper == "*"){
      result = Num1 * Num2;
      }
    if(oper == "/"){
      result = Num1 / Num2;
      }
    
    lcd.setCursor(0, 0);
    lcd.print(Num1);
    lcd.print(oper);
    lcd.print(Num2);
    lcd.setCursor(0, 1);
    lcd.print("=");
    lcd.print(result);
    delay(dt);
    lcd.clear();
    
    
   

}
