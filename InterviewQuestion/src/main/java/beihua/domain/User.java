package beihua.domain;

/**
 * @author :DYH
 * @date :2023/2/7 13:22
 * ClassName :User
 * Package :beihua.domain
 * Description :
 */


public class User {
    private String id;
    private String name;
    private double wallet;
    private Detail[] detail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public Detail[] getDetail() {
        return detail;
    }

    public void setDetail(Detail[] detail) {
        this.detail = detail;
    }
}
