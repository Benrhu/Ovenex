package com.example.Ovenex.Services;

import com.example.Ovenex.Entities.UserData;
import com.example.Ovenex.Repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserDataService {
    @Autowired
    private UserDataRepository userDataRepository;

    private UserData userData;

    Long ovenexId = userData.ovenexId;
    Integer timesUsed = userData.timesUsed;
    Integer timesCleaned = userData.timesCleaned;
    Integer recipesUsed = userData.recipesUsed;
    Integer ingredientsUsed = userData.ingredientsUsed;
    Integer comeBackUsed = userData.comeBackUsed;
    Integer foodHistoryUsed = userData.foodHistoryUsed;

    public UserData findAll() {
        return (UserData) userDataRepository.findAll();
    }

    public Optional<UserData> findByOvenexId(Long ovenexId) {
        return userDataRepository.findById(ovenexId);
    }

    public Integer getTimesUsed(Integer timesUsed) {
        return this.timesUsed = timesUsed;
    }

    public Integer getTimesCleaned(Integer timesCleaned) {
        return this.timesCleaned = timesCleaned;
    }

    public Integer getRecipesUsed(Integer recipesUsed) {
        return this.recipesUsed = recipesUsed;
    }

    public Integer getIngredientsUsed(Integer ingredientsUsed) {
        return this.ingredientsUsed = ingredientsUsed;
    }

    public Integer getComeBackUsed(Integer comeBackUsed) {
        return this.comeBackUsed = comeBackUsed;
    }

    public Integer getFoodHistoryUsed(Integer foodHistoryUsed) {
        return this.foodHistoryUsed = foodHistoryUsed;
    }

}
