package appdevzhang.com.theweather.net;

import java.io.Serializable;

/**
 * @ClassName: WeatherUrl
 * @Description:
 * @author: appdevzhang
 * @email: 1160030655@qq.com
 * @date: 15/8/27 下午2:53
 */
public class WeatherUrl implements Serializable {
    /*
    01|北京,02|上海,03|天津,04|重庆,05|黑龙江,06|吉林,07|辽宁,08|内蒙古,09|河北,10|山西,11|陕西,12|山东,13|新疆,14|西藏,15|青海,16|甘肃,17|宁夏,18|河南,19|江苏,20|湖北,21|浙江,22|安徽,23|福建,24|江西,25|湖南,26|贵州,27|四川,28|广东,29|云南,30|广西,31|海南,32|香港,33|澳门,34|台湾
     */
    public static final String CHINAPROVINCEURL = "http://www.weather.com.cn/data/list3/city.xml";
    /*
    18|河南
    1801|郑州,1802|安阳,1803|新乡,1804|许昌,1805|平顶山,1806|信阳,1807|南阳,1808|开封,1809|洛阳,1810|商丘,1811|焦作,1812|鹤壁,1813|濮阳,1814|周口,1815|漯河,1816|驻马店,1817|三门峡,1818|济源
     */
    public static final String CITYOFPROVINCEURL = "http://www.weather.com.cn/data/list3/city18.xml";
    /*
    1814|周口
    181401|周口,181402|扶沟,181403|太康,181404|淮阳,181405|西华,181406|商水,181407|项城,181408|郸城,181409|鹿邑,181410|沈丘,181411|黄泛区
     */
    public static final String TOWNOFCITYURL = "http://www.weather.com.cn/data/list3/city1814.xml";
    /*
    181407|项城
    181407|101181407
     */
    public static final String WEATHERCODEURL = "http://www.weather.com.cn/data/list3/city181407.xml";
    /*
    181407|101181407
    {
    "weatherinfo": {
        "city": "项城",
        "cityid": "101181407",
        "temp1": "11℃",
        "temp2": "7℃",
        "weather": "小雨转多云",
        "img1": "d7.gif",
        "img2": "n1.gif",
        "ptime": "08:00"
        }
    }
     */
    public static final String WEATHERINFOBYCODEURL = "http://www.weather.com.cn/data/cityinfo/101181407.html";

}
