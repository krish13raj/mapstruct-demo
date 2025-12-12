package com.example.mapstruct_demo.fico.model;

public class FicoConfigurationsSource {
    private FicoOutputSource output;
    private String dmFlow;
    private FicoInputSource input;

    public FicoOutputSource getOutput() {
        return output;
    }

    public void setOutput(FicoOutputSource output) {
        this.output = output;
    }

    public String getDmFlow() {
        return dmFlow;
    }

    public void setDmFlow(String dmFlow) {
        this.dmFlow = dmFlow;
    }

    public FicoInputSource getInput() {
        return input;
    }

    public void setInput(FicoInputSource input) {
        this.input = input;
    }
}
