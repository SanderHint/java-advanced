package org.sda.model;

public class PrivatePassenger extends Passenger {
    private static final Long id = 546151616L;
    private boolean isPrivate;
    private String personalIDCode;

    public PrivatePassenger(String address, PaymentType paymentType, String destinationAddress) {
        super(id, address, paymentType, destinationAddress);
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getPersonalIDCode() {
        return personalIDCode;
    }

    public void setPersonalIDCode(String personalIDCode) {
        this.personalIDCode = personalIDCode;
    }
}
