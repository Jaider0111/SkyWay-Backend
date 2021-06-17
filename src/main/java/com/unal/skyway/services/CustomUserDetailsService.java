package com.unal.skyway.services;

import com.unal.skyway.models.Role;
import com.unal.skyway.models.Store;
import com.unal.skyway.models.User;
import com.unal.skyway.repositories.RoleRepository;
import com.unal.skyway.repositories.StoreRepository;
import com.unal.skyway.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
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

    public Map<String, Object> autheticateUser (String email, String password){
        User user= findUserByEmail(email);
        Store store = findStoreByEmail(email);
        Map<String, Object> ans = new HashMap<>();
        if(user== null && store== null){
            ans.put("status", "incorrect email");
            return ans;
        }
        else if(user != null) {
            if (bCryptPasswordEncoder.matches(password, user.getPassword())){
                ans.put("status", "Usuario");
                ans.put("body", user);
                //user.toJson().forEach(ans::put);
                return ans;
            }
        }else{
            if (bCryptPasswordEncoder.matches(password, store.getPassword())){
                ans.put("status", "Tienda");
                ans.put("body", store);
                //store.toJson().forEach(ans::put);
                return ans;
            }
        }
        ans.put("status", "failed");
        return ans;
    }

    public User findUserByEmail(String correo) {
        return UserRepository.findUserByEmail(correo);
    }

    public User findUserByIdentification(String identification) {
        return UserRepository.findUserByIdentification(identification);
    }

    public Store findStoreByEmail(String correo){return StoreRepository.findStoreByEmail(correo);}

    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));

        return UserRepository.save(user);
    }
    public  User deleteUserByEmail(String email){
        return UserRepository.deleteUserByEmail(email);
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
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
    }

    public User getUserById(String id) {return UserRepository.findUserById(id);}
}
