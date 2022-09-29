package com.kuniwake.vtraker.rest.services;

import com.kuniwake.vtraker.domain.entities.VTracker;

import java.util.List;

public interface VTrackerServiceInterface {
    List<VTracker> getAllSource(String anyString);
}
