package com.cmed.kalozira.controller;

public class PrescriptionNotFoundException extends RuntimeException {
    public PrescriptionNotFoundException() {
    }

    public PrescriptionNotFoundException(Long vehicleId ) {
        super("Vehicle: " +vehicleId +" not found.");
    }
}