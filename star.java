public class star {
    public static void main(String[] args) {
        int price=650_000;  //상품 가격

        int rate=30;             //할인율
        
        int sale;     //세일 가격

        int p = price * (100-rate) / 100;

        System.out.println("상품 가격 : " + price);
            
        System.out.println("할인율 : " + rate );
            
        System.out.println("세일 가격 : " + p);
        }
    }

