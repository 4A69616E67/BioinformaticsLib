package com.github.SnowFlakes.unit;

/**
 * Created by snowf on 2019/2/17.
 */
public class IntegerArrays implements Comparable {
    private int[] item;
    private int length;

    public IntegerArrays(int[] i) {
        item = i;
        length = item.length;
    }

    public IntegerArrays(int l) {
        length = l;
        item = new int[length];
    }

    @Override
    public int compareTo(Object o) {
        IntegerArrays b = (IntegerArrays) o;
        int result = 0;
        int i = 0;
        while (result == 0 && i < item.length && i < b.getItem().length) {
            result = item[i] - b.getItem()[i];
            i++;
        }
        if (result == 0) {
            result = item.length - b.getItem().length;
        }
        return result;
    }

    public static String[] toStrings(int[] i) {
        String[] s = new String[i.length];
        for (int j = 0; j < i.length; j++) {
            s[j] = String.valueOf(i[j]);
        }
        return s;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            s.append(item[i]).append(" ");
        }
        if (s.length() > 0) {
            s.deleteCharAt(s.length() - 1);
        }
        return s.toString();
    }

    public static double[] toDouble(int[] i) {
        double[] d = new double[i.length];
        for (int j = 0; j < i.length; j++) {
            d[j] = i[j];
        }
        return d;
    }

    public int[] getItem() {
        return item;
    }

    public int getLength() {
        return length;
    }

    public void set(int index, int i) {
        item[index] = i;
    }

}
