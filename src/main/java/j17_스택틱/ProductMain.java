package j17_스택틱;

import j08_메소드.Method1;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Method;

@Getter
@Setter
public class ProductMain {
    private String name;

    public static void main(String[] args) {

//        Product[] products = new Product[5];
//
//        /*
//        1. serialNumber = 20220001, productName = "스타벅스 블랙 텀블러1"
//        2. serialNumber = 20220002, productName = "스타벅스 블랙 텀블러2"
//        3. serialNumber = 20220003, productName = "스타벅스 블랙 텀블러3"
//        4. serialNumber = 20220004, productName = "스타벅스 블랙 텀블러4"
//        5. serialNumber = 20220005, productName = "스타벅스 블랙 텀블러5"
//         */
//
//        products[0] = new Product("스타벅스 블랙 텀플러"+1);
//        products[1] = new Product("스타벅스 블랙 텀플러"+2);
//        products[2] = new Product("스타벅스 블랙 텀플러"+3);
//        products[3] = new Product("스타벅스 블랙 텀플러"+4);
//        products[4] = new Product("스타벅스 블랙 텀플러"+5);
//
//
//        for(int i = 0; i < products.length; i++){
//            products[i] = new Product("스타벅스 블랙 텀블러"+(i+1));
//        }
//        for(int i = 0; i < products.length; i++){
//            System.out.println(products[i]);
//        }
        int autoIncrement = Product.getSerialNumber();

        System.out.println(autoIncrement);
//        System.out.println(Product.autoIncrement);
        Product.autoIncrement++;
        System.out.println(Product.getSerialNumber());

        Product p1 = new Product("p1");
        System.out.println(p1.getSerialNumber());
        Product p2 = new Product("p2");
        System.out.println(p1.getSerialNumber());

        System.out.println(PathRepository.PRODUCT_IMG_PATH);
        System.out.println(PathRepository.PROFILE_IMG_PATH);
        System.out.println(PathRepository.MAIN_IMG_PATH);

        Product.printInfo();

        ProductMain productMain = new ProductMain();

        productMain.setName("테스트");
        System.out.println(productMain.getName());
        Method1.call1();
    }

}
