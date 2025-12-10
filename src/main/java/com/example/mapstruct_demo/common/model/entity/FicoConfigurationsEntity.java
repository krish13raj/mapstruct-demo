package com.example.mapstruct_demo.common.model.entity;

public class FicoConfigurationsEntity {
    private FicoOutputEntity output;
    private String dmFlow;
    private FicoInputEntity input;

    public FicoOutputEntity getOutput() {
        return output;
    }

    public void setOutput(FicoOutputEntity output) {
        this.output = output;
    }

    public String getDmFlow() {
        return dmFlow;
    }

    public void setDmFlow(String dmFlow) {
        this.dmFlow = dmFlow;
    }

    public FicoInputEntity getInput() {
        return input;
    }

    public void setInput(FicoInputEntity input) {
        this.input = input;
    }
}
