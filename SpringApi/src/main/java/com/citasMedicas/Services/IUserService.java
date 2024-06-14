package com.citasMedicas.Services;

import com.citasMedicas.Entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> findAll();

    Optional <User> findById(Integer id);

    void save(User user);

    void deleteById(Integer id);
}
