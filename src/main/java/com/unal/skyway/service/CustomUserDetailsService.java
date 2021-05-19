package com.unal.skyway.service;

import com.unal.skyway.models.Role;
import com.unal.skyway.models.Store;
import com.unal.skyway.models.User;
import com.unal.skyway.repository.RoleRepository;
import com.unal.skyway.repository.StoreRepository;
import com.unal.skyway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomUserDetailsService {
    @Autowired
    private UserRepository UserRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private StoreRepository StoreRepository;

    public String autheticate(String email, String password){
        User user= findUserByEmail(email);
        Store store = findStoreByEmail(email);
        if(user== null && store== null) return "incorrect email";
        else{
            if(bCryptPasswordEncoder.matches(password, user.getContrasena())){
                return "Usuario";
            }
            if (bCryptPasswordEncoder.matches(password, store.getPassword())){
                return "Tienda";
            }
            return "failed";
        }

    }

    public User findUserByEmail(String correo) {
        return UserRepository.findByCorreo(correo);
    }

    public Store findStoreByEmail(String correo){return StoreRepository.findByEmail(correo);}

    public User saveUser(User user) {
        user.setContrasena(bCryptPasswordEncoder.encode(user.getContrasena()));
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));

        return UserRepository.save(user);
    }
    public  User deleteUserByEmail(String correo){
        return UserRepository.deleteUserByCorreo(correo);
    }
    /*
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = UserRepository.findByCorreo(email);
        if(user != null) {
            List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
            return buildUserForAuthentication(user, authorities);
        } else {
            throw new UsernameNotFoundException("username not found");
        }
    }
    private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
        Set<GrantedAuthority> permisos = new HashSet<>();
        userRoles.forEach((role) -> {
            permisos.add(new SimpleGrantedAuthority(role.getRole()));
        });

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(permisos);
        return grantedAuthorities;
    }

     */
    private UserDetails buildUserForAuthentication(User user, List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(user.getCorreo(), user.getContrasena(), authorities);
    }
}
