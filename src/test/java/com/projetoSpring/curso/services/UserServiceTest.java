package com.projetoSpring.curso.services;

import com.projetoSpring.curso.entities.User;
import com.projetoSpring.curso.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

//para criar User

//    private Long id;
//    private String nome;
//    private String email;
//    private String fone;
//    private String passworld;
    private User user;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);

        user = new User();
        user.setId(1L);
        user.setNome("Test User");
        user.setEmail("test@example.com");
        user.setNome("testuser");
        user.setPassworld("password");

    }

    @Test
    void findAll() {
        when(userRepository.findAll()).thenReturn(Arrays.asList(user));
        assertEquals(1, userService.findAll().size());
    }

    @Test
    void findById() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        assertEquals(user, userService.findById(1L));
    }
}