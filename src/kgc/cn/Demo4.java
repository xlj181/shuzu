package kgc.cn;

import java.sql.SQLOutput;

public class Demo4 {

   public static void main(String[] args) {
      int[] a={2,40,49,22,30,90,4};
      for(int i=0;i<a.length-1;i++){
          for(int j=0;j<a.length-1-i;j++){
              if(a[j]>a[j+1]){
                  int mep;
                  mep=a[j+1];
                  a[j+1]=a[j];
                  a[j]=mep;
              }
          }
      }
      for (int as:a){
          System.out.print(as+" ");
      }
   }


}




