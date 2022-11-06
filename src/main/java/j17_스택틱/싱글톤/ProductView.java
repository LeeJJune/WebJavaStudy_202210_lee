package j17_스택틱.싱글톤;
// 싱글톤 <- 이름 그대로 1개의 객체만 생성한다.
//00
public class ProductView {
    private static ProductView instance = null;

    private ProductView() {

    }

    public static ProductView getInstance() {
        if(instance == null){
            instance = new ProductView();
        }
        return instance;
    }

    // 01
    // 00~01 전부 외울 것 자연스럽게 사용 할 수 있도록
    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }
    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }

}
