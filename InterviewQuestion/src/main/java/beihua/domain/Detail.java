package beihua.domain;

import java.text.SimpleDateFormat;
import java.util.Date;;

/**
 * @author :DYH
 * @date :2023/2/7 13:26
 * ClassName :Detail
 * Package :beihua.domain
 * Description :
 */
public class Detail {
    private String id;
    private String date;
    private double numb;

    public Detail() {

    }

    public Detail(String id, String date, double numb) {
        this.id = id;
        this.date = date;
        this.numb = numb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date.toString();
    }

    public double getNumb() {
        return numb;
    }

    public void setNumb(double numb) {
        this.numb = numb;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", numb=" + numb +
                '}';
    }
}
