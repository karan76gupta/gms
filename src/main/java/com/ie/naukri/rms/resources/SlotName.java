package com.ie.naukri.rms.resources;

import java.util.List;

public class SlotName {
    public List<Resolution> resolutions = null;
    public String originalValue;

    public List<Resolution> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<Resolution> resolutions) {
        this.resolutions = resolutions;
    }

    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }
}
