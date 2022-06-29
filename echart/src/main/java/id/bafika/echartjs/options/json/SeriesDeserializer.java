package id.bafika.echartjs.options.json;

import com.google.gson.*;

import java.lang.reflect.Type;

import id.bafika.echartjs.options.code.SeriesType;
import id.bafika.echartjs.options.series.Bar;
import id.bafika.echartjs.options.series.Boxplot;
import id.bafika.echartjs.options.series.Candlestick;
import id.bafika.echartjs.options.series.EffectScatter;
import id.bafika.echartjs.options.series.Funnel;
import id.bafika.echartjs.options.series.Gauge;
import id.bafika.echartjs.options.series.Graph;
import id.bafika.echartjs.options.series.Line;
import id.bafika.echartjs.options.series.Lines;
import id.bafika.echartjs.options.series.Map;
import id.bafika.echartjs.options.series.Parallel;
import id.bafika.echartjs.options.series.Pie;
import id.bafika.echartjs.options.series.Sankey;
import id.bafika.echartjs.options.series.Scatter;
import id.bafika.echartjs.options.series.Series;

public class SeriesDeserializer implements JsonDeserializer<Series> {
    @Override
    /**
     * 设置json,typeOfT,context值
     *
     * @param json
     * @param typeOfT
     * @param context
     */
    public Series deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        String _type = jsonObject.get("type").getAsString();
        SeriesType type = SeriesType.valueOf(_type);
        Series series = null;
        switch (type) {
            case line:
                series = context.deserialize(jsonObject, Line.class);
                break;
            case bar:
                series = context.deserialize(jsonObject, Bar.class);
                break;
            case scatter:
                series = context.deserialize(jsonObject, Scatter.class);
                break;
            case funnel:
                series = context.deserialize(jsonObject, Funnel.class);
                break;
            case pie:
                series = context.deserialize(jsonObject, Pie.class);
                break;
            case gauge:
                series = context.deserialize(jsonObject, Gauge.class);
                break;
            case map:
                series = context.deserialize(jsonObject, Map.class);
                break;
            case lines:
                series = context.deserialize(jsonObject, Lines.class);
                break;
            case effectScatter:
                series = context.deserialize(jsonObject, EffectScatter.class);
                break;
            case candlestick:
                series = context.deserialize(jsonObject, Candlestick.class);
                break;
            case graph:
                series = context.deserialize(jsonObject, Graph.class);
                break;
            case boxplot:
                series = context.deserialize(jsonObject, Boxplot.class);
                break;
            case parallel:
                series = context.deserialize(jsonObject, Parallel.class);
                break;
            case sankey:
                series = context.deserialize(jsonObject, Sankey.class);
                break;
        }
        return series;
    }
}
