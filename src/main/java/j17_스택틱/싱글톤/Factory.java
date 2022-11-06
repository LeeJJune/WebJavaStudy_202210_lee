package j17_스택틱.싱글톤;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Factory {

    private String factoryName;

    public Smartphone produceSmartPhone(){
        System.out.println(factoryName+" 에서 스마트폰을 생산합니다");
        String model = "갤럭시S";
        String serial = null;
        Samsung samsung = Samsung.getInstance();
        samsung.createSerialNumber(model);

        Smartphone smartphone = new Smartphone(samsung.getCompany(), model, serial);

        return smartphone;
    }

}
