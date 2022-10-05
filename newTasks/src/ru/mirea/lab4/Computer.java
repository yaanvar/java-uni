package ru.mirea.lab4;

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
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", monitor=" + monitor +
                ", mark=" + mark +
                '}';
    }
}

class Processor {
    String name;
    Integer cores;
    Integer clockSpeed;
}

class Memory {
    Integer ramCapacity;
    Integer romCapacity;
}

class Monitor {
    Double size;
    Integer resolution;
}
