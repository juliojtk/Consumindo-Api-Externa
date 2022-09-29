package com.kuniwake.vtraker.rest.services;

import com.kuniwake.vtraker.config.MainServiceConfig;
import com.kuniwake.vtraker.domain.entities.VTracker;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public final class VTrackerServiceImpl extends MainServiceConfig implements VTrackerServiceInterface{

    // EndPoint da API
    // http://localhost:8080/api/v-tracker?anyString=geekhunter
    @Override
    public List<VTracker> getAllSource(String anyString) {
        if (!anyString.isEmpty()){
            return Collections.singletonList(getRestTemplate()
                    .getForObject(baseUrl.concat(apiKey), VTracker.class));
        }else{
            System.out.println("Valor Invalido!");
        }
        return Collections.emptyList();
    }

}
