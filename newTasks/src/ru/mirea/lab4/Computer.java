package ru.mirea.lab4;

import ru.mirea.lab29.Dish;

import java.util.Arrays;
import java.util.Random;

enum Mark {
    IBM,
    MACINTOSH,
    MICROSOFT
}

public class Computer {
    Processor processor;
    Memory memory;
    Monitor monitor;
    Mark mark;

    public Computer(Processor processor, Memory memory, Monitor monitor, Mark mark) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Computer\n{" +
                "\nprocessor=" + processor.toString() +
                "\nmemory=" + memory.toString() +
                "\nmonitor=" + monitor.toString() +
                "\nmark=" + mark.toString() +
                "\n}";
    }

    public static void main(String[] args){
        Processor cpu = new Processor();
        Memory storage = new Memory();
        Monitor display = new Monitor();
        Mark mark = Mark.IBM;
        Computer comp = new Computer(cpu, storage, display, mark);
        System.out.println(comp.toString());
    }
}

class Processor {
    String name = "Intel";
    Integer cores = 8;
    Integer clockSpeed = 4200;

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", cores=" + cores +
                ", clockSpeed=" + clockSpeed +
                '}';
    }
}

class Memory {
    Integer ramCapacity = 16;
    Integer romCapacity = 512;

    @Override
    public String toString() {
        return "Memory{" +
                "ramCapacity=" + ramCapacity +
                ", romCapacity=" + romCapacity +
                '}';
    }
}

class Monitor {
    Double size = 27.;
    Integer resolution = 2160;

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", resolution=" + resolution +
                '}';
    }
}
