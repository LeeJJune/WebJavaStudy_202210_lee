package j17_스택틱;

//static 은 공유영역이다

import lombok.Data;

@Data
public class Product {

    public static int autoIncrement = 20220000;    // static 빼면 배열에 같은 값이 5개 들어간다
    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }
    public static int getSerialNumber() {
        return autoIncrement;
    }
    public static void printInfo(){
//        System.out.println(productName); <= 위에 this 로 메모리 지정하더라도 static 특성상
//        productName 처럼 메모리 지정용으로는 사용 할 수 없다 즉, 상시 메모리 사용만 static 에 사용 가능
//        아래처럼 static 안에서 메모리 생성 하면 사용 할 수 있다 다만 멤버변수로는 사용 불가
        Product product = new Product("product");
        System.out.println(product);
        System.out.println(autoIncrement);
    }

}
