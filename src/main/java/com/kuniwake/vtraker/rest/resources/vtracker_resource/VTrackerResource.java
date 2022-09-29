package com.kuniwake.vtraker.rest.resources.vtracker_resource;

import com.kuniwake.vtraker.domain.entities.VTracker;
import com.kuniwake.vtraker.rest.services.VTrackerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/v-tracker")
public class VTrackerResource {

    @Autowired
    VTrackerServiceImpl service;

    @GetMapping
    @ResponseStatus(OK)
    public List<VTracker> getAllSource(@RequestParam(value = "anyString") String anyString){
        return service.getAllSource(anyString);
    }
}
