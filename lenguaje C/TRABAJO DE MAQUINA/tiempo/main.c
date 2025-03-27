#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{


time_t tiempoahora;
time(&tiempoahora);
printf ("%s\n",ctime(&tiempoahora));



struct tm *tiempo=localtime(&tiempoahora);
printf("%d / %d / %d\n",(*tiempo).tm_mday,(*tiempo).tm_mon+1,(*tiempo).tm_year+1900);



}
