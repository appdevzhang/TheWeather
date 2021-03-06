package appdevzhang.com.theweather.net;

import java.util.HashMap;

/**
 * @ClassName: ApiParams
 * @Description: Request params
 * @author: appdevzhang
 * @email: 1160030655@qq.com
 * @date: 15/8/31 下午3:43
 */
public class ApiParams extends HashMap {

    public ApiParams with(String key,String value){
        put(key,value);
        return this;
    }
}
