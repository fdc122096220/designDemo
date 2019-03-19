package com.iluwatar.mybuilder;

/**
 * Created by feng.dc on 2019/3/19.
 */
public class LowComputerBuilder implements Builder {
    Computer computer = new Computer();

    @Override
    public void buildCPU() {
        this.computer.parts.add("比较low的cpu");
    }

    @Override
    public void buildMainboard() {
        this.computer.parts.add("比较low的主板");
    }

    @Override
    public void buildMemory() {
        this.computer.parts.add("比较low的内存");
    }

    @Override
    public void buildDisk() {
        this.computer.parts.add("比较low的硬盘");
    }

    @Override
    public void buildPower() {
        this.computer.parts.add("比较low的电源");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
