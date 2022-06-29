package id.bafika.echartjs.options.axis;

import id.bafika.echartjs.options.code.AxisType;

public class TimeAxis extends ValueAxis {
    /**
     * 构造函数
     */
    public TimeAxis() {
        this.type(AxisType.time);
    }
}
