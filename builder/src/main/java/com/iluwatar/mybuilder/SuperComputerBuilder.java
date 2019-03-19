package com.iluwatar.mybuilder;

/**
 * Created by feng.dc on 2019/3/19.
 */
public class SuperComputerBuilder implements Builder {
    Computer computer = new Computer();
    @Override
    public void buildCPU() {
        this.computer.parts.add("高端CPU");
    }

    @Override
    public void buildMainboard() {
        this.computer.parts.add("高端主板");
    }

    @Override
    public void buildMemory() {
        this.computer.parts.add("高端内存");
    }

    @Override
    public void buildDisk() {
        this.computer.parts.add("高端硬盘");
    }

    @Override
    public void buildPower() {
        this.computer.parts.add("高端电源");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
