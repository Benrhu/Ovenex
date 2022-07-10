package com.example.Ovenex.Services;

import com.example.Ovenex.Entities.Oven;
import com.example.Ovenex.Entities.UserData;
import com.example.Ovenex.Repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Configurable
public class UserDataService {
    @Autowired
    UserDataRepository userDataRepository;

    @Autowired
    UserData userData = new UserData();

    @Autowired
    Oven oven;

    Integer timesUsed = userData.timesUsed;
    Integer timesCleaned = userData.timesCleaned;
    Integer recipesUsed = userData.recipesUsed;
    Integer ingredientsUsed = userData.ingredientsUsed;
    Integer comeBackUsed = userData.comeBackUsed;
    Integer foodHistoryUsed = userData.foodHistoryUsed;

    public UserData findAll() {
        return (UserData) userDataRepository.findAll();
    }

    public Optional<UserData> findByOvenId() {
        return userDataRepository.findById(oven.getId());
    }

    public Integer getTimesUsed() {
        return userData.timesUsed;
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
