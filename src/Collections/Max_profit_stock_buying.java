package Collections;



public class Max_profit_stock_buying {

    public static void main(String[] args) {
        
        int[] prices= new int[] {7,1,3,4,6,2};

        int len = prices.length;
        int max_profit=0;
        int temp=0;

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
            if(prices[i]>prices[j]){
                System.out.println("no buying");
            }else{
            temp=prices[j]-prices[i];
            if(temp>max_profit){
                max_profit=temp;
            }
        }
            }
            }
        
        System.out.println(max_profit);

      }  

    }
        
 


