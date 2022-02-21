package com.gourianova.binocularvision.service;


import com.gourianova.binocularvision.exception.RoleNotFoundException;
import com.gourianova.binocularvision.model.Role;
import com.gourianova.binocularvision.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepo roleRepo;

    @Autowired
    public RoleService(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    public Role addRole(Role role) {
        return roleRepo.save(role);
    }

    public List<Role> findAllRoles() {
        return roleRepo.findAll();
    }

    public Role updateRole(Role role) {
        return roleRepo.save(role);
    }

    public Role findRoleById(Integer id) {
        return roleRepo.findRoleById(id).
                orElseThrow(() -> new RoleNotFoundException("Role by id" + id + "not found"));

    }

    public void deleteRole(Integer id) {
        roleRepo.deleteRoleById(id);
    }
}
