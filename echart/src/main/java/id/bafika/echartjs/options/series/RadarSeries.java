package id.bafika.echartjs.options.series;

import id.bafika.echartjs.options.code.SeriesType;

public class RadarSeries extends Series<RadarSeries> {

    /**
     * 构造函数
     */
    public RadarSeries() {
        this.type(SeriesType.radar);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public RadarSeries(String name) {
        super(name);
        this.type(SeriesType.radar);
    }

}
