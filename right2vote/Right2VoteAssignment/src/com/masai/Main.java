package com.masai;


public class Main {

	
	public static void main(String[] str){
        int count = 0;
        int total = 600-230;
        int t_shirt = Math.abs(total/50)+1;
        int jeans = Math.abs(total/80)+1;
        int jacket = Math.abs(total/100)+1;
        
        for(int i=1; i<=jacket; i++){
            for(int j=1; j<=jeans; j++){
                for(int s=1; s<=t_shirt; s++){
                    
                    int sum = (i*100) + (j*80) + (s*50);
                    if(sum <= 600 && sum > 550){
                        System.out.println("you can purchase "+i+" jackets,"+j+" jeans and "+s+" t_shirts and total of that item is "+sum);  
                        count++;
                    }
                }
            }
        }
        System.out.println("Total possible combination of these items is "+count);
    }

}
