#include <Wire.h>
#include <LCD.h>
#include <LiquidCrystal_I2C.h>

int inPin = 2;         // the number of the input pin
int outPin = 13;       // the number of the output pin

int state = HIGH;      // the current state of the output pin
int reading;           // the current reading from the input pin
int previous = LOW;    // the previous reading from the input pin

// the follow variables are long's because the time, measured in miliseconds,
// will quickly become a bigger number than can be stored in an int.
long time = 0;         // the last time the output pin was toggled
long debounce = 200;   // the debounce time, increase if the output flickers

void setup()
{
  pinMode(inPin, INPUT);
  pinMode(outPin, OUTPUT);
}

void loop()
{
  reading = digitalRead(inPin);

  // if the input just went from LOW and HIGH and we've waited long enough
  // to ignore any noise on the circuit, toggle the output pin and remember
  // the time
  if (reading == HIGH && previous == LOW && millis() - time > debounce) {
    if (state == HIGH)
      state = LOW;
    else
      state = HIGH;
      LiquidCrystal_I2C lcd(0x27,2,1,0,4,5,6,7,3,POSITIVE);
  lcd.begin(20,4);
  lcd.backlight();
  lcd.setCursor(0,0);
  lcd.print("Hello world!");
  lcd.setCursor(0,1);
  lcd.print("Made by: ");
  lcd.setCursor(9,1);
  lcd.print("Jonathan");
  lcd.setCursor(0,2);
  lcd.print("Studying in: ");
  lcd.setCursor(13,2);
  lcd.print("UCLM");
  lcd.setCursor(0,3);
  lcd.print("Goal: ");
  lcd.setCursor(6,3);
  lcd.print("Programmer");
    time = millis();    
  }

  digitalWrite(outPin, state);

  previous = reading;
}
