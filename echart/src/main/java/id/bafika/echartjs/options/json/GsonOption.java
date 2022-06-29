package id.bafika.echartjs.options.json;


import org.jetbrains.annotations.NotNull;

import id.bafika.echartjs.options.Option;

public class GsonOption extends Option {

    /**
     * 获取toString值
     */
    @Override
    public @NotNull String toString() {
        return GsonUtil.format(this);
    }

    /**
     * 获取toPrettyString值
     */
    public String toPrettyString() {
        return GsonUtil.prettyFormat(this);
    }

}
