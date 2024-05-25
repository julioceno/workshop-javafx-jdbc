package org.example.workshopjavafxjdbc.model.dao;

import org.example.workshopjavafxjdbc.db.DB;
import org.example.workshopjavafxjdbc.model.dao.impl.DeparmentDaoJDBC;
import org.example.workshopjavafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DeparmentDaoJDBC(DB.getConnection());
    }
}
