package appdevzhang.com.theweather.bean;

import java.io.Serializable;

/**
 * @ClassName: WeatherInfo
 * @Description:
 * @author: appdevzhang
 * @email: 1160030655@qq.com
 * @date: 15/9/6 下午3:11
 */
public class WeatherInfo implements Serializable {
    /*
    "weatherinfo": {
        "city": "郑州",
        "cityid": "101180101",
        "temp1": "12℃",
        "temp2": "8℃",
        "weather": "小雨转阴",
        "img1": "d7.gif",
        "img2": "n2.gif",
        "ptime": "08:00"
    }
     */

    private String city;
    private String cityId;
    private String temp1;
    private String weather;
    private String ptime;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", cityId='" + cityId + '\'' +
                ", temp1='" + temp1 + '\'' +
                ", weather='" + weather + '\'' +
                ", ptime='" + ptime + '\'' +
                '}';
    }
}
