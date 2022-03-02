import java.util.Scanner;
public class kuvvetBulma {

  public static void main(String[] args) {

    int i, j, n;
    
    Scanner data = new Scanner(System.in);

    System.out.print("Bir Sayı Giriniz: ");
    n = data.nextInt();

   
      i = 4;   
      while (i <= n){

      System.out.println(n + " dahil olmak üzere bu değere kadar, 4'ün kuvvetleri: " + i);
      i *=4;
      
      }
    
      j = 5;
      while (j <= n){

        System.out.println(n + " dahil olmak üzere bu değere kadar, 5'in kuvvetleri: " + j);
        j *=5;
        
      }
      

    data.close();
  }
}