package org.sdxchange.core.util;

public class Range {
    Double min = 0.0;
    Double max = 0.0;

    public Range (String min, String max){
        this(Double.valueOf(min), Double.valueOf(max));
    }

    public Range (Double min, Double max){
        this.min = min;
        this.max = max;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }

    @Override
    public String toString(){
        return ""+min + ","+max;
    }

}
