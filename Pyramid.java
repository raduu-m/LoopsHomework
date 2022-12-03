public class Pyramid{

public void full_pyramid(int rows, String string){
    int i, j, k;
    for(i=1; i<=rows; i++){
        for(j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        for(k=1; k<=2*i-1; k++){
            System.out.print(string);
        }
            System.out.println();
    }
            System.out.println();
}

public void inverted_full_pyramid(int rows, String string){
    int i, j, k;
    for(i=rows; i>=1; i--){
        for(j=1; j<=rows-i; j++){
            System.out.print(" ");
        }
        for(k=1; k<=2*i-1; k++){
            System.out.print(string);
        }
        System.out.println();
    }
        System.out.println();
}


public void number_half_pyramid(int rows,int number){
    for(int i = 1; i <= rows; i++) {

        for(int j = 1; j <= i; j++) {
          System.out.print(number + " ");
          ++number;
        }
        System.out.println();
        }
        System.out.println();
    }


public void inverted_half_pyramid(int rows){
    for(int i = rows; i >= 1; i--) {

        for(int j = 1; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
        }
        System.out.println();
    }
    
public void mirrored_half_pyramid(int rows){
    for(int i=1;i<=rows;i++){

	    for(int j=0;j<rows-i;j++){
            System.out.print(" ");
    }
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
        System.out.println();
    }       
    System.out.println();      
    }
}
