#include <stdio.h>
#include <stdlib.h>
#define max 10

int main()
{
    FILE *fp;
    float decim[max];
    int i=0;
    fp=fopen("costos.txt","r");
    while(fscanf(fp,"%f",&decim[i])!=EOF){
        i++;

    }
    fclose(fp);
    fp=fopen("costospares.txt","w");
    for(i=0;i<max;i++){
        if((int)decim[i]%2==0){
            fprintf(fp,"%.2f\n",decim[i]);
        }
    }
    fclose(fp);
    return 0;
}
