#include <Adafruit_NeoPixel.h>

#define NUMPIXELS      25 // number of neopixels in strip.

Adafruit_NeoPixel pixels = Adafruit_NeoPixel(NUMPIXELS, 6, NEO_GRB + NEO_KHZ800);

uint32_t color=pixels.Color(0,255,0);

void setup() 
{
  pixels.begin();
  Serial.begin(9600);
  Serial.setTimeout(25);
}

void loop() 
{
  if(Serial.available()>0)
  {
    color = readSerial().toInt();
    setColor(color);
  }
}

void setColor(uint32_t C)
{
  for(int i=0;i<NUMPIXELS;i++)
  {
    pixels.setPixelColor(i, C);
  }
  pixels.show();

}

String readSerial()
{
  if(Serial.available()>0)
  {
    return(Serial.readString());
  }
  else
  {
    return ("");
  }
}

