package BoECdemo.webs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BoECdemo.repositories.RoleRepository;
import BoECdemo.repositories.UserRepository;
import BoECdemo.repositories.UtilitiesRepository;

@Service
public class RoleService {
 @Autowired
 private UtilitiesRepository utilitiesRepo;
 @Autowired
 private UserRepository userRepo;
 @Autowired
 private RoleRepository roleRepo;
}
