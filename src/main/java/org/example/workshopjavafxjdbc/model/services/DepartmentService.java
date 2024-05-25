package org.example.workshopjavafxjdbc.model.services;

import org.example.workshopjavafxjdbc.model.dao.DaoFactory;
import org.example.workshopjavafxjdbc.model.dao.DepartmentDao;
import org.example.workshopjavafxjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
