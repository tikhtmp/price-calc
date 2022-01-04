package by.karas.model;

import java.util.Scanner;

public class Exit implements Status{

    @Override
    public Status handle() {
        return null;
    }

    @Override
    public StatusType getType() {
        return StatusType.EXIT;
    }
}
