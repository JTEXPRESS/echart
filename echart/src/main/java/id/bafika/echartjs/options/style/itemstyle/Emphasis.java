package id.bafika.echartjs.options.style.itemstyle;

import id.bafika.echartjs.options.code.EmphasisFocus;

public class Emphasis extends Style<Emphasis> {
    private Object focus;

    public Object focus() {
        return this.focus;
    }

    public Emphasis focus(EmphasisFocus focus) {
        this.focus = focus;
        return this;
    }

    public Emphasis focus(String focus) {
        this.focus = focus;
        return this;
    }
}
