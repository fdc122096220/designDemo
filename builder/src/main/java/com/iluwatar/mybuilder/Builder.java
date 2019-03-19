package com.iluwatar.mybuilder;

/**
 * Created by feng.dc on 2019/3/19.
 */
public interface Builder {
    void buildCPU();
    void buildMainboard();
    void buildMemory();
    void buildDisk();
    void buildPower();
    Computer getComputer();
}
