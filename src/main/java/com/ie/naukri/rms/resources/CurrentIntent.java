package com.ie.naukri.rms.resources;

import java.util.Map;

public class CurrentIntent {
    public String name;
    public Map<String,String> slots;
    public SlotDetails slotDetails;
    public String confirmationStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getSlots() {
        return slots;
    }

    public void setSlots(Map<String, String> slots) {
        this.slots = slots;
    }

    public SlotDetails getSlotDetails() {
        return slotDetails;
    }

    public void setSlotDetails(SlotDetails slotDetails) {
        this.slotDetails = slotDetails;
    }

    public String getConfirmationStatus() {
        return confirmationStatus;
    }

    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }
}
