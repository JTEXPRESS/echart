package id.bafika.echartjs.options.series;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import id.bafika.echartjs.options.code.SeriesType;

public class Heatmap extends Series<Heatmap> {
    /**
     * 一个热力图数据点的模糊范围，单位是像素
     */
    private Integer blurSize;
    /**
     * 可以是一个包含 offset 和 color 的 Object 的数组，如 [{ offset: 0.2, color: 'blue' }, { offset 0.8, color: 'cyan' }]；也可以是一个颜色字符串的数组如 ['blue', 'cyan', 'lime', 'yellow', 'red']，颜色将均匀分布
     *
     */
    private List<Object> gradientColors;
    /**
     * 当均一化后的数据点的值小于这个值时，将被设为该值。该值保证了数据值很小的数据也能在地图上展示。
     */
    private Double minAlpha;
    /**
     * 所有数据点的值将乘以这个值再进行绘制
     */
    private Double valueScale;
    /**
     * 整个热力图的不透明度
     */
    private Double opacity;

    /**
     * 构造函数
     */
    public Heatmap() {
        this.type(SeriesType.heatmap);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Heatmap(String name) {
        super(name);
        this.type(SeriesType.heatmap);
    }

    /**
     * 获取blurSize值
     */
    public Integer blurSize() {
        return this.blurSize;
    }

    /**
     * 设置blurSize值
     *
     * @param blurSize
     */
    public Heatmap blurSize(Integer blurSize) {
        this.blurSize = blurSize;
        return this;
    }

    /**
     * 获取gradientColors值
     */
    public List<Object> gradientColors() {
        if (this.gradientColors == null) {
            this.gradientColors = new LinkedList<Object>();
        }
        return this.gradientColors;
    }

    /**
     * 设置gradientColors值
     *
     * @param gradientColors
     */
    public Heatmap gradientColors(List<Object> gradientColors) {
        this.gradientColors = gradientColors;
        return this;
    }

    /**
     * 设置gradientColors值
     *
     * @param gradientColors
     */
    public Heatmap gradientColors(Object... gradientColors) {
        if (gradientColors == null || gradientColors.length == 0) {
            return this;
        }
        this.gradientColors().addAll(Arrays.asList(gradientColors));
        return this;
    }

    /**
     * 获取minAlpha值
     */
	public Double minAlpha() {
        return this.minAlpha;
    }

    /**
     * 设置minAlpha值
     *
     * @param minAlpha
     */
    public Heatmap minAlpha(Double minAlpha) {
        this.minAlpha = minAlpha;
        return this;
    }

    /**
     * 获取valueScale值
     */
	public Double valueScale() {
        return this.valueScale;
    }

    /**
     * 设置valueScale值
     *
     * @param valueScale
     */
    public Heatmap valueScale(Double valueScale) {
        this.valueScale = valueScale;
        return this;
    }

    /**
     * 获取opacity值
	 */
	public Double opacity() {
        return this.opacity;
    }

    /**
     * 设置opacity值
     *
     * @param opacity
     */
	public Heatmap opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }
}
