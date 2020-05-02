#include <Wire.h>
#include <LCD.h>
#include <LiquidCrystal_I2C.h>
  LiquidCrystal_I2C lcd(0x27,2,1,0,4,5,6,7,3,POSITIVE);

int led = 9;
//int brightness = 0;
//int fadeAmount = 5;

void setup() {
  //put your setup code here, to run once:
  pinMode(led, OUTPUT);
  lcd.begin(20,4);
lcd.backlight();

}

void loop() {
  // put your main code here, to run repeatedly:
  /*analogWrite(led, brightness);
  brightness = brightness + fadeAmount;
  if(brightness == 0 || brightness == 255)
  {fadeAmount = - fadeAmount;}
  delay(20);
  */


  digitalWrite(led, HIGH);
  lcd.clear();
    lcd.setCursor(0,0);
  lcd.print("Status : ");
  lcd.setCursor(9,0);
  lcd.print("LED On");
  
  delay(2000);
  
  digitalWrite(led, LOW);
  
  lcd.setCursor(0,0);
  lcd.print("Status : ");
  lcd.setCursor(9,0);
  lcd.print("LED Off");
  delay(2000);
  
}
