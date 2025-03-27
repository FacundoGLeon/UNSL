#include <DHT.h>
#include <DHT_U.h>
#define Type DHT11
//LCD
#include <Wire.h>
#include <LCD.h>
#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27, 2, 1, 0, 4, 5, 6, 7);

int dhtPin = 2;
DHT HT(dhtPin, Type);
int humidity;
float tempC;
float tempF;
int dt = 3000;

void setup() {
  // put your setup code here, to run once:
  HT.begin();
  lcd.setBacklightPin(3,POSITIVE);
  lcd.setBacklight(HIGH);
  lcd.begin(16, 2);
  lcd.clear();

}

void loop() {
  // put your main code here, to run repeatedly:
  humidity = HT.readHumidity();
  tempC = HT.readTemperature();
  tempF = HT.readTemperature(true);
  lcd.setCursor(0, 0);
  lcd.print("Humedad Relativa: ");
  lcd.setCursor(0, 1);
  lcd.print(humidity);
  lcd.print("%");
  delay(dt);
  lcd.clear();

  lcd.setCursor(0, 0);
  lcd.print("Temperatura: ");
  lcd.setCursor(0, 1);
  lcd.print(tempC);
  lcd.print("C / ");
  lcd.print(tempF);
  lcd.print("F");
  delay(dt);
  lcd.clear();

}
