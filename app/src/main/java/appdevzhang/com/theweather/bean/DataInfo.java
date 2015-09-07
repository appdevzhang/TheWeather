package appdevzhang.com.theweather.bean;

import java.io.Serializable;

/**
 * @ClassName: DataInfo
 * @Description:
 * @author: appdevzhang
 * @email: 1160030655@qq.com
 * @date: 15/9/7 上午11:20
 */
public class DataInfo implements Serializable {
    private String DataCode;
    private String DataValue;

    public String getDataCode() {
        return DataCode;
    }

    public void setDataCode(String dataCode) {
        DataCode = dataCode;
    }

    public String getDataValue() {
        return DataValue;
    }

    public void setDataValue(String dataValue) {
        DataValue = dataValue;
    }

    @Override
    public String toString() {
        return "DataInfo{" +
                "DataCode='" + DataCode + '\'' +
                ", DataValue='" + DataValue + '\'' +
                '}';
    }
}
