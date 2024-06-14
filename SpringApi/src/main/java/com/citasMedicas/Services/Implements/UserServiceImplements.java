package com.citasMedicas.Services.Implements;

import com.citasMedicas.DTO.DTOUser;
import com.citasMedicas.Entities.User;
import com.citasMedicas.Repositories.IUserRepository;
import com.citasMedicas.Services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplements implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
