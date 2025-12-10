package com.example.mapstruct_demo.dto;

public class FicoConfigurations {
    public FicoOutput output;
    public String dmFlow;
    public FicoInput input;

    public FicoOutput getOutput() {
        return output;
    }

    public void setOutput(FicoOutput output) {
        this.output = output;
    }

    public String getDmFlow() {
        return dmFlow;
    }

    public void setDmFlow(String dmFlow) {
        this.dmFlow = dmFlow;
    }

    public FicoInput getInput() {
        return input;
    }

    public void setInput(FicoInput input) {
        this.input = input;
    }
}
