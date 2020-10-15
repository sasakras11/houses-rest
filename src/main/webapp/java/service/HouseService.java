package service;

import model.House;

import java.util.Optional;

public interface HouseService {

    void save(House house);
    void update(House house);
    void delete(House house);
    Optional<House> getById(String id);
}
