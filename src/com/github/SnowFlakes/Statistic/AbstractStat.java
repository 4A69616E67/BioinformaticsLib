package com.github.SnowFlakes.Statistic;

/**
 * Created by snowf on 2019/3/1.
 */

public abstract class AbstractStat {
    public long Time;


    public abstract void Stat() throws Exception;

    public abstract String Show();

    protected abstract void UpDate();

    public abstract void Init();
}
