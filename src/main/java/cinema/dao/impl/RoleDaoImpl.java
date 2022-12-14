package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Role getByName(String roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> getByName = session.createQuery(
                    "FROM Role r WHERE r.roleName = :name", Role.class);
            Role.RoleName roleNameEnum = Role.RoleName.valueOf(roleName);
            getByName.setParameter("name", roleNameEnum);
            return getByName.getSingleResult();
        } catch (Exception e) {
            throw new DataProcessingException("Not found shopping cart for user " + roleName, e);
        }
    }
}
