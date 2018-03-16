#include <Adafruit_NeoPixel.h>

#define NUMPIXELS      25 // number of neopixels in strip.

Adafruit_NeoPixel pixels = Adafruit_NeoPixel(NUMPIXELS, 6, NEO_GRB + NEO_KHZ800);

uint32_t red = pixels.Color(255, 0, 0);
uint32_t green = pixels.Color(0, 255, 0);
uint32_t blue = pixels.Color(0, 0, 255);

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
    if(readSerial().equals("RED"))
    {
      setColor(red);
    }
    if(readSerial().equals("GREEN"))
    {
      setColor(green);
    }
    if(readSerial().equals("BLUE"))
    {
      setColor(blue);
    }
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

