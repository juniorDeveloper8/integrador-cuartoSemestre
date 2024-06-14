package com.citasMedicas.Services;

import com.citasMedicas.Entities.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(Integer id);

    void save(User user);

    void deleteById(Integer id);
}
